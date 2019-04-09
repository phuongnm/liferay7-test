/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package Hello.Services.service.persistence;

import Hello.Services.model.NhanVien;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the nhan vien service. This utility wraps {@link Hello.Services.service.persistence.impl.NhanVienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NhanVienPersistence
 * @see Hello.Services.service.persistence.impl.NhanVienPersistenceImpl
 * @generated
 */
@ProviderType
public class NhanVienUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(NhanVien nhanVien) {
		getPersistence().clearCache(nhanVien);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NhanVien> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NhanVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NhanVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NhanVien update(NhanVien nhanVien) {
		return getPersistence().update(nhanVien);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NhanVien update(NhanVien nhanVien,
		ServiceContext serviceContext) {
		return getPersistence().update(nhanVien, serviceContext);
	}

	/**
	* Returns all the nhan viens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching nhan viens
	*/
	public static List<NhanVien> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the nhan viens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	*/
	public static List<NhanVien> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	*/
	public static List<NhanVien> findByUuid(String uuid, int start, int end,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the nhan viens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching nhan viens
	*/
	public static List<NhanVien> findByUuid(String uuid, int start, int end,
		OrderByComparator<NhanVien> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByUuid_First(String uuid,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByUuid_First(String uuid,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByUuid_Last(String uuid,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByUuid_Last(String uuid,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63;.
	*
	* @param Id the primary key of the current nhan vien
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public static NhanVien[] findByUuid_PrevAndNext(long Id, String uuid,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_PrevAndNext(Id, uuid, orderByComparator);
	}

	/**
	* Removes all the nhan viens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of nhan viens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching nhan viens
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the nhan vien where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchNhanVienException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByUUID_G(String uuid, long groupId)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the nhan vien where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the nhan vien where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the nhan vien where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the nhan vien that was removed
	*/
	public static NhanVien removeByUUID_G(String uuid, long groupId)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of nhan viens where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching nhan viens
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching nhan viens
	*/
	public static List<NhanVien> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	*/
	public static List<NhanVien> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	*/
	public static List<NhanVien> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching nhan viens
	*/
	public static List<NhanVien> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param Id the primary key of the current nhan vien
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public static NhanVien[] findByUuid_C_PrevAndNext(long Id, String uuid,
		long companyId, OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(Id, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the nhan viens where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching nhan viens
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the nhan viens where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @return the matching nhan viens
	*/
	public static List<NhanVien> findByGioiTinh(boolean GioiTinh) {
		return getPersistence().findByGioiTinh(GioiTinh);
	}

	/**
	* Returns a range of all the nhan viens where GioiTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param GioiTinh the gioi tinh
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	*/
	public static List<NhanVien> findByGioiTinh(boolean GioiTinh, int start,
		int end) {
		return getPersistence().findByGioiTinh(GioiTinh, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where GioiTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param GioiTinh the gioi tinh
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	*/
	public static List<NhanVien> findByGioiTinh(boolean GioiTinh, int start,
		int end, OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence()
				   .findByGioiTinh(GioiTinh, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the nhan viens where GioiTinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param GioiTinh the gioi tinh
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching nhan viens
	*/
	public static List<NhanVien> findByGioiTinh(boolean GioiTinh, int start,
		int end, OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGioiTinh(GioiTinh, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByGioiTinh_First(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().findByGioiTinh_First(GioiTinh, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByGioiTinh_First(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence()
				   .fetchByGioiTinh_First(GioiTinh, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public static NhanVien findByGioiTinh_Last(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().findByGioiTinh_Last(GioiTinh, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static NhanVien fetchByGioiTinh_Last(boolean GioiTinh,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence().fetchByGioiTinh_Last(GioiTinh, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param Id the primary key of the current nhan vien
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public static NhanVien[] findByGioiTinh_PrevAndNext(long Id,
		boolean GioiTinh, OrderByComparator<NhanVien> orderByComparator)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence()
				   .findByGioiTinh_PrevAndNext(Id, GioiTinh, orderByComparator);
	}

	/**
	* Removes all the nhan viens where GioiTinh = &#63; from the database.
	*
	* @param GioiTinh the gioi tinh
	*/
	public static void removeByGioiTinh(boolean GioiTinh) {
		getPersistence().removeByGioiTinh(GioiTinh);
	}

	/**
	* Returns the number of nhan viens where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @return the number of matching nhan viens
	*/
	public static int countByGioiTinh(boolean GioiTinh) {
		return getPersistence().countByGioiTinh(GioiTinh);
	}

	/**
	* Caches the nhan vien in the entity cache if it is enabled.
	*
	* @param nhanVien the nhan vien
	*/
	public static void cacheResult(NhanVien nhanVien) {
		getPersistence().cacheResult(nhanVien);
	}

	/**
	* Caches the nhan viens in the entity cache if it is enabled.
	*
	* @param nhanViens the nhan viens
	*/
	public static void cacheResult(List<NhanVien> nhanViens) {
		getPersistence().cacheResult(nhanViens);
	}

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param Id the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	public static NhanVien create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public static NhanVien remove(long Id)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().remove(Id);
	}

	public static NhanVien updateImpl(NhanVien nhanVien) {
		return getPersistence().updateImpl(nhanVien);
	}

	/**
	* Returns the nhan vien with the primary key or throws a {@link NoSuchNhanVienException} if it could not be found.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public static NhanVien findByPrimaryKey(long Id)
		throws Hello.Services.exception.NoSuchNhanVienException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	*/
	public static NhanVien fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	public static java.util.Map<java.io.Serializable, NhanVien> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the nhan viens.
	*
	* @return the nhan viens
	*/
	public static List<NhanVien> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of nhan viens
	*/
	public static List<NhanVien> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhan viens
	*/
	public static List<NhanVien> findAll(int start, int end,
		OrderByComparator<NhanVien> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of nhan viens
	*/
	public static List<NhanVien> findAll(int start, int end,
		OrderByComparator<NhanVien> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the nhan viens from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static NhanVienPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NhanVienPersistence, NhanVienPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NhanVienPersistence.class);

		ServiceTracker<NhanVienPersistence, NhanVienPersistence> serviceTracker = new ServiceTracker<NhanVienPersistence, NhanVienPersistence>(bundle.getBundleContext(),
				NhanVienPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}