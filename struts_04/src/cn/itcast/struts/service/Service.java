package cn.itcast.struts.service;

import java.util.List;

import cn.itcast.struts.dao.impl.UserDaoImpl;
import cn.itcast.struts.domain.User;

public class Service {
        
	   UserDaoImpl userdaoimpl = new UserDaoImpl();  
	    /**
	     * ��¼
	     * @param username
	     * @param password
	     * @return
	     */
	  public User login(String username,String password){
		  
		   return userdaoimpl.getUserByUsernameAndPassword(username, password);
	  }
	 
	   /**
	    * ȡ�����е��û���Ϣ
	    * @return
	    */
	  public List<User> getAllUser(){
		  
		  return userdaoimpl.getAllUser();
	  }  
	  
	    /**
	     * �����û���Ϣ
	     * @param user
	     */
	  public void saveUser(User user){
		  userdaoimpl.saveUser(user);
		  
	  }
}