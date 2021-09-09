/**
 */
package proyect.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proyect.Objeto_de_Datos;
import proyect.ProyectPackage;
import proyect.TipoDatos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objeto de Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyect.impl.Objeto_de_DatosImpl#getTipodatos <em>Tipodatos</em>}</li>
 *   <li>{@link proyect.impl.Objeto_de_DatosImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Objeto_de_DatosImpl extends EObjectImpl implements Objeto_de_Datos {
	/**
	 * The cached value of the '{@link #getTipodatos() <em>Tipodatos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipodatos()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoDatos> tipodatos;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Objeto_de_DatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectPackage.Literals.OBJETO_DE_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoDatos> getTipodatos() {
		if (tipodatos == null) {
			tipodatos = new EObjectContainmentEList<TipoDatos>(TipoDatos.class, this, ProyectPackage.OBJETO_DE_DATOS__TIPODATOS);
		}
		return tipodatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectPackage.OBJETO_DE_DATOS__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectPackage.OBJETO_DE_DATOS__TIPODATOS:
				return ((InternalEList<?>)getTipodatos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectPackage.OBJETO_DE_DATOS__TIPODATOS:
				return getTipodatos();
			case ProyectPackage.OBJETO_DE_DATOS__NOMBRE:
				return getNombre();
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
			case ProyectPackage.OBJETO_DE_DATOS__TIPODATOS:
				getTipodatos().clear();
				getTipodatos().addAll((Collection<? extends TipoDatos>)newValue);
				return;
			case ProyectPackage.OBJETO_DE_DATOS__NOMBRE:
				setNombre((String)newValue);
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
			case ProyectPackage.OBJETO_DE_DATOS__TIPODATOS:
				getTipodatos().clear();
				return;
			case ProyectPackage.OBJETO_DE_DATOS__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case ProyectPackage.OBJETO_DE_DATOS__TIPODATOS:
				return tipodatos != null && !tipodatos.isEmpty();
			case ProyectPackage.OBJETO_DE_DATOS__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //Objeto_de_DatosImpl
