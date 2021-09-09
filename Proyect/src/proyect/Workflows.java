/**
 */
package proyect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.Workflows#getActores <em>Actores</em>}</li>
 *   <li>{@link proyect.Workflows#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getWorkflows()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='workflow_inicio_unico workflow_final_unico'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot workflow_inicio_unico='self.actores.tarea->selectByType(Estado_Inicial)->size()=1' workflow_final_unico='self.actores.tarea->selectByType(Estado_Final)->size()=1'"
 * @generated
 */
public interface Workflows extends EObject {
	/**
	 * Returns the value of the '<em><b>Actores</b></em>' containment reference list.
	 * The list contents are of type {@link proyect.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' containment reference list.
	 * @see proyect.ProyectPackage#getWorkflows_Actores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actor> getActores();

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
	 * @see proyect.ProyectPackage#getWorkflows_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyect.Workflows#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Workflows
