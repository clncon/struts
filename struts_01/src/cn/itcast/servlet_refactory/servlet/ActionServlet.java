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
                 
		     //1.ȡ������ĵ�uri
		      String uri  = request.getRequestURI();
		       //��ȡuriȡ�÷��ʵ�action
		       String actionName =  StringUtils.parse(uri);
		       System.out.println(actionName);
		       //��application��ȡ����Ӧclass����
		      Map<String,String> map = (Map<String, String>) request.getServletContext().getAttribute("actions");
		      String className = map.get(actionName);
		      System.out.println(className);
		      try {
		    	  //����classNameȡ�ö���
				Class ActionClass  = Class.forName(className);
				 //����className�е�execute����
				 //ע������Ҫ��request��response���з��䣬����ֱ��getClass()
				  Class requestClass = Class.forName("javax.servlet.http.HttpServletRequest");
				  Class responseClass = Class.forName("javax.servlet.http.HttpServletResponse");
			    Method method =  ActionClass.getMethod("execute",requestClass,responseClass);
			     //ִ�з���
			     String result = (String) method.invoke(ActionClass.newInstance(), request,response);
			     //ת��
			      request.getRequestDispatcher(result).forward(request, response);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}

}
