/**
 */
package proyect.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import proyect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see proyect.ProyectPackage
 * @generated
 */
public class ProyectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectSwitch() {
		if (modelPackage == null) {
			modelPackage = ProyectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProyectPackage.WORKFLOWS: {
				Workflows workflows = (Workflows)theEObject;
				T result = caseWorkflows(workflows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.TAREA: {
				Tarea tarea = (Tarea)theEObject;
				T result = caseTarea(tarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.ESTADO_INICIAL: {
				Estado_Inicial estado_Inicial = (Estado_Inicial)theEObject;
				T result = caseEstado_Inicial(estado_Inicial);
				if (result == null) result = caseTarea(estado_Inicial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.TUSUARIO: {
				T_Usuario t_Usuario = (T_Usuario)theEObject;
				T result = caseT_Usuario(t_Usuario);
				if (result == null) result = caseTarea(t_Usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.TSERVICIO: {
				T_Servicio t_Servicio = (T_Servicio)theEObject;
				T result = caseT_Servicio(t_Servicio);
				if (result == null) result = caseTarea(t_Servicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.TENVIAR_MENSAJE: {
				T_EnviarMensaje t_EnviarMensaje = (T_EnviarMensaje)theEObject;
				T result = caseT_EnviarMensaje(t_EnviarMensaje);
				if (result == null) result = caseTarea(t_EnviarMensaje);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.TRECIBIR_MENSAJE: {
				T_RecibirMensaje t_RecibirMensaje = (T_RecibirMensaje)theEObject;
				T result = caseT_RecibirMensaje(t_RecibirMensaje);
				if (result == null) result = caseTarea(t_RecibirMensaje);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.ESTADO_FINAL: {
				Estado_Final estado_Final = (Estado_Final)theEObject;
				T result = caseEstado_Final(estado_Final);
				if (result == null) result = caseTarea(estado_Final);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.OBJETO_DE_DATOS: {
				Objeto_de_Datos objeto_de_Datos = (Objeto_de_Datos)theEObject;
				T result = caseObjeto_de_Datos(objeto_de_Datos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectPackage.TIPO_DATOS: {
				TipoDatos tipoDatos = (TipoDatos)theEObject;
				T result = caseTipoDatos(tipoDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflows(Workflows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarea(Tarea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estado Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estado Inicial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstado_Inicial(Estado_Inicial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TUsuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TUsuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_Usuario(T_Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TServicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TServicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_Servicio(T_Servicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnviar Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnviar Mensaje</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_EnviarMensaje(T_EnviarMensaje object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRecibir Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRecibir Mensaje</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_RecibirMensaje(T_RecibirMensaje object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estado Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estado Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstado_Final(Estado_Final object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objeto de Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objeto de Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjeto_de_Datos(Objeto_de_Datos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoDatos(TipoDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProyectSwitch
