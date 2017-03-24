package cn.itcast.struts2.methodpattern;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	public String pattern(){
   	 System.out.println("UserAction!");
   	return SUCCESS;
   }
	  //保存用户
       public String SaveUser(){
    	   System.out.println("Save User!");
    	   return SUCCESS;
    	   
       }
        //删除用户
       public String deleteUser(){
    	   System.out.println("Delete User!");
    	   return SUCCESS;
    	   
       }
       //修改用户
        public String updateUser(){
        	System.out.println("Update User");
        	return SUCCESS;
        }
}
