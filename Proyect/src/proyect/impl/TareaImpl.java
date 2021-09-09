/**
 */
package proyect.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import proyect.ProyectPackage;
import proyect.Tarea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyect.impl.TareaImpl#getTarea_asociada <em>Tarea asociada</em>}</li>
 *   <li>{@link proyect.impl.TareaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyect.impl.TareaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link proyect.impl.TareaImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TareaImpl extends EObjectImpl implements Tarea {
	/**
	 * The cached value of the '{@link #getTarea_asociada() <em>Tarea asociada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarea_asociada()
	 * @generated
	 * @ordered
	 */
	protected Tarea tarea_asociada;

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
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectPackage.Literals.TAREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea getTarea_asociada() {
		if (tarea_asociada != null && tarea_asociada.eIsProxy()) {
			InternalEObject oldTarea_asociada = (InternalEObject)tarea_asociada;
			tarea_asociada = (Tarea)eResolveProxy(oldTarea_asociada);
			if (tarea_asociada != oldTarea_asociada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectPackage.TAREA__TAREA_ASOCIADA, oldTarea_asociada, tarea_asociada));
			}
		}
		return tarea_asociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea basicGetTarea_asociada() {
		return tarea_asociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarea_asociada(Tarea newTarea_asociada) {
		Tarea oldTarea_asociada = tarea_asociada;
		tarea_asociada = newTarea_asociada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectPackage.TAREA__TAREA_ASOCIADA, oldTarea_asociada, tarea_asociada));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectPackage.TAREA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectPackage.TAREA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectPackage.TAREA__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectPackage.TAREA__TAREA_ASOCIADA:
				if (resolve) return getTarea_asociada();
				return basicGetTarea_asociada();
			case ProyectPackage.TAREA__NOMBRE:
				return getNombre();
			case ProyectPackage.TAREA__DESCRIPCION:
				return getDescripcion();
			case ProyectPackage.TAREA__ID:
				return getID();
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
			case ProyectPackage.TAREA__TAREA_ASOCIADA:
				setTarea_asociada((Tarea)newValue);
				return;
			case ProyectPackage.TAREA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectPackage.TAREA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case ProyectPackage.TAREA__ID:
				setID((Integer)newValue);
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
			case ProyectPackage.TAREA__TAREA_ASOCIADA:
				setTarea_asociada((Tarea)null);
				return;
			case ProyectPackage.TAREA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectPackage.TAREA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case ProyectPackage.TAREA__ID:
				setID(ID_EDEFAULT);
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
			case ProyectPackage.TAREA__TAREA_ASOCIADA:
				return tarea_asociada != null;
			case ProyectPackage.TAREA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectPackage.TAREA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case ProyectPackage.TAREA__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", Descripcion: ");
		result.append(descripcion);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TareaImpl
