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

package Hello.Services.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for NhanVien. This utility wraps
 * {@link Hello.Services.service.impl.NhanVienLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NhanVienLocalService
 * @see Hello.Services.service.base.NhanVienLocalServiceBaseImpl
 * @see Hello.Services.service.impl.NhanVienLocalServiceImpl
 * @generated
 */
@ProviderType
public class NhanVienLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link Hello.Services.service.impl.NhanVienLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the nhan vien to the database. Also notifies the appropriate model listeners.
	*
	* @param nhanVien the nhan vien
	* @return the nhan vien that was added
	*/
	public static Hello.Services.model.NhanVien addNhanVien(
		Hello.Services.model.NhanVien nhanVien) {
		return getService().addNhanVien(nhanVien);
	}

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param Id the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	public static Hello.Services.model.NhanVien createNhanVien(long Id) {
		return getService().createNhanVien(Id);
	}

	/**
	* Deletes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws PortalException if a nhan vien with the primary key could not be found
	*/
	public static Hello.Services.model.NhanVien deleteNhanVien(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteNhanVien(Id);
	}

	/**
	* Deletes the nhan vien from the database. Also notifies the appropriate model listeners.
	*
	* @param nhanVien the nhan vien
	* @return the nhan vien that was removed
	*/
	public static Hello.Services.model.NhanVien deleteNhanVien(
		Hello.Services.model.NhanVien nhanVien) {
		return getService().deleteNhanVien(nhanVien);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Hello.Services.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Hello.Services.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Hello.Services.model.NhanVien fetchNhanVien(long Id) {
		return getService().fetchNhanVien(Id);
	}

	/**
	* Returns the nhan vien matching the UUID and group.
	*
	* @param uuid the nhan vien's UUID
	* @param groupId the primary key of the group
	* @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	*/
	public static Hello.Services.model.NhanVien fetchNhanVienByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchNhanVienByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the nhan vien with the primary key.
	*
	* @param Id the primary key of the nhan vien
	* @return the nhan vien
	* @throws PortalException if a nhan vien with the primary key could not be found
	*/
	public static Hello.Services.model.NhanVien getNhanVien(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNhanVien(Id);
	}

	/**
	* Returns the nhan vien matching the UUID and group.
	*
	* @param uuid the nhan vien's UUID
	* @param groupId the primary key of the group
	* @return the matching nhan vien
	* @throws PortalException if a matching nhan vien could not be found
	*/
	public static Hello.Services.model.NhanVien getNhanVienByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNhanVienByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Hello.Services.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of nhan viens
	*/
	public static java.util.List<Hello.Services.model.NhanVien> getNhanViens(
		int start, int end) {
		return getService().getNhanViens(start, end);
	}

	/**
	* Returns all the nhan viens matching the UUID and company.
	*
	* @param uuid the UUID of the nhan viens
	* @param companyId the primary key of the company
	* @return the matching nhan viens, or an empty list if no matches were found
	*/
	public static java.util.List<Hello.Services.model.NhanVien> getNhanViensByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getNhanViensByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of nhan viens matching the UUID and company.
	*
	* @param uuid the UUID of the nhan viens
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching nhan viens, or an empty list if no matches were found
	*/
	public static java.util.List<Hello.Services.model.NhanVien> getNhanViensByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hello.Services.model.NhanVien> orderByComparator) {
		return getService()
				   .getNhanViensByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	*/
	public static int getNhanViensCount() {
		return getService().getNhanViensCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the nhan vien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nhanVien the nhan vien
	* @return the nhan vien that was updated
	*/
	public static Hello.Services.model.NhanVien updateNhanVien(
		Hello.Services.model.NhanVien nhanVien) {
		return getService().updateNhanVien(nhanVien);
	}

	public static NhanVienLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NhanVienLocalService, NhanVienLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(NhanVienLocalService.class);

		ServiceTracker<NhanVienLocalService, NhanVienLocalService> serviceTracker =
			new ServiceTracker<NhanVienLocalService, NhanVienLocalService>(bundle.getBundleContext(),
				NhanVienLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}