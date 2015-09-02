package org.mondo.collaboration.online.client.application;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;

@StyleSheet({ 
	"app://VAADIN/client/MondoOnline.css" 
})
public class SessionSelectionPage extends AbsoluteLayout implements View {
	
    public static final String NAME = "SessionSelection";
    
	private Navigator navigator;

	private Application application;

	private List<CollaborationSession> sessions;
	
	private JSONArray availableModels;
	
	public SessionSelectionPage(final Navigator navigator, Application application) {
		System.out.println("Construct SessionSelectionPage");
		this.application = application;
		this.sessions = new ArrayList<CollaborationSession>();
		this.navigator = navigator;
		setSizeFull();
	}
	
	private void loadSessions() {
		this.application.getWebsocketClient().loadAvailableSessions();
	}

	public void setSessionsList(JSONArray jsonSessions) {
		this.sessions.clear();
		try {
			for(int i = 0; i < jsonSessions.length(); i++) {
				CollaborationSession newSession = new CollaborationSession(
					jsonSessions.getJSONObject(i).getString("id"),
					jsonSessions.getJSONObject(i).getString("title"),
					jsonSessions.getJSONObject(i).getInt("state")
				);
				this.sessions.add(newSession);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		this.updateSessionsView();
	}

	private void updateSessionsView() {
		this.application.getUI().getSession().lock();
		try {
			this.removeAllComponents();
		} finally {
			this.application.getUI().getSession().unlock();
		}

		this.initSessionsView();
		// Panel sessionSelection = this.initSessionsView();
		//addComponent(sessionSelection); //, "left: 10px; top: 40px;");
		
	}
	private Panel initSessionsView() {
		Panel panel = new Panel();
		panel.setSizeFull();
		addComponent(panel, "left: 20px; top: 20px;");

		CustomLayout custom = new CustomLayout("sessionSelectionPage");
		
		Table sessionsTable = new Table();
		sessionsTable.setSizeFull();
		sessionsTable.setHeight("300px");
		sessionsTable.addContainerProperty("ID",  String.class, null);
		sessionsTable.addContainerProperty("Name", String.class, null);
		sessionsTable.addContainerProperty("State", String.class, null);
		sessionsTable.setSelectable(true);
		
		int rowNum = 2;
		for(CollaborationSession s: this.sessions) {
			String state = CollaborationSession.getSessionStateString(s.getState());
			sessionsTable.addItem(new Object[]{
				s.getId(), 
				s.getTitle(), 
				state
				}, rowNum
			);
			rowNum++;
		}

		custom.addComponent(sessionsTable, "sessionsTable");
		Button buttonLogout = new Button("Log out"); 
		Button buttonJoinSession = new Button("Join session");
		Button buttonStartSession = new Button("Start session");
		Button buttonFinishSession = new Button("Finish session");
		
		buttonLogout.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				logout();
			}
		});
		buttonJoinSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Object rowId = sessionsTable.getValue();
				if(rowId != null) {
					String sessionId = ((String) sessionsTable.getContainerProperty(rowId, "ID").getValue());
					int state = CollaborationSession.getSessionStateByString(
						(String) sessionsTable.getContainerProperty(rowId, "State").getValue()
					);
					if(state == CollaborationSession.STATE_OPEN) {
						String title = (String) sessionsTable.getContainerProperty(rowId, "Name").getValue();
						joinSession(sessionId, title);
					} else {
						Notification.show("Selected session is closed.");
					}
				} else {
					Notification.show("Please select a session");
				}
			}
		});
		buttonStartSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigateToStartNewSessionPage();
//				Object rowId = sessionsTable.getValue();
//				if(rowId != null) {
//					String sessionId = ((String) sessionsTable.getContainerProperty(rowId, "ID").getValue());
//					int state = CollaborationSession.getSessionStateByString(
//						(String) sessionsTable.getContainerProperty(rowId, "State").getValue()
//					);
//					if(state == CollaborationSession.STATE_READY) {
//						application.getUser().addSessionId(sessionId);
//						startSession(sessionId);
//					} else {
//						Notification.show("Selected session is not in closed state.");
//					}
//				} else {
//					Notification.show("Please select a session");
//				}
			}
		});
		buttonFinishSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Object rowId = sessionsTable.getValue();
				if(rowId != null) {
					String sessionId = ((String) sessionsTable.getContainerProperty(rowId, "ID").getValue());
					if(!application.getUser().leadsSession(sessionId)) {
						Notification.show("Only its leader may finish a session.");
						return;
					}
					int state = CollaborationSession.getSessionStateByString(
						(String) sessionsTable.getContainerProperty(rowId, "State").getValue()
					);
					if(state == CollaborationSession.STATE_OPEN) {
						finishSession(sessionId);
					} else {
						Notification.show("Selected session is not in open state.");
					}
				} else {
					Notification.show("Please select a session");
				}
			}
		});
		custom.addComponent(buttonLogout, "buttonLogout");
		custom.addComponent(buttonJoinSession, "buttonJoinSession");
		custom.addComponent(buttonStartSession, "buttonStartSession");
		custom.addComponent(buttonFinishSession, "buttonFinishSession");

		panel.setContent(custom);	
		return panel;
	}
	
	protected void finishSession(String sessionId) {
		this.application.getWebsocketClient().finishSession(
			sessionId
		);
	}

	protected void startSession(String sessionId) {
		this.application.getWebsocketClient().startSession(
			sessionId
		);
	}

	protected void joinSession(String sessionId, String title) {
		this.application.initCollaborationPage();
		this.application.getWebsocketClient().joinSession(
			this.application.getUser(), 
			sessionId
		);
		this.application.getCollaborationPage().setSessionId(sessionId);
		this.application.getCollaborationPage().setTitle(title);
		this.navigator.navigateTo(CollaborationPage.NAME);
	}

	private void logout() {
		this.application.unbindUser();
		this.navigator.navigateTo(LoginPage.NAME);
	}
	
	private void navigateToStartNewSessionPage() {
		this.navigator.navigateTo(StartNewSessionPage.NAME);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		this.loadSessions();
	}
}
