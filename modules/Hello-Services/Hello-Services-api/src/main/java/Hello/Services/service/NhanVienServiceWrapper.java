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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NhanVienService}.
 *
 * @author Brian Wing Shun Chan
 * @see NhanVienService
 * @generated
 */
@ProviderType
public class NhanVienServiceWrapper implements NhanVienService,
	ServiceWrapper<NhanVienService> {
	public NhanVienServiceWrapper(NhanVienService nhanVienService) {
		_nhanVienService = nhanVienService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _nhanVienService.getOSGiServiceIdentifier();
	}

	@Override
	public NhanVienService getWrappedService() {
		return _nhanVienService;
	}

	@Override
	public void setWrappedService(NhanVienService nhanVienService) {
		_nhanVienService = nhanVienService;
	}

	private NhanVienService _nhanVienService;
}