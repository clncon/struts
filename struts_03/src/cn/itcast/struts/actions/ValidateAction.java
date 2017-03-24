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
			this.addFieldError("username","�û�������Ϊ��");
		}
		if("".equals(this.getPassword())){
			this.addFieldError("password", "���벻��Ϊ��");
			
		}
		if(this.getPassword().length()<6){
			this.addFieldError("password", "����ĳ��Ȳ���С��6λ");
		}
		if(!this.getUsername().matches("[\u3400-\uFA29]+")){
			this.addFieldError("username", "�û�������������");
		}
	}
	 
	 

}
