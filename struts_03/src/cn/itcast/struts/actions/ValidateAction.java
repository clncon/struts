package cn.itcast.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;

public class ValidateAction extends ActionSupport {
	
	 private String username;
	 private String password;
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
	
	 public String testValidate(){
		 return "validate";
	 }
	@Override
	public void validate() {
		if("".equals(this.getUsername())){
			this.addFieldError("username","用户名不能为空");
		}
		if("".equals(this.getPassword())){
			this.addFieldError("password", "密码不能为空");
			
		}
		if(this.getPassword().length()<6){
			this.addFieldError("password", "密码的长度不能小于6位");
		}
		if(!this.getUsername().matches("[\u3400-\uFA29]+")){
			this.addFieldError("username", "用户名必须是中文");
		}
	}
	 
	 

}
