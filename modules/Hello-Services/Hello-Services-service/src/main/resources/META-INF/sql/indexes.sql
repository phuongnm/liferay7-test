create index IX_2B56F66F on neo_NhanVien (GioiTinh);
create index IX_3190A4C4 on neo_NhanVien (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CDC38C46 on neo_NhanVien (uuid_[$COLUMN_LENGTH:75$], groupId);