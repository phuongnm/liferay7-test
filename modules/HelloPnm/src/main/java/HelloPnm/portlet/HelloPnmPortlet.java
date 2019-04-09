package HelloPnm.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import Hello.Services.model.NhanVien;
import Hello.Services.service.NhanVienLocalServiceUtil;
import HelloPnm.constants.HelloPnmPortletKeys;

/**
 * @author phuon
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.phuongnm",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + HelloPnmPortletKeys.HelloPnm,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HelloPnmPortlet extends MVCPortlet {

	private static final Log log=LogFactoryUtil.getLog(HelloPnmPortlet.class);
	 @Override
	 public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	   throws IOException, PortletException {
	  // TODO Auto-generated method stub
	  super.render(renderRequest, renderResponse);
	 }
	 
	 
	 @ProcessAction(name="addNhanVien")
	 public void addNhanVien(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
	  log.info("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
	  
	  String tenNV=ParamUtil.getString(actionRequest,"TenNV","empty");
	  log.info("XXXXXXXXXXXXXXXXXXx=="+tenNV);
	  
	  ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	  
	  NhanVien pr = NhanVienLocalServiceUtil.createNhanVien(CounterLocalServiceUtil.increment());
	  pr.setTenNV(tenNV);
	  pr.setCreateDate(new Date());
	  pr.setCompanyId(themeDisplay.getCompanyId());
	   pr = NhanVienLocalServiceUtil.addNhanVien(pr);
	  
	 }
}