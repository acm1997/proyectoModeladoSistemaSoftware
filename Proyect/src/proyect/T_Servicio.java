/**
 */
package proyect;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TServicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.T_Servicio#getDatos_servicio <em>Datos servicio</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getT_Servicio()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='asociada_no_repetida tarea_siguiente_true'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot asociada_no_repetida='self.ID<>self.tarea_asociada.ID' tarea_siguiente_true='self.tarea_asociada->size()=1'"
 *        annotation="gmf.node label='Nombre' figure='rectangle' border.color='254,254,6'"
 * @generated
 */
public interface T_Servicio extends Tarea {
	/**
	 * Returns the value of the '<em><b>Datos servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos servicio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos servicio</em>' reference.
	 * @see #setDatos_servicio(Objeto_de_Datos)
	 * @see proyect.ProyectPackage#getT_Servicio_Datos_servicio()
	 * @model annotation="gmf.link label='Nombre' source='Tarea' target='Objeto_de_Datos' width='3' style='dash' color='255,035,001' target.decoration='arrow'"
	 * @generated
	 */
	Objeto_de_Datos getDatos_servicio();

	/**
	 * Sets the value of the '{@link proyect.T_Servicio#getDatos_servicio <em>Datos servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datos servicio</em>' reference.
	 * @see #getDatos_servicio()
	 * @generated
	 */
	void setDatos_servicio(Objeto_de_Datos value);

} // T_Servicio
