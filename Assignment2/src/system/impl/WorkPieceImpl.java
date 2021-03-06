/**
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import system.BooleanCondition;
import system.Step;
import system.Storage;
import system.SystemPackage;
import system.WorkPiece;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.WorkPieceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link system.impl.WorkPieceImpl#getTo <em>To</em>}</li>
 *   <li>{@link system.impl.WorkPieceImpl#getId <em>Id</em>}</li>
 *   <li>{@link system.impl.WorkPieceImpl#getIsStored <em>Is Stored</em>}</li>
 *   <li>{@link system.impl.WorkPieceImpl#getType <em>Type</em>}</li>
 *   <li>{@link system.impl.WorkPieceImpl#getInlcudedIn <em>Inlcuded In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkPieceImpl extends MinimalEObjectImpl.Container implements WorkPiece {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Step from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Step to;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsStored() <em>Is Stored</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStored()
	 * @generated
	 * @ordered
	 */
	protected EList<Storage> isStored;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInlcudedIn() <em>Inlcuded In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlcudedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanCondition> inlcudedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.WORK_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Step)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.WORK_PIECE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Step newFrom) {
		Step oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.WORK_PIECE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Step)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.WORK_PIECE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Step newTo) {
		Step oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.WORK_PIECE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.WORK_PIECE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Storage> getIsStored() {
		if (isStored == null) {
			isStored = new EObjectResolvingEList<Storage>(Storage.class, this, SystemPackage.WORK_PIECE__IS_STORED);
		}
		return isStored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.WORK_PIECE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanCondition> getInlcudedIn() {
		if (inlcudedIn == null) {
			inlcudedIn = new EObjectWithInverseResolvingEList.ManyInverse<BooleanCondition>(BooleanCondition.class, this, SystemPackage.WORK_PIECE__INLCUDED_IN, SystemPackage.BOOLEAN_CONDITION__CONTAINS);
		}
		return inlcudedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.WORK_PIECE__INLCUDED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInlcudedIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.WORK_PIECE__INLCUDED_IN:
				return ((InternalEList<?>)getInlcudedIn()).basicRemove(otherEnd, msgs);
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
			case SystemPackage.WORK_PIECE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case SystemPackage.WORK_PIECE__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case SystemPackage.WORK_PIECE__ID:
				return getId();
			case SystemPackage.WORK_PIECE__IS_STORED:
				return getIsStored();
			case SystemPackage.WORK_PIECE__TYPE:
				return getType();
			case SystemPackage.WORK_PIECE__INLCUDED_IN:
				return getInlcudedIn();
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
			case SystemPackage.WORK_PIECE__FROM:
				setFrom((Step)newValue);
				return;
			case SystemPackage.WORK_PIECE__TO:
				setTo((Step)newValue);
				return;
			case SystemPackage.WORK_PIECE__ID:
				setId((String)newValue);
				return;
			case SystemPackage.WORK_PIECE__IS_STORED:
				getIsStored().clear();
				getIsStored().addAll((Collection<? extends Storage>)newValue);
				return;
			case SystemPackage.WORK_PIECE__TYPE:
				setType((String)newValue);
				return;
			case SystemPackage.WORK_PIECE__INLCUDED_IN:
				getInlcudedIn().clear();
				getInlcudedIn().addAll((Collection<? extends BooleanCondition>)newValue);
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
			case SystemPackage.WORK_PIECE__FROM:
				setFrom((Step)null);
				return;
			case SystemPackage.WORK_PIECE__TO:
				setTo((Step)null);
				return;
			case SystemPackage.WORK_PIECE__ID:
				setId(ID_EDEFAULT);
				return;
			case SystemPackage.WORK_PIECE__IS_STORED:
				getIsStored().clear();
				return;
			case SystemPackage.WORK_PIECE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SystemPackage.WORK_PIECE__INLCUDED_IN:
				getInlcudedIn().clear();
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
			case SystemPackage.WORK_PIECE__FROM:
				return from != null;
			case SystemPackage.WORK_PIECE__TO:
				return to != null;
			case SystemPackage.WORK_PIECE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SystemPackage.WORK_PIECE__IS_STORED:
				return isStored != null && !isStored.isEmpty();
			case SystemPackage.WORK_PIECE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SystemPackage.WORK_PIECE__INLCUDED_IN:
				return inlcudedIn != null && !inlcudedIn.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WorkPieceImpl
