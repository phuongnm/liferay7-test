create table neo_NhanVien (
	uuid_ VARCHAR(75) null,
	Id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	TenNV VARCHAR(75) null,
	GioiTinh BOOLEAN,
	Email VARCHAR(75) null,
	NgaySinh DATE null,
	DiaChi VARCHAR(75) null
);