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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link NhanVien}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NhanVien
 * @generated
 */
@ProviderType
public class NhanVienWrapper implements NhanVien, ModelWrapper<NhanVien> {
	public NhanVienWrapper(NhanVien nhanVien) {
		_nhanVien = nhanVien;
	}

	@Override
	public Class<?> getModelClass() {
		return NhanVien.class;
	}

	@Override
	public String getModelClassName() {
		return NhanVien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("TenNV", getTenNV());
		attributes.put("GioiTinh", isGioiTinh());
		attributes.put("Email", getEmail());
		attributes.put("NgaySinh", getNgaySinh());
		attributes.put("DiaChi", getDiaChi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String TenNV = (String)attributes.get("TenNV");

		if (TenNV != null) {
			setTenNV(TenNV);
		}

		Boolean GioiTinh = (Boolean)attributes.get("GioiTinh");

		if (GioiTinh != null) {
			setGioiTinh(GioiTinh);
		}

		String Email = (String)attributes.get("Email");

		if (Email != null) {
			setEmail(Email);
		}

		Date NgaySinh = (Date)attributes.get("NgaySinh");

		if (NgaySinh != null) {
			setNgaySinh(NgaySinh);
		}

		String DiaChi = (String)attributes.get("DiaChi");

		if (DiaChi != null) {
			setDiaChi(DiaChi);
		}
	}

	@Override
	public Object clone() {
		return new NhanVienWrapper((NhanVien)_nhanVien.clone());
	}

	@Override
	public int compareTo(NhanVien nhanVien) {
		return _nhanVien.compareTo(nhanVien);
	}

	/**
	* Returns the company ID of this nhan vien.
	*
	* @return the company ID of this nhan vien
	*/
	@Override
	public long getCompanyId() {
		return _nhanVien.getCompanyId();
	}

	/**
	* Returns the create date of this nhan vien.
	*
	* @return the create date of this nhan vien
	*/
	@Override
	public Date getCreateDate() {
		return _nhanVien.getCreateDate();
	}

	/**
	* Returns the dia chi of this nhan vien.
	*
	* @return the dia chi of this nhan vien
	*/
	@Override
	public String getDiaChi() {
		return _nhanVien.getDiaChi();
	}

	/**
	* Returns the email of this nhan vien.
	*
	* @return the email of this nhan vien
	*/
	@Override
	public String getEmail() {
		return _nhanVien.getEmail();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _nhanVien.getExpandoBridge();
	}

	/**
	* Returns the gioi tinh of this nhan vien.
	*
	* @return the gioi tinh of this nhan vien
	*/
	@Override
	public boolean getGioiTinh() {
		return _nhanVien.getGioiTinh();
	}

	/**
	* Returns the group ID of this nhan vien.
	*
	* @return the group ID of this nhan vien
	*/
	@Override
	public long getGroupId() {
		return _nhanVien.getGroupId();
	}

	/**
	* Returns the ID of this nhan vien.
	*
	* @return the ID of this nhan vien
	*/
	@Override
	public long getId() {
		return _nhanVien.getId();
	}

	/**
	* Returns the modified date of this nhan vien.
	*
	* @return the modified date of this nhan vien
	*/
	@Override
	public Date getModifiedDate() {
		return _nhanVien.getModifiedDate();
	}

	/**
	* Returns the ngay sinh of this nhan vien.
	*
	* @return the ngay sinh of this nhan vien
	*/
	@Override
	public Date getNgaySinh() {
		return _nhanVien.getNgaySinh();
	}

	/**
	* Returns the primary key of this nhan vien.
	*
	* @return the primary key of this nhan vien
	*/
	@Override
	public long getPrimaryKey() {
		return _nhanVien.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nhanVien.getPrimaryKeyObj();
	}

	/**
	* Returns the ten nv of this nhan vien.
	*
	* @return the ten nv of this nhan vien
	*/
	@Override
	public String getTenNV() {
		return _nhanVien.getTenNV();
	}

	/**
	* Returns the user ID of this nhan vien.
	*
	* @return the user ID of this nhan vien
	*/
	@Override
	public long getUserId() {
		return _nhanVien.getUserId();
	}

	/**
	* Returns the user name of this nhan vien.
	*
	* @return the user name of this nhan vien
	*/
	@Override
	public String getUserName() {
		return _nhanVien.getUserName();
	}

	/**
	* Returns the user uuid of this nhan vien.
	*
	* @return the user uuid of this nhan vien
	*/
	@Override
	public String getUserUuid() {
		return _nhanVien.getUserUuid();
	}

	/**
	* Returns the uuid of this nhan vien.
	*
	* @return the uuid of this nhan vien
	*/
	@Override
	public String getUuid() {
		return _nhanVien.getUuid();
	}

	@Override
	public int hashCode() {
		return _nhanVien.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _nhanVien.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _nhanVien.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this nhan vien is gioi tinh.
	*
	* @return <code>true</code> if this nhan vien is gioi tinh; <code>false</code> otherwise
	*/
	@Override
	public boolean isGioiTinh() {
		return _nhanVien.isGioiTinh();
	}

	@Override
	public boolean isNew() {
		return _nhanVien.isNew();
	}

	@Override
	public void persist() {
		_nhanVien.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhanVien.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this nhan vien.
	*
	* @param companyId the company ID of this nhan vien
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nhanVien.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this nhan vien.
	*
	* @param createDate the create date of this nhan vien
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_nhanVien.setCreateDate(createDate);
	}

	/**
	* Sets the dia chi of this nhan vien.
	*
	* @param DiaChi the dia chi of this nhan vien
	*/
	@Override
	public void setDiaChi(String DiaChi) {
		_nhanVien.setDiaChi(DiaChi);
	}

	/**
	* Sets the email of this nhan vien.
	*
	* @param Email the email of this nhan vien
	*/
	@Override
	public void setEmail(String Email) {
		_nhanVien.setEmail(Email);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_nhanVien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_nhanVien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_nhanVien.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this nhan vien is gioi tinh.
	*
	* @param GioiTinh the gioi tinh of this nhan vien
	*/
	@Override
	public void setGioiTinh(boolean GioiTinh) {
		_nhanVien.setGioiTinh(GioiTinh);
	}

	/**
	* Sets the group ID of this nhan vien.
	*
	* @param groupId the group ID of this nhan vien
	*/
	@Override
	public void setGroupId(long groupId) {
		_nhanVien.setGroupId(groupId);
	}

	/**
	* Sets the ID of this nhan vien.
	*
	* @param Id the ID of this nhan vien
	*/
	@Override
	public void setId(long Id) {
		_nhanVien.setId(Id);
	}

	/**
	* Sets the modified date of this nhan vien.
	*
	* @param modifiedDate the modified date of this nhan vien
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_nhanVien.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_nhanVien.setNew(n);
	}

	/**
	* Sets the ngay sinh of this nhan vien.
	*
	* @param NgaySinh the ngay sinh of this nhan vien
	*/
	@Override
	public void setNgaySinh(Date NgaySinh) {
		_nhanVien.setNgaySinh(NgaySinh);
	}

	/**
	* Sets the primary key of this nhan vien.
	*
	* @param primaryKey the primary key of this nhan vien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhanVien.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_nhanVien.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ten nv of this nhan vien.
	*
	* @param TenNV the ten nv of this nhan vien
	*/
	@Override
	public void setTenNV(String TenNV) {
		_nhanVien.setTenNV(TenNV);
	}

	/**
	* Sets the user ID of this nhan vien.
	*
	* @param userId the user ID of this nhan vien
	*/
	@Override
	public void setUserId(long userId) {
		_nhanVien.setUserId(userId);
	}

	/**
	* Sets the user name of this nhan vien.
	*
	* @param userName the user name of this nhan vien
	*/
	@Override
	public void setUserName(String userName) {
		_nhanVien.setUserName(userName);
	}

	/**
	* Sets the user uuid of this nhan vien.
	*
	* @param userUuid the user uuid of this nhan vien
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_nhanVien.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this nhan vien.
	*
	* @param uuid the uuid of this nhan vien
	*/
	@Override
	public void setUuid(String uuid) {
		_nhanVien.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<NhanVien> toCacheModel() {
		return _nhanVien.toCacheModel();
	}

	@Override
	public NhanVien toEscapedModel() {
		return new NhanVienWrapper(_nhanVien.toEscapedModel());
	}

	@Override
	public String toString() {
		return _nhanVien.toString();
	}

	@Override
	public NhanVien toUnescapedModel() {
		return new NhanVienWrapper(_nhanVien.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _nhanVien.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhanVienWrapper)) {
			return false;
		}

		NhanVienWrapper nhanVienWrapper = (NhanVienWrapper)obj;

		if (Objects.equals(_nhanVien, nhanVienWrapper._nhanVien)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _nhanVien.getStagedModelType();
	}

	@Override
	public NhanVien getWrappedModel() {
		return _nhanVien;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _nhanVien.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _nhanVien.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_nhanVien.resetOriginalValues();
	}

	private final NhanVien _nhanVien;
}