/**
 */
package proyect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see proyect.ProyectFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ProyectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proyect";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/proyect";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proyect";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectPackage eINSTANCE = proyect.impl.ProyectPackageImpl.init();

	/**
	 * The meta object id for the '{@link proyect.impl.WorkflowsImpl <em>Workflows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.WorkflowsImpl
	 * @see proyect.impl.ProyectPackageImpl#getWorkflows()
	 * @generated
	 */
	int WORKFLOWS = 0;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS__ACTORES = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Workflows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOWS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link proyect.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.ActorImpl
	 * @see proyect.impl.ProyectPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TAREA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link proyect.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.TareaImpl
	 * @see proyect.impl.ProyectPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 2;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__TAREA_ASOCIADA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__ID = 3;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link proyect.impl.Estado_InicialImpl <em>Estado Inicial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.Estado_InicialImpl
	 * @see proyect.impl.ProyectPackageImpl#getEstado_Inicial()
	 * @generated
	 */
	int ESTADO_INICIAL = 3;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_INICIAL__TAREA_ASOCIADA = TAREA__TAREA_ASOCIADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_INICIAL__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_INICIAL__DESCRIPCION = TAREA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_INICIAL__ID = TAREA__ID;

	/**
	 * The number of structural features of the '<em>Estado Inicial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_INICIAL_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyect.impl.T_UsuarioImpl <em>TUsuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.T_UsuarioImpl
	 * @see proyect.impl.ProyectPackageImpl#getT_Usuario()
	 * @generated
	 */
	int TUSUARIO = 4;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSUARIO__TAREA_ASOCIADA = TAREA__TAREA_ASOCIADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSUARIO__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSUARIO__DESCRIPCION = TAREA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSUARIO__ID = TAREA__ID;

	/**
	 * The feature id for the '<em><b>Datos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSUARIO__DATOS = TAREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TUsuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSUARIO_FEATURE_COUNT = TAREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyect.impl.T_ServicioImpl <em>TServicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.T_ServicioImpl
	 * @see proyect.impl.ProyectPackageImpl#getT_Servicio()
	 * @generated
	 */
	int TSERVICIO = 5;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICIO__TAREA_ASOCIADA = TAREA__TAREA_ASOCIADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICIO__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICIO__DESCRIPCION = TAREA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICIO__ID = TAREA__ID;

	/**
	 * The feature id for the '<em><b>Datos servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICIO__DATOS_SERVICIO = TAREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TServicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICIO_FEATURE_COUNT = TAREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyect.impl.T_EnviarMensajeImpl <em>TEnviar Mensaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.T_EnviarMensajeImpl
	 * @see proyect.impl.ProyectPackageImpl#getT_EnviarMensaje()
	 * @generated
	 */
	int TENVIAR_MENSAJE = 6;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENVIAR_MENSAJE__TAREA_ASOCIADA = TAREA__TAREA_ASOCIADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENVIAR_MENSAJE__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENVIAR_MENSAJE__DESCRIPCION = TAREA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENVIAR_MENSAJE__ID = TAREA__ID;

	/**
	 * The feature id for the '<em><b>Datos Enviar Mensaje</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE = TAREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEnviar Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENVIAR_MENSAJE_FEATURE_COUNT = TAREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyect.impl.T_RecibirMensajeImpl <em>TRecibir Mensaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.T_RecibirMensajeImpl
	 * @see proyect.impl.ProyectPackageImpl#getT_RecibirMensaje()
	 * @generated
	 */
	int TRECIBIR_MENSAJE = 7;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECIBIR_MENSAJE__TAREA_ASOCIADA = TAREA__TAREA_ASOCIADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECIBIR_MENSAJE__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECIBIR_MENSAJE__DESCRIPCION = TAREA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECIBIR_MENSAJE__ID = TAREA__ID;

	/**
	 * The feature id for the '<em><b>Datos Recibir Mensaje</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE = TAREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRecibir Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECIBIR_MENSAJE_FEATURE_COUNT = TAREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyect.impl.Estado_FinalImpl <em>Estado Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.Estado_FinalImpl
	 * @see proyect.impl.ProyectPackageImpl#getEstado_Final()
	 * @generated
	 */
	int ESTADO_FINAL = 8;

	/**
	 * The feature id for the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FINAL__TAREA_ASOCIADA = TAREA__TAREA_ASOCIADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FINAL__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FINAL__DESCRIPCION = TAREA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FINAL__ID = TAREA__ID;

	/**
	 * The number of structural features of the '<em>Estado Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FINAL_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyect.impl.Objeto_de_DatosImpl <em>Objeto de Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.Objeto_de_DatosImpl
	 * @see proyect.impl.ProyectPackageImpl#getObjeto_de_Datos()
	 * @generated
	 */
	int OBJETO_DE_DATOS = 9;

	/**
	 * The feature id for the '<em><b>Tipodatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_DE_DATOS__TIPODATOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_DE_DATOS__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Objeto de Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_DE_DATOS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link proyect.impl.TipoDatosImpl <em>Tipo Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyect.impl.TipoDatosImpl
	 * @see proyect.impl.ProyectPackageImpl#getTipoDatos()
	 * @generated
	 */
	int TIPO_DATOS = 10;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATOS__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATOS__DESCRIPCION = 1;

	/**
	 * The number of structural features of the '<em>Tipo Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATOS_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link proyect.Workflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflows</em>'.
	 * @see proyect.Workflows
	 * @generated
	 */
	EClass getWorkflows();

	/**
	 * Returns the meta object for the containment reference list '{@link proyect.Workflows#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actores</em>'.
	 * @see proyect.Workflows#getActores()
	 * @see #getWorkflows()
	 * @generated
	 */
	EReference getWorkflows_Actores();

	/**
	 * Returns the meta object for the attribute '{@link proyect.Workflows#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyect.Workflows#getNombre()
	 * @see #getWorkflows()
	 * @generated
	 */
	EAttribute getWorkflows_Nombre();

	/**
	 * Returns the meta object for class '{@link proyect.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see proyect.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference list '{@link proyect.Actor#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tarea</em>'.
	 * @see proyect.Actor#getTarea()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Tarea();

	/**
	 * Returns the meta object for the attribute '{@link proyect.Actor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyect.Actor#getNombre()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Nombre();

	/**
	 * Returns the meta object for class '{@link proyect.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see proyect.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the reference '{@link proyect.Tarea#getTarea_asociada <em>Tarea asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tarea asociada</em>'.
	 * @see proyect.Tarea#getTarea_asociada()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Tarea_asociada();

	/**
	 * Returns the meta object for the attribute '{@link proyect.Tarea#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyect.Tarea#getNombre()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link proyect.Tarea#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see proyect.Tarea#getDescripcion()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link proyect.Tarea#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see proyect.Tarea#getID()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_ID();

	/**
	 * Returns the meta object for class '{@link proyect.Estado_Inicial <em>Estado Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado Inicial</em>'.
	 * @see proyect.Estado_Inicial
	 * @generated
	 */
	EClass getEstado_Inicial();

	/**
	 * Returns the meta object for class '{@link proyect.T_Usuario <em>TUsuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUsuario</em>'.
	 * @see proyect.T_Usuario
	 * @generated
	 */
	EClass getT_Usuario();

	/**
	 * Returns the meta object for the containment reference list '{@link proyect.T_Usuario#getDatos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datos</em>'.
	 * @see proyect.T_Usuario#getDatos()
	 * @see #getT_Usuario()
	 * @generated
	 */
	EReference getT_Usuario_Datos();

	/**
	 * Returns the meta object for class '{@link proyect.T_Servicio <em>TServicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TServicio</em>'.
	 * @see proyect.T_Servicio
	 * @generated
	 */
	EClass getT_Servicio();

	/**
	 * Returns the meta object for the reference '{@link proyect.T_Servicio#getDatos_servicio <em>Datos servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datos servicio</em>'.
	 * @see proyect.T_Servicio#getDatos_servicio()
	 * @see #getT_Servicio()
	 * @generated
	 */
	EReference getT_Servicio_Datos_servicio();

	/**
	 * Returns the meta object for class '{@link proyect.T_EnviarMensaje <em>TEnviar Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnviar Mensaje</em>'.
	 * @see proyect.T_EnviarMensaje
	 * @generated
	 */
	EClass getT_EnviarMensaje();

	/**
	 * Returns the meta object for the reference list '{@link proyect.T_EnviarMensaje#getDatos_Enviar_Mensaje <em>Datos Enviar Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datos Enviar Mensaje</em>'.
	 * @see proyect.T_EnviarMensaje#getDatos_Enviar_Mensaje()
	 * @see #getT_EnviarMensaje()
	 * @generated
	 */
	EReference getT_EnviarMensaje_Datos_Enviar_Mensaje();

	/**
	 * Returns the meta object for class '{@link proyect.T_RecibirMensaje <em>TRecibir Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRecibir Mensaje</em>'.
	 * @see proyect.T_RecibirMensaje
	 * @generated
	 */
	EClass getT_RecibirMensaje();

	/**
	 * Returns the meta object for the reference list '{@link proyect.T_RecibirMensaje#getDatos_Recibir_Mensaje <em>Datos Recibir Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datos Recibir Mensaje</em>'.
	 * @see proyect.T_RecibirMensaje#getDatos_Recibir_Mensaje()
	 * @see #getT_RecibirMensaje()
	 * @generated
	 */
	EReference getT_RecibirMensaje_Datos_Recibir_Mensaje();

	/**
	 * Returns the meta object for class '{@link proyect.Estado_Final <em>Estado Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado Final</em>'.
	 * @see proyect.Estado_Final
	 * @generated
	 */
	EClass getEstado_Final();

	/**
	 * Returns the meta object for class '{@link proyect.Objeto_de_Datos <em>Objeto de Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto de Datos</em>'.
	 * @see proyect.Objeto_de_Datos
	 * @generated
	 */
	EClass getObjeto_de_Datos();

	/**
	 * Returns the meta object for the containment reference list '{@link proyect.Objeto_de_Datos#getTipodatos <em>Tipodatos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipodatos</em>'.
	 * @see proyect.Objeto_de_Datos#getTipodatos()
	 * @see #getObjeto_de_Datos()
	 * @generated
	 */
	EReference getObjeto_de_Datos_Tipodatos();

	/**
	 * Returns the meta object for the attribute '{@link proyect.Objeto_de_Datos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyect.Objeto_de_Datos#getNombre()
	 * @see #getObjeto_de_Datos()
	 * @generated
	 */
	EAttribute getObjeto_de_Datos_Nombre();

	/**
	 * Returns the meta object for class '{@link proyect.TipoDatos <em>Tipo Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Datos</em>'.
	 * @see proyect.TipoDatos
	 * @generated
	 */
	EClass getTipoDatos();

	/**
	 * Returns the meta object for the attribute '{@link proyect.TipoDatos#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see proyect.TipoDatos#getTipo()
	 * @see #getTipoDatos()
	 * @generated
	 */
	EAttribute getTipoDatos_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link proyect.TipoDatos#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see proyect.TipoDatos#getDescripcion()
	 * @see #getTipoDatos()
	 * @generated
	 */
	EAttribute getTipoDatos_Descripcion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectFactory getProyectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link proyect.impl.WorkflowsImpl <em>Workflows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.WorkflowsImpl
		 * @see proyect.impl.ProyectPackageImpl#getWorkflows()
		 * @generated
		 */
		EClass WORKFLOWS = eINSTANCE.getWorkflows();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOWS__ACTORES = eINSTANCE.getWorkflows_Actores();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOWS__NOMBRE = eINSTANCE.getWorkflows_Nombre();

		/**
		 * The meta object literal for the '{@link proyect.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.ActorImpl
		 * @see proyect.impl.ProyectPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__TAREA = eINSTANCE.getActor_Tarea();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NOMBRE = eINSTANCE.getActor_Nombre();

		/**
		 * The meta object literal for the '{@link proyect.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.TareaImpl
		 * @see proyect.impl.ProyectPackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Tarea asociada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__TAREA_ASOCIADA = eINSTANCE.getTarea_Tarea_asociada();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NOMBRE = eINSTANCE.getTarea_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__DESCRIPCION = eINSTANCE.getTarea_Descripcion();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__ID = eINSTANCE.getTarea_ID();

		/**
		 * The meta object literal for the '{@link proyect.impl.Estado_InicialImpl <em>Estado Inicial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.Estado_InicialImpl
		 * @see proyect.impl.ProyectPackageImpl#getEstado_Inicial()
		 * @generated
		 */
		EClass ESTADO_INICIAL = eINSTANCE.getEstado_Inicial();

		/**
		 * The meta object literal for the '{@link proyect.impl.T_UsuarioImpl <em>TUsuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.T_UsuarioImpl
		 * @see proyect.impl.ProyectPackageImpl#getT_Usuario()
		 * @generated
		 */
		EClass TUSUARIO = eINSTANCE.getT_Usuario();

		/**
		 * The meta object literal for the '<em><b>Datos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUSUARIO__DATOS = eINSTANCE.getT_Usuario_Datos();

		/**
		 * The meta object literal for the '{@link proyect.impl.T_ServicioImpl <em>TServicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.T_ServicioImpl
		 * @see proyect.impl.ProyectPackageImpl#getT_Servicio()
		 * @generated
		 */
		EClass TSERVICIO = eINSTANCE.getT_Servicio();

		/**
		 * The meta object literal for the '<em><b>Datos servicio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICIO__DATOS_SERVICIO = eINSTANCE.getT_Servicio_Datos_servicio();

		/**
		 * The meta object literal for the '{@link proyect.impl.T_EnviarMensajeImpl <em>TEnviar Mensaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.T_EnviarMensajeImpl
		 * @see proyect.impl.ProyectPackageImpl#getT_EnviarMensaje()
		 * @generated
		 */
		EClass TENVIAR_MENSAJE = eINSTANCE.getT_EnviarMensaje();

		/**
		 * The meta object literal for the '<em><b>Datos Enviar Mensaje</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE = eINSTANCE.getT_EnviarMensaje_Datos_Enviar_Mensaje();

		/**
		 * The meta object literal for the '{@link proyect.impl.T_RecibirMensajeImpl <em>TRecibir Mensaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.T_RecibirMensajeImpl
		 * @see proyect.impl.ProyectPackageImpl#getT_RecibirMensaje()
		 * @generated
		 */
		EClass TRECIBIR_MENSAJE = eINSTANCE.getT_RecibirMensaje();

		/**
		 * The meta object literal for the '<em><b>Datos Recibir Mensaje</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE = eINSTANCE.getT_RecibirMensaje_Datos_Recibir_Mensaje();

		/**
		 * The meta object literal for the '{@link proyect.impl.Estado_FinalImpl <em>Estado Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.Estado_FinalImpl
		 * @see proyect.impl.ProyectPackageImpl#getEstado_Final()
		 * @generated
		 */
		EClass ESTADO_FINAL = eINSTANCE.getEstado_Final();

		/**
		 * The meta object literal for the '{@link proyect.impl.Objeto_de_DatosImpl <em>Objeto de Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.Objeto_de_DatosImpl
		 * @see proyect.impl.ProyectPackageImpl#getObjeto_de_Datos()
		 * @generated
		 */
		EClass OBJETO_DE_DATOS = eINSTANCE.getObjeto_de_Datos();

		/**
		 * The meta object literal for the '<em><b>Tipodatos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJETO_DE_DATOS__TIPODATOS = eINSTANCE.getObjeto_de_Datos_Tipodatos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJETO_DE_DATOS__NOMBRE = eINSTANCE.getObjeto_de_Datos_Nombre();

		/**
		 * The meta object literal for the '{@link proyect.impl.TipoDatosImpl <em>Tipo Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyect.impl.TipoDatosImpl
		 * @see proyect.impl.ProyectPackageImpl#getTipoDatos()
		 * @generated
		 */
		EClass TIPO_DATOS = eINSTANCE.getTipoDatos();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_DATOS__TIPO = eINSTANCE.getTipoDatos_Tipo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_DATOS__DESCRIPCION = eINSTANCE.getTipoDatos_Descripcion();

	}

} //ProyectPackage
