package cn.itcast.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;

public class helloworldAction3 extends ActionSupport{
	
	 public String execute(){
		
		 System.out.println("hello World3!");
		 return SUCCESS;
	 }

}
