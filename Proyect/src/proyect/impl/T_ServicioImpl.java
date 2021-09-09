/**
 */
package proyect.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import proyect.Objeto_de_Datos;
import proyect.ProyectPackage;
import proyect.T_Servicio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TServicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyect.impl.T_ServicioImpl#getDatos_servicio <em>Datos servicio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_ServicioImpl extends TareaImpl implements T_Servicio {
	/**
	 * The cached value of the '{@link #getDatos_servicio() <em>Datos servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos_servicio()
	 * @generated
	 * @ordered
	 */
	protected Objeto_de_Datos datos_servicio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_ServicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectPackage.Literals.TSERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto_de_Datos getDatos_servicio() {
		if (datos_servicio != null && datos_servicio.eIsProxy()) {
			InternalEObject oldDatos_servicio = (InternalEObject)datos_servicio;
			datos_servicio = (Objeto_de_Datos)eResolveProxy(oldDatos_servicio);
			if (datos_servicio != oldDatos_servicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectPackage.TSERVICIO__DATOS_SERVICIO, oldDatos_servicio, datos_servicio));
			}
		}
		return datos_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objeto_de_Datos basicGetDatos_servicio() {
		return datos_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatos_servicio(Objeto_de_Datos newDatos_servicio) {
		Objeto_de_Datos oldDatos_servicio = datos_servicio;
		datos_servicio = newDatos_servicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectPackage.TSERVICIO__DATOS_SERVICIO, oldDatos_servicio, datos_servicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectPackage.TSERVICIO__DATOS_SERVICIO:
				if (resolve) return getDatos_servicio();
				return basicGetDatos_servicio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectPackage.TSERVICIO__DATOS_SERVICIO:
				setDatos_servicio((Objeto_de_Datos)newValue);
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
			case ProyectPackage.TSERVICIO__DATOS_SERVICIO:
				setDatos_servicio((Objeto_de_Datos)null);
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
			case ProyectPackage.TSERVICIO__DATOS_SERVICIO:
				return datos_servicio != null;
		}
		return super.eIsSet(featureID);
	}

} //T_ServicioImpl
