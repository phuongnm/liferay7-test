<%@ include file="/init.jsp"%>
<portlet:actionURL name="addNhanVien" var="addNhanVienURL">
</portlet:actionURL>

<aui:form action="${addNhanVienURL}">
<aui:input name="TenNV" label="TenNV"></aui:input>
<aui:input name="" type="submit" value="add-nv"></aui:input>
</aui:form>
