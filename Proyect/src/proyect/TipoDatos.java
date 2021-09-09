/**
 */
package proyect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.TipoDatos#getTipo <em>Tipo</em>}</li>
 *   <li>{@link proyect.TipoDatos#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getTipoDatos()
 * @model annotation="gmf.node label='Descripcion' figure='rectangle' border.color='6,254,246'"
 * @generated
 */
public interface TipoDatos extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see proyect.ProyectPackage#getTipoDatos_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link proyect.TipoDatos#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see proyect.ProyectPackage#getTipoDatos_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link proyect.TipoDatos#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // TipoDatos
