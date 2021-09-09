/**
 */
package proyect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import proyect.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectFactoryImpl extends EFactoryImpl implements ProyectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProyectFactory init() {
		try {
			ProyectFactory theProyectFactory = (ProyectFactory)EPackage.Registry.INSTANCE.getEFactory(ProyectPackage.eNS_URI);
			if (theProyectFactory != null) {
				return theProyectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProyectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProyectPackage.WORKFLOWS: return createWorkflows();
			case ProyectPackage.ACTOR: return createActor();
			case ProyectPackage.ESTADO_INICIAL: return createEstado_Inicial();
			case ProyectPackage.TUSUARIO: return createT_Usuario();
			case ProyectPackage.TSERVICIO: return createT_Servicio();
			case ProyectPackage.TENVIAR_MENSAJE: return createT_EnviarMensaje();
			case ProyectPackage.TRECIBIR_MENSAJE: return createT_RecibirMensaje();
			case ProyectPackage.ESTADO_FINAL: return createEstado_Final();
			case ProyectPackage.OBJETO_DE_DATOS: return createObjeto_de_Datos();
			case ProyectPackage.TIPO_DATOS: return createTipoDatos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflows createWorkflows() {
		WorkflowsImpl workflows = new WorkflowsImpl();
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado_Inicial createEstado_Inicial() {
		Estado_InicialImpl estado_Inicial = new Estado_InicialImpl();
		return estado_Inicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Usuario createT_Usuario() {
		T_UsuarioImpl t_Usuario = new T_UsuarioImpl();
		return t_Usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Servicio createT_Servicio() {
		T_ServicioImpl t_Servicio = new T_ServicioImpl();
		return t_Servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_EnviarMensaje createT_EnviarMensaje() {
		T_EnviarMensajeImpl t_EnviarMensaje = new T_EnviarMensajeImpl();
		return t_EnviarMensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_RecibirMensaje createT_RecibirMensaje() {
		T_RecibirMensajeImpl t_RecibirMensaje = new T_RecibirMensajeImpl();
		return t_RecibirMensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado_Final createEstado_Final() {
		Estado_FinalImpl estado_Final = new Estado_FinalImpl();
		return estado_Final;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto_de_Datos createObjeto_de_Datos() {
		Objeto_de_DatosImpl objeto_de_Datos = new Objeto_de_DatosImpl();
		return objeto_de_Datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDatos createTipoDatos() {
		TipoDatosImpl tipoDatos = new TipoDatosImpl();
		return tipoDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectPackage getProyectPackage() {
		return (ProyectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProyectPackage getPackage() {
		return ProyectPackage.eINSTANCE;
	}

} //ProyectFactoryImpl
