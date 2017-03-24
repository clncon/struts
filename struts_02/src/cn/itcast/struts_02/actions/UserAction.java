package cn.itcast.struts_02.actions;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	
	
	 public UserAction(){
		 System.out.println(this.hashCode());
		 
	 }
	public String pattern(){
   	 System.out.println("UserAction!");
   	return null;
   }
	  //保存用户
       public String SaveUser(){
    	   System.out.println("Save User!");
    	   return "m1";
    	   
       }
        //删除用户
       public String deleteUser(){
    	   System.out.println("Delete User!");
    	   return "m2";
    	   
       }
       //修改用户
        public String updateUser(){
        	System.out.println("Update User");
        	return "m3";
        }
}
