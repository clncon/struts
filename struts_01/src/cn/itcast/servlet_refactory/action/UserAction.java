package cn.itcast.servlet_refactory.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction {
	//业务逻辑代码
	 public String execute(HttpServletRequest request, HttpServletResponse response){
		  System.out.println("执行成功");
		  return "index.jsp";
		 
	 }

}
