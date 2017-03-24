package cn.itcast.struts.actions;

import com.opensymphony.xwork2.ActionContext;

public class PropertyDriverAction {
       private String username;
       private String password;
       private String phone;
       
       
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    public String testPrpertyDriver(){
    	
    	System.out.println(this.username);
    	System.out.println(this.password);
    	System.out.println(this.phone);
    	ActionContext.getContext().put("username",this.username);
    	ActionContext.getContext().put("password",this.password);
    	ActionContext.getContext().put("phone",this.phone);
         return "property";
    }   
       
}
