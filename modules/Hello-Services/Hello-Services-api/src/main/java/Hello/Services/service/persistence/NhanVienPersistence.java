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

import Hello.Services.exception.NoSuchNhanVienException;

import Hello.Services.model.NhanVien;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the nhan vien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Hello.Services.service.persistence.impl.NhanVienPersistenceImpl
 * @see NhanVienUtil
 * @generated
 */
@ProviderType
public interface NhanVienPersistence extends BasePersistence<NhanVien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NhanVienUtil} to access the nhan vien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the nhan viens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching nhan viens
	*/
	public java.util.List<NhanVien> findByUuid(String uuid);

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
	public java.util.List<NhanVien> findByUuid(String uuid, int start, int end);

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
	public java.util.List<NhanVien> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

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
	public java.util.List<NhanVien> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63;.
	*
	* @param Id the primary key of the current nhan vien
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public NhanVien[] findByUuid_PrevAndNext(long Id, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Removes all the nhan viens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of nhan viens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching nhan viens
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the nhan vien where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchNhanVienException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByUUID_G(String uuid, long groupId)
		throws NoSuchNhanVienException;

	/**
	* Returns the nhan vien where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the nhan vien where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the nhan vien where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the nhan vien that was removed
	*/
	public NhanVien removeByUUID_G(String uuid, long groupId)
		throws NoSuchNhanVienException;

	/**
	* Returns the number of nhan viens where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching nhan viens
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching nhan viens
	*/
	public java.util.List<NhanVien> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<NhanVien> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<NhanVien> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

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
	public java.util.List<NhanVien> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

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
	public NhanVien[] findByUuid_C_PrevAndNext(long Id, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Removes all the nhan viens where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching nhan viens
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the nhan viens where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @return the matching nhan viens
	*/
	public java.util.List<NhanVien> findByGioiTinh(boolean GioiTinh);

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
	public java.util.List<NhanVien> findByGioiTinh(boolean GioiTinh, int start,
		int end);

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
	public java.util.List<NhanVien> findByGioiTinh(boolean GioiTinh, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

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
	public java.util.List<NhanVien> findByGioiTinh(boolean GioiTinh, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByGioiTinh_First(boolean GioiTinh,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Returns the first nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByGioiTinh_First(boolean GioiTinh,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

	/**
	* Returns the last nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws NoSuchNhanVienException if a matching nhan vien could not be found
	*/
	public NhanVien findByGioiTinh_Last(boolean GioiTinh,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Returns the last nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public NhanVien fetchByGioiTinh_Last(boolean GioiTinh,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where GioiTinh = &#63;.
	*
	* @param Id the primary key of the current nhan vien
	* @param GioiTinh the gioi tinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public NhanVien[] findByGioiTinh_PrevAndNext(long Id, boolean GioiTinh,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator)
		throws NoSuchNhanVienException;

	/**
	* Removes all the nhan viens where GioiTinh = &#63; from the database.
	*
	* @param GioiTinh the gioi tinh
	*/
	public void removeByGioiTinh(boolean GioiTinh);

	/**
	* Returns the number of nhan viens where GioiTinh = &#63;.
	*
	* @param GioiTinh the gioi tinh
	* @return the number of matching nhan viens
	*/
	public int countByGioiTinh(boolean GioiTinh);

	/**
	* Caches the nhan vien in the entity cache if it is enabled.
	*
	* @param nhanVien the nhan vien
	*/
	public void cacheResult(NhanVien nhanVien);

	/**
	* Caches the nhan viens in the entity cache if it is enabled.
	*
	* @param nhanViens the nhan viens
	*/
	public void cacheResult(java.util.List<NhanVien> nhanViens);

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param Id the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	public NhanVien create(long Id);

	/**
	* Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public NhanVien remove(long Id) throws NoSuchNhanVienException;

	public NhanVien updateImpl(NhanVien nhanVien);

	/**
	* Returns the nhan vien with the primary key or throws a {@link NoSuchNhanVienException} if it could not be found.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien
	* @throws NoSuchNhanVienException if a nhan vien with the primary key could not be found
	*/
	public NhanVien findByPrimaryKey(long Id) throws NoSuchNhanVienException;

	/**
	* Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	*/
	public NhanVien fetchByPrimaryKey(long Id);

	@Override
	public java.util.Map<java.io.Serializable, NhanVien> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the nhan viens.
	*
	* @return the nhan viens
	*/
	public java.util.List<NhanVien> findAll();

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
	public java.util.List<NhanVien> findAll(int start, int end);

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
	public java.util.List<NhanVien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator);

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
	public java.util.List<NhanVien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NhanVien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the nhan viens from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}