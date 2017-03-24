package cn.itcast.struts.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PrivilegeInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		String username = ServletActionContext.getRequest().getParameter("username");
		if("admin".equals(username)){
			arg0.invoke();
		}else{
			
			ActionContext.getContext().getValueStack().push("你没有保存用户信息的权限");
		}
		return "interceptor_privilege";
	}

}
