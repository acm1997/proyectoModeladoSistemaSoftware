/**
 */
package proyect.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import proyect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see proyect.ProyectPackage
 * @generated
 */
public class ProyectValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProyectValidator INSTANCE = new ProyectValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "proyect";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProyectPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProyectPackage.WORKFLOWS:
				return validateWorkflows((Workflows)value, diagnostics, context);
			case ProyectPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case ProyectPackage.TAREA:
				return validateTarea((Tarea)value, diagnostics, context);
			case ProyectPackage.ESTADO_INICIAL:
				return validateEstado_Inicial((Estado_Inicial)value, diagnostics, context);
			case ProyectPackage.TUSUARIO:
				return validateT_Usuario((T_Usuario)value, diagnostics, context);
			case ProyectPackage.TSERVICIO:
				return validateT_Servicio((T_Servicio)value, diagnostics, context);
			case ProyectPackage.TENVIAR_MENSAJE:
				return validateT_EnviarMensaje((T_EnviarMensaje)value, diagnostics, context);
			case ProyectPackage.TRECIBIR_MENSAJE:
				return validateT_RecibirMensaje((T_RecibirMensaje)value, diagnostics, context);
			case ProyectPackage.ESTADO_FINAL:
				return validateEstado_Final((Estado_Final)value, diagnostics, context);
			case ProyectPackage.OBJETO_DE_DATOS:
				return validateObjeto_de_Datos((Objeto_de_Datos)value, diagnostics, context);
			case ProyectPackage.TIPO_DATOS:
				return validateTipoDatos((TipoDatos)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflows(Workflows workflows, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workflows, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflows_workflow_inicio_unico(workflows, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflows_workflow_final_unico(workflows, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the workflow_inicio_unico constraint of '<em>Workflows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOWS__WORKFLOW_INICIO_UNICO__EEXPRESSION = "self.actores.tarea->selectByType(Estado_Inicial)->size()=1";

	/**
	 * Validates the workflow_inicio_unico constraint of '<em>Workflows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflows_workflow_inicio_unico(Workflows workflows, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.WORKFLOWS,
				 workflows,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "workflow_inicio_unico",
				 WORKFLOWS__WORKFLOW_INICIO_UNICO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the workflow_final_unico constraint of '<em>Workflows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOWS__WORKFLOW_FINAL_UNICO__EEXPRESSION = "self.actores.tarea->selectByType(Estado_Final)->size()=1";

	/**
	 * Validates the workflow_final_unico constraint of '<em>Workflows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflows_workflow_final_unico(Workflows workflows, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.WORKFLOWS,
				 workflows,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "workflow_final_unico",
				 WORKFLOWS__WORKFLOW_FINAL_UNICO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_min_una_tarea(actor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the min_una_tarea constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTOR__MIN_UNA_TAREA__EEXPRESSION = "self.tarea->size()>0";

	/**
	 * Validates the min_una_tarea constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_min_una_tarea(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.ACTOR,
				 actor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "min_una_tarea",
				 ACTOR__MIN_UNA_TAREA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tarea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(tarea, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the tarea_inicio constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA__TAREA_INICIO__EEXPRESSION = "self.tarea_asociada->selectByType(Estado_Inicial)->size()=0";

	/**
	 * Validates the tarea_inicio constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_tarea_inicio(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TAREA,
				 tarea,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tarea_inicio",
				 TAREA__TAREA_INICIO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado_Inicial(Estado_Inicial estado_Inicial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(estado_Inicial, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateEstado_Inicial_asociada_no_repetida(estado_Inicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateEstado_Inicial_tarea_siguiente_true(estado_Inicial, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the asociada_no_repetida constraint of '<em>Estado Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESTADO_INICIAL__ASOCIADA_NO_REPETIDA__EEXPRESSION = "self.ID<>self.tarea_asociada.ID";

	/**
	 * Validates the asociada_no_repetida constraint of '<em>Estado Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado_Inicial_asociada_no_repetida(Estado_Inicial estado_Inicial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.ESTADO_INICIAL,
				 estado_Inicial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "asociada_no_repetida",
				 ESTADO_INICIAL__ASOCIADA_NO_REPETIDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the tarea_siguiente_true constraint of '<em>Estado Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESTADO_INICIAL__TAREA_SIGUIENTE_TRUE__EEXPRESSION = "self.tarea_asociada->size()=1";

	/**
	 * Validates the tarea_siguiente_true constraint of '<em>Estado Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado_Inicial_tarea_siguiente_true(Estado_Inicial estado_Inicial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.ESTADO_INICIAL,
				 estado_Inicial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tarea_siguiente_true",
				 ESTADO_INICIAL__TAREA_SIGUIENTE_TRUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_Usuario(T_Usuario t_Usuario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t_Usuario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_Usuario_asociada_no_repetida(t_Usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_Usuario_tarea_siguiente_true(t_Usuario, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the asociada_no_repetida constraint of '<em>TUsuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TUSUARIO__ASOCIADA_NO_REPETIDA__EEXPRESSION = "self.ID<>self.tarea_asociada.ID";

	/**
	 * Validates the asociada_no_repetida constraint of '<em>TUsuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_Usuario_asociada_no_repetida(T_Usuario t_Usuario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TUSUARIO,
				 t_Usuario,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "asociada_no_repetida",
				 TUSUARIO__ASOCIADA_NO_REPETIDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the tarea_siguiente_true constraint of '<em>TUsuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TUSUARIO__TAREA_SIGUIENTE_TRUE__EEXPRESSION = "self.tarea_asociada->size()=1";

	/**
	 * Validates the tarea_siguiente_true constraint of '<em>TUsuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_Usuario_tarea_siguiente_true(T_Usuario t_Usuario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TUSUARIO,
				 t_Usuario,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tarea_siguiente_true",
				 TUSUARIO__TAREA_SIGUIENTE_TRUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_Servicio(T_Servicio t_Servicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t_Servicio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_Servicio_asociada_no_repetida(t_Servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_Servicio_tarea_siguiente_true(t_Servicio, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the asociada_no_repetida constraint of '<em>TServicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TSERVICIO__ASOCIADA_NO_REPETIDA__EEXPRESSION = "self.ID<>self.tarea_asociada.ID";

	/**
	 * Validates the asociada_no_repetida constraint of '<em>TServicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_Servicio_asociada_no_repetida(T_Servicio t_Servicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TSERVICIO,
				 t_Servicio,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "asociada_no_repetida",
				 TSERVICIO__ASOCIADA_NO_REPETIDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the tarea_siguiente_true constraint of '<em>TServicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TSERVICIO__TAREA_SIGUIENTE_TRUE__EEXPRESSION = "self.tarea_asociada->size()=1";

	/**
	 * Validates the tarea_siguiente_true constraint of '<em>TServicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_Servicio_tarea_siguiente_true(T_Servicio t_Servicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TSERVICIO,
				 t_Servicio,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tarea_siguiente_true",
				 TSERVICIO__TAREA_SIGUIENTE_TRUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_EnviarMensaje(T_EnviarMensaje t_EnviarMensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t_EnviarMensaje, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_EnviarMensaje_sig_tarea_recibMsg(t_EnviarMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_EnviarMensaje_distinto_actores(t_EnviarMensaje, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sig_tarea_recibMsg constraint of '<em>TEnviar Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TENVIAR_MENSAJE__SIG_TAREA_RECIB_MSG__EEXPRESSION = "self.tarea_asociada->selectByType(T_RecibirMensaje)->size()=1";

	/**
	 * Validates the sig_tarea_recibMsg constraint of '<em>TEnviar Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_EnviarMensaje_sig_tarea_recibMsg(T_EnviarMensaje t_EnviarMensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TENVIAR_MENSAJE,
				 t_EnviarMensaje,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sig_tarea_recibMsg",
				 TENVIAR_MENSAJE__SIG_TAREA_RECIB_MSG__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the distinto_actores constraint of '<em>TEnviar Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TENVIAR_MENSAJE__DISTINTO_ACTORES__EEXPRESSION = "self.oclContainer()<>self.tarea_asociada.oclContainer";

	/**
	 * Validates the distinto_actores constraint of '<em>TEnviar Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_EnviarMensaje_distinto_actores(T_EnviarMensaje t_EnviarMensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TENVIAR_MENSAJE,
				 t_EnviarMensaje,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "distinto_actores",
				 TENVIAR_MENSAJE__DISTINTO_ACTORES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_RecibirMensaje(T_RecibirMensaje t_RecibirMensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t_RecibirMensaje, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_RecibirMensaje_asociada_no_repetida(t_RecibirMensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateT_RecibirMensaje_tarea_siguiente_true(t_RecibirMensaje, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the asociada_no_repetida constraint of '<em>TRecibir Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRECIBIR_MENSAJE__ASOCIADA_NO_REPETIDA__EEXPRESSION = "self.ID<>self.tarea_asociada.ID";

	/**
	 * Validates the asociada_no_repetida constraint of '<em>TRecibir Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_RecibirMensaje_asociada_no_repetida(T_RecibirMensaje t_RecibirMensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TRECIBIR_MENSAJE,
				 t_RecibirMensaje,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "asociada_no_repetida",
				 TRECIBIR_MENSAJE__ASOCIADA_NO_REPETIDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the tarea_siguiente_true constraint of '<em>TRecibir Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRECIBIR_MENSAJE__TAREA_SIGUIENTE_TRUE__EEXPRESSION = "self.tarea_asociada->size()=1";

	/**
	 * Validates the tarea_siguiente_true constraint of '<em>TRecibir Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT_RecibirMensaje_tarea_siguiente_true(T_RecibirMensaje t_RecibirMensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.TRECIBIR_MENSAJE,
				 t_RecibirMensaje,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tarea_siguiente_true",
				 TRECIBIR_MENSAJE__TAREA_SIGUIENTE_TRUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado_Final(Estado_Final estado_Final, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(estado_Final, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_tarea_inicio(estado_Final, diagnostics, context);
		if (result || diagnostics != null) result &= validateEstado_Final_tarea_final(estado_Final, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the tarea_final constraint of '<em>Estado Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESTADO_FINAL__TAREA_FINAL__EEXPRESSION = "self.tarea_asociada->size()=0";

	/**
	 * Validates the tarea_final constraint of '<em>Estado Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado_Final_tarea_final(Estado_Final estado_Final, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProyectPackage.Literals.ESTADO_FINAL,
				 estado_Final,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tarea_final",
				 ESTADO_FINAL__TAREA_FINAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjeto_de_Datos(Objeto_de_Datos objeto_de_Datos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objeto_de_Datos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoDatos(TipoDatos tipoDatos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tipoDatos, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProyectValidator
