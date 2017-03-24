package cn.itcast.servlet_refactory.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ActionListener implements ServletContextListener {


	public void contextDestroyed(ServletContextEvent arg0) {
		/**
		 * 
		 * 当context被销毁时，销毁这个actions
		 * 
		 */
		 arg0.getServletContext().setAttribute("actions",null);

	}

	
	public void contextInitialized(ServletContextEvent arg0) {
		 /**
		  * 
		  * 创建一个map集合存储Action信息
		  */
		 Map<String,String> map = new HashMap<String,String>();
		 /**
		  * 
		  * 将action信息放入到map集合中
		  */
		 map.put("UserAction", "cn.itcast.servlet_refactory.action.UserAction");
		  /**
		   * 
		   * 将集合放入到application中
		   */
		 arg0.getServletContext().setAttribute("actions", map);

	}

}
