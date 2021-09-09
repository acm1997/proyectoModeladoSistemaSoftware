/**
 */
package proyect.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import proyect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see proyect.ProyectPackage
 * @generated
 */
public class ProyectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProyectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProyectSwitch<Adapter> modelSwitch =
		new ProyectSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflows(Workflows object) {
				return createWorkflowsAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseTarea(Tarea object) {
				return createTareaAdapter();
			}
			@Override
			public Adapter caseEstado_Inicial(Estado_Inicial object) {
				return createEstado_InicialAdapter();
			}
			@Override
			public Adapter caseT_Usuario(T_Usuario object) {
				return createT_UsuarioAdapter();
			}
			@Override
			public Adapter caseT_Servicio(T_Servicio object) {
				return createT_ServicioAdapter();
			}
			@Override
			public Adapter caseT_EnviarMensaje(T_EnviarMensaje object) {
				return createT_EnviarMensajeAdapter();
			}
			@Override
			public Adapter caseT_RecibirMensaje(T_RecibirMensaje object) {
				return createT_RecibirMensajeAdapter();
			}
			@Override
			public Adapter caseEstado_Final(Estado_Final object) {
				return createEstado_FinalAdapter();
			}
			@Override
			public Adapter caseObjeto_de_Datos(Objeto_de_Datos object) {
				return createObjeto_de_DatosAdapter();
			}
			@Override
			public Adapter caseTipoDatos(TipoDatos object) {
				return createTipoDatosAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link proyect.Workflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.Workflows
	 * @generated
	 */
	public Adapter createWorkflowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.Tarea
	 * @generated
	 */
	public Adapter createTareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.Estado_Inicial <em>Estado Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.Estado_Inicial
	 * @generated
	 */
	public Adapter createEstado_InicialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.T_Usuario <em>TUsuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.T_Usuario
	 * @generated
	 */
	public Adapter createT_UsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.T_Servicio <em>TServicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.T_Servicio
	 * @generated
	 */
	public Adapter createT_ServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.T_EnviarMensaje <em>TEnviar Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.T_EnviarMensaje
	 * @generated
	 */
	public Adapter createT_EnviarMensajeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.T_RecibirMensaje <em>TRecibir Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.T_RecibirMensaje
	 * @generated
	 */
	public Adapter createT_RecibirMensajeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.Estado_Final <em>Estado Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.Estado_Final
	 * @generated
	 */
	public Adapter createEstado_FinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.Objeto_de_Datos <em>Objeto de Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.Objeto_de_Datos
	 * @generated
	 */
	public Adapter createObjeto_de_DatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyect.TipoDatos <em>Tipo Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyect.TipoDatos
	 * @generated
	 */
	public Adapter createTipoDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProyectAdapterFactory
