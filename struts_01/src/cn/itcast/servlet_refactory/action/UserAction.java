package cn.itcast.servlet_refactory.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction {
	//ҵ���߼�����
	 public String execute(HttpServletRequest request, HttpServletResponse response){
		  System.out.println("ִ�гɹ�");
		  return "index.jsp";
		 
	 }

}
