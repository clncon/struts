package cn.itcast.struts2.methodpattern;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
    public String pattern(){
    	 System.out.println("PersonAction !");
    	return SUCCESS;
    }
}
