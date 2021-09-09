/**
 */
package proyect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEnviar Mensaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.T_EnviarMensaje#getDatos_Enviar_Mensaje <em>Datos Enviar Mensaje</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getT_EnviarMensaje()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sig_tarea_recibMsg distinto_actores'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sig_tarea_recibMsg='self.tarea_asociada->selectByType(T_RecibirMensaje)->size()=1' distinto_actores='self.oclContainer()<>self.tarea_asociada.oclContainer'"
 *        annotation="gmf.node label='Nombre' figure='rectangle' border.color='254,6,167'"
 * @generated
 */
public interface T_EnviarMensaje extends Tarea {
	/**
	 * Returns the value of the '<em><b>Datos Enviar Mensaje</b></em>' reference list.
	 * The list contents are of type {@link proyect.Objeto_de_Datos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos Enviar Mensaje</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos Enviar Mensaje</em>' reference list.
	 * @see proyect.ProyectPackage#getT_EnviarMensaje_Datos_Enviar_Mensaje()
	 * @model annotation="gmf.link label='Nombre' source='Tarea' target='Objeto_de_Datos' width='3' style='dash' color='255,035,001' target.decoration='arrow'"
	 * @generated
	 */
	EList<Objeto_de_Datos> getDatos_Enviar_Mensaje();

} // T_EnviarMensaje
