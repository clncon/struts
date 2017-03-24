package cn.itcast.struts.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class InterceptorAction extends ActionSupport {
    public String SaveUser(){
    	ActionContext.getContext().getValueStack().push("保存用户信息成功");
    	return "interceptor_privilege";
    }
}
