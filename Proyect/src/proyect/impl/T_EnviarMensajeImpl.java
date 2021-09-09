/**
 */
package proyect.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import proyect.Objeto_de_Datos;
import proyect.ProyectPackage;
import proyect.T_EnviarMensaje;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEnviar Mensaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyect.impl.T_EnviarMensajeImpl#getDatos_Enviar_Mensaje <em>Datos Enviar Mensaje</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_EnviarMensajeImpl extends TareaImpl implements T_EnviarMensaje {
	/**
	 * The cached value of the '{@link #getDatos_Enviar_Mensaje() <em>Datos Enviar Mensaje</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos_Enviar_Mensaje()
	 * @generated
	 * @ordered
	 */
	protected EList<Objeto_de_Datos> datos_Enviar_Mensaje;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_EnviarMensajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectPackage.Literals.TENVIAR_MENSAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objeto_de_Datos> getDatos_Enviar_Mensaje() {
		if (datos_Enviar_Mensaje == null) {
			datos_Enviar_Mensaje = new EObjectResolvingEList<Objeto_de_Datos>(Objeto_de_Datos.class, this, ProyectPackage.TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE);
		}
		return datos_Enviar_Mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectPackage.TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE:
				return getDatos_Enviar_Mensaje();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectPackage.TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE:
				getDatos_Enviar_Mensaje().clear();
				getDatos_Enviar_Mensaje().addAll((Collection<? extends Objeto_de_Datos>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProyectPackage.TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE:
				getDatos_Enviar_Mensaje().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProyectPackage.TENVIAR_MENSAJE__DATOS_ENVIAR_MENSAJE:
				return datos_Enviar_Mensaje != null && !datos_Enviar_Mensaje.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //T_EnviarMensajeImpl
