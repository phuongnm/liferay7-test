<%@ include file="/init.jsp"%>

<p>
	<b><liferay-ui:message key="hellopnm.caption" /></b>
</p>


<portlet:renderURL var="addNhanVienURL">
<portlet:param name="mvcPath" value="/addNhanVien.jsp"/>
</portlet:renderURL>


<aui:button onClick="${addNhanVienURL}" value="add-product"></aui:button>