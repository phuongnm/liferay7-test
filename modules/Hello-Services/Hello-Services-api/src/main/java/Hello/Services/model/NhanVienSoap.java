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

package Hello.Services.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link Hello.Services.service.http.NhanVienServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see Hello.Services.service.http.NhanVienServiceSoap
 * @generated
 */
@ProviderType
public class NhanVienSoap implements Serializable {
	public static NhanVienSoap toSoapModel(NhanVien model) {
		NhanVienSoap soapModel = new NhanVienSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTenNV(model.getTenNV());
		soapModel.setGioiTinh(model.isGioiTinh());
		soapModel.setEmail(model.getEmail());
		soapModel.setNgaySinh(model.getNgaySinh());
		soapModel.setDiaChi(model.getDiaChi());

		return soapModel;
	}

	public static NhanVienSoap[] toSoapModels(NhanVien[] models) {
		NhanVienSoap[] soapModels = new NhanVienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NhanVienSoap[][] toSoapModels(NhanVien[][] models) {
		NhanVienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NhanVienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NhanVienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NhanVienSoap[] toSoapModels(List<NhanVien> models) {
		List<NhanVienSoap> soapModels = new ArrayList<NhanVienSoap>(models.size());

		for (NhanVien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NhanVienSoap[soapModels.size()]);
	}

	public NhanVienSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTenNV() {
		return _TenNV;
	}

	public void setTenNV(String TenNV) {
		_TenNV = TenNV;
	}

	public boolean getGioiTinh() {
		return _GioiTinh;
	}

	public boolean isGioiTinh() {
		return _GioiTinh;
	}

	public void setGioiTinh(boolean GioiTinh) {
		_GioiTinh = GioiTinh;
	}

	public String getEmail() {
		return _Email;
	}

	public void setEmail(String Email) {
		_Email = Email;
	}

	public Date getNgaySinh() {
		return _NgaySinh;
	}

	public void setNgaySinh(Date NgaySinh) {
		_NgaySinh = NgaySinh;
	}

	public String getDiaChi() {
		return _DiaChi;
	}

	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;
	}

	private String _uuid;
	private long _Id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _TenNV;
	private boolean _GioiTinh;
	private String _Email;
	private Date _NgaySinh;
	private String _DiaChi;
}