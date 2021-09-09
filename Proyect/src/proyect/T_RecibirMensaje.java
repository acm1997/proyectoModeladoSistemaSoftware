/**
 */
package proyect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRecibir Mensaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.T_RecibirMensaje#getDatos_Recibir_Mensaje <em>Datos Recibir Mensaje</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getT_RecibirMensaje()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='asociada_no_repetida tarea_siguiente_true'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot asociada_no_repetida='self.ID<>self.tarea_asociada.ID' tarea_siguiente_true='self.tarea_asociada->size()=1'"
 *        annotation="gmf.node label='Nombre' figure='rectangle' border.color='151,9,101'"
 * @generated
 */
public interface T_RecibirMensaje extends Tarea {
	/**
	 * Returns the value of the '<em><b>Datos Recibir Mensaje</b></em>' reference list.
	 * The list contents are of type {@link proyect.Objeto_de_Datos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos Recibir Mensaje</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos Recibir Mensaje</em>' reference list.
	 * @see proyect.ProyectPackage#getT_RecibirMensaje_Datos_Recibir_Mensaje()
	 * @model annotation="gmf.link label='Nombre' source='Tarea' target='Objeto_de_Datos' width='3' style='dash' color='255,035,001' target.decoration='arrow'"
	 * @generated
	 */
	EList<Objeto_de_Datos> getDatos_Recibir_Mensaje();

} // T_RecibirMensaje
