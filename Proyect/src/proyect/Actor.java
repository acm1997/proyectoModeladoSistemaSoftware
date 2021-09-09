/**
 */
package proyect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.Actor#getTarea <em>Tarea</em>}</li>
 *   <li>{@link proyect.Actor#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getActor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min_una_tarea'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot min_una_tarea='self.tarea->size()>0'"
 *        annotation="gmf.node figure='rectangle' label='Nombre' border.color='37,234,14'"
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' containment reference list.
	 * The list contents are of type {@link proyect.Tarea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' containment reference list.
	 * @see proyect.ProyectPackage#getActor_Tarea()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Tarea> getTarea();

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
	 * @see proyect.ProyectPackage#getActor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyect.Actor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Actor
