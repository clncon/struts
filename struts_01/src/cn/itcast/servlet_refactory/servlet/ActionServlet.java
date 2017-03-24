package cn.itcast.servlet_refactory.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet_refactory.utils.StringUtils;

public class ActionServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             this.doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 
		     //1.取得请求的的uri
		      String uri  = request.getRequestURI();
		       //截取uri取得访问的action
		       String actionName =  StringUtils.parse(uri);
		       System.out.println(actionName);
		       //从application中取出对应class对象
		      Map<String,String> map = (Map<String, String>) request.getServletContext().getAttribute("actions");
		      String className = map.get(actionName);
		      System.out.println(className);
		      try {
		    	  //反射className取得对象
				Class ActionClass  = Class.forName(className);
				 //反射className中的execute方法
				 //注意这里要对request和response进行反射，不能直接getClass()
				  Class requestClass = Class.forName("javax.servlet.http.HttpServletRequest");
				  Class responseClass = Class.forName("javax.servlet.http.HttpServletResponse");
			    Method method =  ActionClass.getMethod("execute",requestClass,responseClass);
			     //执行方法
			     String result = (String) method.invoke(ActionClass.newInstance(), request,response);
			     //转发
			      request.getRequestDispatcher(result).forward(request, response);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}

}
