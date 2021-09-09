/**
 */
package proyect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see proyect.ProyectPackage
 * @generated
 */
public interface ProyectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectFactory eINSTANCE = proyect.impl.ProyectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflows</em>'.
	 * @generated
	 */
	Workflows createWorkflows();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Estado Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estado Inicial</em>'.
	 * @generated
	 */
	Estado_Inicial createEstado_Inicial();

	/**
	 * Returns a new object of class '<em>TUsuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TUsuario</em>'.
	 * @generated
	 */
	T_Usuario createT_Usuario();

	/**
	 * Returns a new object of class '<em>TServicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TServicio</em>'.
	 * @generated
	 */
	T_Servicio createT_Servicio();

	/**
	 * Returns a new object of class '<em>TEnviar Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEnviar Mensaje</em>'.
	 * @generated
	 */
	T_EnviarMensaje createT_EnviarMensaje();

	/**
	 * Returns a new object of class '<em>TRecibir Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRecibir Mensaje</em>'.
	 * @generated
	 */
	T_RecibirMensaje createT_RecibirMensaje();

	/**
	 * Returns a new object of class '<em>Estado Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estado Final</em>'.
	 * @generated
	 */
	Estado_Final createEstado_Final();

	/**
	 * Returns a new object of class '<em>Objeto de Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objeto de Datos</em>'.
	 * @generated
	 */
	Objeto_de_Datos createObjeto_de_Datos();

	/**
	 * Returns a new object of class '<em>Tipo Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Datos</em>'.
	 * @generated
	 */
	TipoDatos createTipoDatos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProyectPackage getProyectPackage();

} //ProyectFactory
