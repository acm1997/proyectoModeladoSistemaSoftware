/**
 */
package proyect.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import proyect.Actor;
import proyect.Estado_Final;
import proyect.Estado_Inicial;
import proyect.Objeto_de_Datos;
import proyect.ProyectFactory;
import proyect.ProyectPackage;
import proyect.T_EnviarMensaje;
import proyect.T_RecibirMensaje;
import proyect.T_Servicio;
import proyect.T_Usuario;
import proyect.Tarea;
import proyect.TipoDatos;
import proyect.Workflows;

import proyect.util.ProyectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectPackageImpl extends EPackageImpl implements ProyectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estado_InicialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_UsuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ServicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_EnviarMensajeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_RecibirMensajeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estado_FinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objeto_de_DatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoDatosEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see proyect.ProyectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectPackageImpl() {
		super(eNS_URI, ProyectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProyectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectPackage init() {
		if (isInited) return (ProyectPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectPackage.eNS_URI);

		// Obtain or create and register package
		ProyectPackageImpl theProyectPackage = (ProyectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProyectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProyectPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProyectPackage.createPackageContents();

		// Initialize created meta-data
		theProyectPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theProyectPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ProyectValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProyectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectPackage.eNS_URI, theProyectPackage);
		return theProyectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflows() {
		return workflowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflows_Actores() {
		return (EReference)workflowsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflows_Nombre() {
		return (EAttribute)workflowsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Tarea() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Nombre() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarea() {
		return tareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Tarea_asociada() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Nombre() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Descripcion() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_ID() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstado_Inicial() {
		return estado_InicialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Usuario() {
		return t_UsuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_Usuario_Datos() {
		return (EReference)t_UsuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Servicio() {
		return t_ServicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_Servicio_Datos_servicio() {
		return (EReference)t_ServicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_EnviarMensaje() {
		return t_EnviarMensajeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_EnviarMensaje_Datos_Enviar_Mensaje() {
		return (EReference)t_EnviarMensajeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_RecibirMensaje() {
		return t_RecibirMensajeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_RecibirMensaje_Datos_Recibir_Mensaje() {
		return (EReference)t_RecibirMensajeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstado_Final() {
		return estado_FinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjeto_de_Datos() {
		return objeto_de_DatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjeto_de_Datos_Tipodatos() {
		return (EReference)objeto_de_DatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjeto_de_Datos_Nombre() {
		return (EAttribute)objeto_de_DatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoDatos() {
		return tipoDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoDatos_Tipo() {
		return (EAttribute)tipoDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoDatos_Descripcion() {
		return (EAttribute)tipoDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectFactory getProyectFactory() {
		return (ProyectFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowsEClass = createEClass(WORKFLOWS);
		createEReference(workflowsEClass, WORKFLOWS__ACTORES);
		createEAttribute(workflowsEClass, WORKFLOWS__NOMBRE);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__TAREA);
		createEAttribute(actorEClass, ACTOR__NOMBRE);

		tareaEClass = createEClass(TAREA);
		createEReference(tareaEClass, TAREA__TAREA_ASOCIADA);
		createEAttribute(tareaEClass, TAREA__NOMBRE);
		createEAttribute(tareaEClass, TAREA__DESCRIPCION);
		createEAttribute(tareaEClass, TAREA__ID);

		estado_InicialEClass = createEClass(ESTADO_INICIAL);

		t_UsuarioEClass = createEClass(TUSUARIO);
		createEReference(t_UsuarioEClass, TUSUARIO__DATOS);

		t_ServicioEClass = createEClass(TSERVICIO);
		createEReference(t_ServicioEClass, TSERVICIO__DATOS_SERVICIO);

		t_EnviarMensajeEClass = createEClass(TENVIAR_MENSAJE);
		createEReference(t_EnviarMensajeEClass, TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE);

		t_RecibirMensajeEClass = createEClass(TRECIBIR_MENSAJE);
		createEReference(t_RecibirMensajeEClass, TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE);

		estado_FinalEClass = createEClass(ESTADO_FINAL);

		objeto_de_DatosEClass = createEClass(OBJETO_DE_DATOS);
		createEReference(objeto_de_DatosEClass, OBJETO_DE_DATOS__TIPODATOS);
		createEAttribute(objeto_de_DatosEClass, OBJETO_DE_DATOS__NOMBRE);

		tipoDatosEClass = createEClass(TIPO_DATOS);
		createEAttribute(tipoDatosEClass, TIPO_DATOS__TIPO);
		createEAttribute(tipoDatosEClass, TIPO_DATOS__DESCRIPCION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		estado_InicialEClass.getESuperTypes().add(this.getTarea());
		t_UsuarioEClass.getESuperTypes().add(this.getTarea());
		t_ServicioEClass.getESuperTypes().add(this.getTarea());
		t_EnviarMensajeEClass.getESuperTypes().add(this.getTarea());
		t_RecibirMensajeEClass.getESuperTypes().add(this.getTarea());
		estado_FinalEClass.getESuperTypes().add(this.getTarea());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowsEClass, Workflows.class, "Workflows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflows_Actores(), this.getActor(), null, "actores", null, 1, -1, Workflows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflows_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Workflows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Tarea(), this.getTarea(), null, "tarea", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEClass, Tarea.class, "Tarea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarea_Tarea_asociada(), this.getTarea(), null, "tarea_asociada", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estado_InicialEClass, Estado_Inicial.class, "Estado_Inicial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(t_UsuarioEClass, T_Usuario.class, "T_Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_Usuario_Datos(), this.getObjeto_de_Datos(), null, "datos", null, 0, -1, T_Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_ServicioEClass, T_Servicio.class, "T_Servicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_Servicio_Datos_servicio(), this.getObjeto_de_Datos(), null, "datos_servicio", null, 0, 1, T_Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_EnviarMensajeEClass, T_EnviarMensaje.class, "T_EnviarMensaje", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_EnviarMensaje_Datos_Enviar_Mensaje(), this.getObjeto_de_Datos(), null, "datos_Enviar_Mensaje", null, 0, -1, T_EnviarMensaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_RecibirMensajeEClass, T_RecibirMensaje.class, "T_RecibirMensaje", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_RecibirMensaje_Datos_Recibir_Mensaje(), this.getObjeto_de_Datos(), null, "datos_Recibir_Mensaje", null, 0, -1, T_RecibirMensaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estado_FinalEClass, Estado_Final.class, "Estado_Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objeto_de_DatosEClass, Objeto_de_Datos.class, "Objeto_de_Datos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjeto_de_Datos_Tipodatos(), this.getTipoDatos(), null, "tipodatos", null, 1, -1, Objeto_de_Datos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjeto_de_Datos_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Objeto_de_Datos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoDatosEClass, TipoDatos.class, "TipoDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoDatos_Tipo(), ecorePackage.getEString(), "Tipo", null, 0, 1, TipoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoDatos_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, TipoDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (workflowsEClass, 
		   source, 
		   new String[] {
			 "constraints", "workflow_inicio_unico workflow_final_unico"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "constraints", "min_una_tarea"
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "constraints", "tarea_inicio"
		   });	
		addAnnotation
		  (estado_InicialEClass, 
		   source, 
		   new String[] {
			 "constraints", "asociada_no_repetida tarea_siguiente_true"
		   });	
		addAnnotation
		  (t_UsuarioEClass, 
		   source, 
		   new String[] {
			 "constraints", "asociada_no_repetida tarea_siguiente_true"
		   });	
		addAnnotation
		  (t_ServicioEClass, 
		   source, 
		   new String[] {
			 "constraints", "asociada_no_repetida tarea_siguiente_true"
		   });	
		addAnnotation
		  (t_EnviarMensajeEClass, 
		   source, 
		   new String[] {
			 "constraints", "sig_tarea_recibMsg distinto_actores"
		   });	
		addAnnotation
		  (t_RecibirMensajeEClass, 
		   source, 
		   new String[] {
			 "constraints", "asociada_no_repetida tarea_siguiente_true"
		   });	
		addAnnotation
		  (estado_FinalEClass, 
		   source, 
		   new String[] {
			 "constraints", "tarea_final"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (workflowsEClass, 
		   source, 
		   new String[] {
			 "workflow_inicio_unico", "self.actores.tarea->selectByType(Estado_Inicial)->size()=1",
			 "workflow_final_unico", "self.actores.tarea->selectByType(Estado_Final)->size()=1"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "min_una_tarea", "self.tarea->size()>0"
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "tarea_inicio", "self.tarea_asociada->selectByType(Estado_Inicial)->size()=0"
		   });	
		addAnnotation
		  (estado_InicialEClass, 
		   source, 
		   new String[] {
			 "asociada_no_repetida", "self.ID<>self.tarea_asociada.ID",
			 "tarea_siguiente_true", "self.tarea_asociada->size()=1"
		   });	
		addAnnotation
		  (t_UsuarioEClass, 
		   source, 
		   new String[] {
			 "asociada_no_repetida", "self.ID<>self.tarea_asociada.ID",
			 "tarea_siguiente_true", "self.tarea_asociada->size()=1"
		   });	
		addAnnotation
		  (t_ServicioEClass, 
		   source, 
		   new String[] {
			 "asociada_no_repetida", "self.ID<>self.tarea_asociada.ID",
			 "tarea_siguiente_true", "self.tarea_asociada->size()=1"
		   });	
		addAnnotation
		  (t_EnviarMensajeEClass, 
		   source, 
		   new String[] {
			 "sig_tarea_recibMsg", "self.tarea_asociada->selectByType(T_RecibirMensaje)->size()=1",
			 "distinto_actores", "self.oclContainer()<>self.tarea_asociada.oclContainer"
		   });	
		addAnnotation
		  (t_RecibirMensajeEClass, 
		   source, 
		   new String[] {
			 "asociada_no_repetida", "self.ID<>self.tarea_asociada.ID",
			 "tarea_siguiente_true", "self.tarea_asociada->size()=1"
		   });	
		addAnnotation
		  (estado_FinalEClass, 
		   source, 
		   new String[] {
			 "tarea_final", "self.tarea_asociada->size()=0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (workflowsEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "label", "Nombre",
			 "border.color", "37,234,14"
		   });	
		addAnnotation
		  (estado_InicialEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "label", "Nombre",
			 "svg.uri", "platform:/plugin/Proyect/model/img/circulo.svg"
		   });	
		addAnnotation
		  (t_UsuarioEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "label", "Nombre",
			 "border.color", "14,47,234"
		   });	
		addAnnotation
		  (t_ServicioEClass, 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "figure", "rectangle",
			 "border.color", "254,254,6"
		   });	
		addAnnotation
		  (t_EnviarMensajeEClass, 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "figure", "rectangle",
			 "border.color", "254,6,167"
		   });	
		addAnnotation
		  (t_RecibirMensajeEClass, 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "figure", "rectangle",
			 "border.color", "151,9,101"
		   });	
		addAnnotation
		  (estado_FinalEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "label", "Nombre",
			 "svg.uri", "platform:/plugin/Proyect/model/img/circulo.svg"
		   });	
		addAnnotation
		  (objeto_de_DatosEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "figure", "rectangle",
			 "border.color", "14,234,220"
		   });	
		addAnnotation
		  (tipoDatosEClass, 
		   source, 
		   new String[] {
			 "label", "Descripcion",
			 "figure", "rectangle",
			 "border.color", "6,254,246"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getActor_Tarea(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getT_Usuario_Datos(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getObjeto_de_Datos_Tipodatos(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getTarea_Tarea_asociada(), 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "source", "Tarea",
			 "target", "Tarea",
			 "width", "3",
			 "style", "solid",
			 "color", "0,76,255",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getT_Servicio_Datos_servicio(), 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "source", "Tarea",
			 "target", "Objeto_de_Datos",
			 "width", "3",
			 "style", "dash",
			 "color", "255,035,001",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getT_EnviarMensaje_Datos_Enviar_Mensaje(), 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "source", "Tarea",
			 "target", "Objeto_de_Datos",
			 "width", "3",
			 "style", "dash",
			 "color", "255,035,001",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getT_RecibirMensaje_Datos_Recibir_Mensaje(), 
		   source, 
		   new String[] {
			 "label", "Nombre",
			 "source", "Tarea",
			 "target", "Objeto_de_Datos",
			 "width", "3",
			 "style", "dash",
			 "color", "255,035,001",
			 "target.decoration", "arrow"
		   });
	}

} //ProyectPackageImpl
