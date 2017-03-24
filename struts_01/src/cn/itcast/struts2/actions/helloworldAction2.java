package cn.itcast.struts2.actions;

import com.opensymphony.xwork2.Action;

public class helloworldAction2 implements Action{

	
	public String execute() throws Exception {
		System.out.println("hello World2!");
		return SUCCESS;
	}
	
	

}
