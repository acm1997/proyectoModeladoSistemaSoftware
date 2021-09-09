/**
 */
package proyect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TUsuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.T_Usuario#getDatos <em>Datos</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getT_Usuario()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='asociada_no_repetida tarea_siguiente_true'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot asociada_no_repetida='self.ID<>self.tarea_asociada.ID' tarea_siguiente_true='self.tarea_asociada->size()=1'"
 *        annotation="gmf.node figure='rectangle' label='Nombre' border.color='14,47,234'"
 * @generated
 */
public interface T_Usuario extends Tarea {
	/**
	 * Returns the value of the '<em><b>Datos</b></em>' containment reference list.
	 * The list contents are of type {@link proyect.Objeto_de_Datos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos</em>' containment reference list.
	 * @see proyect.ProyectPackage#getT_Usuario_Datos()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Objeto_de_Datos> getDatos();

} // T_Usuario
