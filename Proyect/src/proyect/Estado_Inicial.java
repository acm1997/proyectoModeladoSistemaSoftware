/**
 */
package proyect;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado Inicial</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proyect.ProyectPackage#getEstado_Inicial()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='asociada_no_repetida tarea_siguiente_true'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot asociada_no_repetida='self.ID<>self.tarea_asociada.ID' tarea_siguiente_true='self.tarea_asociada->size()=1'"
 *        annotation="gmf.node figure='svg' label='Nombre' svg.uri='platform:/plugin/Proyect/model/img/circulo.svg'"
 * @generated
 */
public interface Estado_Inicial extends Tarea {
} // Estado_Inicial
