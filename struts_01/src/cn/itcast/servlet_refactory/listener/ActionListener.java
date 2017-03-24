package cn.itcast.servlet_refactory.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ActionListener implements ServletContextListener {


	public void contextDestroyed(ServletContextEvent arg0) {
		/**
		 * 
		 * ��context������ʱ���������actions
		 * 
		 */
		 arg0.getServletContext().setAttribute("actions",null);

	}

	
	public void contextInitialized(ServletContextEvent arg0) {
		 /**
		  * 
		  * ����һ��map���ϴ洢Action��Ϣ
		  */
		 Map<String,String> map = new HashMap<String,String>();
		 /**
		  * 
		  * ��action��Ϣ���뵽map������
		  */
		 map.put("UserAction", "cn.itcast.servlet_refactory.action.UserAction");
		  /**
		   * 
		   * �����Ϸ��뵽application��
		   */
		 arg0.getServletContext().setAttribute("actions", map);

	}

}
