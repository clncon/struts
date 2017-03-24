package cn.itcast.struts.service;

import java.util.List;

import cn.itcast.struts.dao.impl.UserDaoImpl;
import cn.itcast.struts.domain.User;

public class Service {
        
	   UserDaoImpl userdaoimpl = new UserDaoImpl();  
	    /**
	     * 登录
	     * @param username
	     * @param password
	     * @return
	     */
	  public User login(String username,String password){
		  
		   return userdaoimpl.getUserByUsernameAndPassword(username, password);
	  }
	 
	   /**
	    * 取得所有的用户信息
	    * @return
	    */
	  public List<User> getAllUser(){
		  
		  return userdaoimpl.getAllUser();
	  }  
	  
	    /**
	     * 保存用户信息
	     * @param user
	     */
	  public void saveUser(User user){
		  userdaoimpl.saveUser(user);
		  
	  }
}