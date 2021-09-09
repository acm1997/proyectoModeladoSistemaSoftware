/**
 */
package proyect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyect.Tarea#getTarea_asociada <em>Tarea asociada</em>}</li>
 *   <li>{@link proyect.Tarea#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyect.Tarea#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link proyect.Tarea#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see proyect.ProyectPackage#getTarea()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tarea_inicio'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot tarea_inicio='self.tarea_asociada->selectByType(Estado_Inicial)->size()=0'"
 * @generated
 */
public interface Tarea extends EObject {
	/**
	 * Returns the value of the '<em><b>Tarea asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea asociada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea asociada</em>' reference.
	 * @see #setTarea_asociada(Tarea)
	 * @see proyect.ProyectPackage#getTarea_Tarea_asociada()
	 * @model annotation="gmf.link label='Nombre' source='Tarea' target='Tarea' width='3' style='solid' color='0,76,255' target.decoration='arrow'"
	 * @generated
	 */
	Tarea getTarea_asociada();

	/**
	 * Sets the value of the '{@link proyect.Tarea#getTarea_asociada <em>Tarea asociada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarea asociada</em>' reference.
	 * @see #getTarea_asociada()
	 * @generated
	 */
	void setTarea_asociada(Tarea value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyect.ProyectPackage#getTarea_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyect.Tarea#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see proyect.ProyectPackage#getTarea_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link proyect.Tarea#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see proyect.ProyectPackage#getTarea_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link proyect.Tarea#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // Tarea
