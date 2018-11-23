package org.mondo.collaboration.security.mpbl.client.ui.wizards;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.viatra.query.patternlanguage.emf.vql.ClassType;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Parameter;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Variable;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.ui.editor.XbaseEditor;
import org.mondo.collaboration.security.mpbl.client.ui.ImageDescriptorCollection;

import swing2swt.layout.BorderLayout;

public class MondoPublishLockDefinitionWizardPage extends WizardPage {

    private TreeViewer tree;
    private PatternModel model;
    private String description;
    
    /**
     * Create the wizard.
     */
    public MondoPublishLockDefinitionWizardPage() {
        super("MondoPublishPage");
        setTitle("Publish Lock Definition");
        setDescription("This page summarizes the selected lock definitions to be published");
        setImageDescriptor(ImageDescriptorCollection.MONDO_LOGO_64);
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    @SuppressWarnings("restriction")
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        setControl(container);
        container.setLayout(new BorderLayout(0, 0));

        Composite composite = new Composite(container, SWT.NONE);
        composite.setLayoutData(BorderLayout.NORTH);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        
        GridLayout layout = new GridLayout();
        composite.setLayout(layout);
        layout.numColumns = 2;
        
        Label desc = new Label(composite, SWT.RIGHT);
        desc.setText("Description");
        
        Text descField = new Text(composite, SWT.None);
        descField.addModifyListener(new ModifyListener() {
            
            @Override
            public void modifyText(ModifyEvent e) {
                description = descField.getText();
            }
        });
        
        descField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        tree = new TreeViewer(container, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        tree.setContentProvider(new PatternContentProvider());
        tree.setLabelProvider(new PatternLabelProvider());
        tree.expandAll();

        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

        if (editor instanceof XbaseEditor) {
            XbaseEditor xeditor = (XbaseEditor) editor;
            IXtextDocument document = xeditor.getDocument();
            Object root = document.readOnly(new IUnitOfWork<Object, XtextResource>() {

                @Override
                public Object exec(XtextResource state) throws Exception {
                    return state.getContents().get(0);
                }

            });
            if (root != null && root instanceof PatternModel) {
                model = (PatternModel) root;
                if(model.getPatterns().isEmpty())
                    setPageComplete(false);
                else
                    setPageComplete(true);
                tree.setInput(root);
            }
        }
    }
    
    private class PatternContentProvider implements ITreeContentProvider {

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof PatternModel) {
                PatternModel model = (PatternModel) inputElement;
                return model.getPatterns().toArray();
            }
            if (inputElement instanceof Pattern) {
                Pattern pattern = (Pattern) inputElement;
                return pattern.getParameters().toArray();
            }
            return null;
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof PatternModel) {
                PatternModel model = (PatternModel) parentElement;
                return model.getPatterns().toArray();
            }
            if (parentElement instanceof Pattern) {
                Pattern pattern = (Pattern) parentElement;
                return pattern.getParameters().toArray();
            }
            return null;
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof Pattern) {
                Pattern pattern = (Pattern) element;
                return pattern.eContainer();
            }
            if (element instanceof Parameter) {
                return ((Parameter) element).eContainer();

            }
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof PatternModel) {
                PatternModel model = (PatternModel) element;
                return !model.getPatterns().isEmpty();
            }
            if (element instanceof Pattern) {
                Pattern pattern = (Pattern) element;
                return !pattern.getParameters().isEmpty();
            }
            return false;
        }

    }

    private class PatternLabelProvider extends LabelProvider {
        @Override
        public String getText(Object element) {
            if (element instanceof Pattern) {
                Pattern pattern = (Pattern) element;
                return pattern.getName();
            }
            if (element instanceof Variable) {
                Variable variable = (Variable) element;
                return variable.getName() + "(" + getTypeName(variable) + ")";
            }
            return super.getText(element);
        }

        private String getTypeName(Variable variable) {
            if(variable.getType() instanceof ClassType)
                return ((ClassType)variable.getType()).getClassname().getName();
            return variable.getType().getTypename();
        }
    }

    public PatternModel getModel() {
        return model;
    }
    
    public String getDesc() {
        return description;
    }
}
