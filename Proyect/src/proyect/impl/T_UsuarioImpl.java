/**
 */
package proyect.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proyect.Objeto_de_Datos;
import proyect.ProyectPackage;
import proyect.T_Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TUsuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyect.impl.T_UsuarioImpl#getDatos <em>Datos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_UsuarioImpl extends TareaImpl implements T_Usuario {
	/**
	 * The cached value of the '{@link #getDatos() <em>Datos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos()
	 * @generated
	 * @ordered
	 */
	protected EList<Objeto_de_Datos> datos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectPackage.Literals.TUSUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objeto_de_Datos> getDatos() {
		if (datos == null) {
			datos = new EObjectContainmentEList<Objeto_de_Datos>(Objeto_de_Datos.class, this, ProyectPackage.TUSUARIO__DATOS);
		}
		return datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectPackage.TUSUARIO__DATOS:
				return ((InternalEList<?>)getDatos()).basicRemove(otherEnd, msgs);
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
			case ProyectPackage.TUSUARIO__DATOS:
				return getDatos();
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
			case ProyectPackage.TUSUARIO__DATOS:
				getDatos().clear();
				getDatos().addAll((Collection<? extends Objeto_de_Datos>)newValue);
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
			case ProyectPackage.TUSUARIO__DATOS:
				getDatos().clear();
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
			case ProyectPackage.TUSUARIO__DATOS:
				return datos != null && !datos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //T_UsuarioImpl
