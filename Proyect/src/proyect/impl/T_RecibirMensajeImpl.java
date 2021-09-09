/**
 */
package proyect.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import proyect.Objeto_de_Datos;
import proyect.ProyectPackage;
import proyect.T_RecibirMensaje;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRecibir Mensaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyect.impl.T_RecibirMensajeImpl#getDatos_Recibir_Mensaje <em>Datos Recibir Mensaje</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_RecibirMensajeImpl extends TareaImpl implements T_RecibirMensaje {
	/**
	 * The cached value of the '{@link #getDatos_Recibir_Mensaje() <em>Datos Recibir Mensaje</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos_Recibir_Mensaje()
	 * @generated
	 * @ordered
	 */
	protected EList<Objeto_de_Datos> datos_Recibir_Mensaje;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_RecibirMensajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectPackage.Literals.TRECIBIR_MENSAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objeto_de_Datos> getDatos_Recibir_Mensaje() {
		if (datos_Recibir_Mensaje == null) {
			datos_Recibir_Mensaje = new EObjectResolvingEList<Objeto_de_Datos>(Objeto_de_Datos.class, this, ProyectPackage.TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE);
		}
		return datos_Recibir_Mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectPackage.TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE:
				return getDatos_Recibir_Mensaje();
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
			case ProyectPackage.TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE:
				getDatos_Recibir_Mensaje().clear();
				getDatos_Recibir_Mensaje().addAll((Collection<? extends Objeto_de_Datos>)newValue);
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
			case ProyectPackage.TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE:
				getDatos_Recibir_Mensaje().clear();
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
			case ProyectPackage.TRECIBIR_MENSAJE__DATOS_RECIBIR_MENSAJE:
				return datos_Recibir_Mensaje != null && !datos_Recibir_Mensaje.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //T_RecibirMensajeImpl
