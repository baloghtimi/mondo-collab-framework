/**
 */
package gyak.model.webpage;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Articles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gyak.model.webpage.Articles#getName <em>Name</em>}</li>
 *   <li>{@link gyak.model.webpage.Articles#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 * @see gyak.model.webpage.WebpagePackage#getArticles()
 * @model
 * @generated
 */
public interface Articles extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gyak.model.webpage.WebpagePackage#getArticles_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gyak.model.webpage.Articles#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Calendar)
	 * @see gyak.model.webpage.WebpagePackage#getArticles_Created()
	 * @model dataType="gyak.model.webpage.calendar"
	 * @generated
	 */
	Calendar getCreated();

	/**
	 * Sets the value of the '{@link gyak.model.webpage.Articles#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Calendar value);

} // Articles
