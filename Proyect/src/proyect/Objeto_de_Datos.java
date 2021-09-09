/**
 */
package proyect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objeto de Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.Objeto_de_Datos#getTipodatos <em>Tipodatos</em>}</li>
 *   <li>{@link proyect.Objeto_de_Datos#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getObjeto_de_Datos()
 * @model annotation="gmf.node label='nombre' figure='rectangle' border.color='14,234,220'"
 * @generated
 */
public interface Objeto_de_Datos extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipodatos</b></em>' containment reference list.
	 * The list contents are of type {@link proyect.TipoDatos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipodatos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipodatos</em>' containment reference list.
	 * @see proyect.ProyectPackage#getObjeto_de_Datos_Tipodatos()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<TipoDatos> getTipodatos();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyect.ProyectPackage#getObjeto_de_Datos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyect.Objeto_de_Datos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Objeto_de_Datos
