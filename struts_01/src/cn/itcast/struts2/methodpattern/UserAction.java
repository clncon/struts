package cn.itcast.struts2.methodpattern;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	public String pattern(){
   	 System.out.println("UserAction!");
   	return SUCCESS;
   }
	  //�����û�
       public String SaveUser(){
    	   System.out.println("Save User!");
    	   return SUCCESS;
    	   
       }
        //ɾ���û�
       public String deleteUser(){
    	   System.out.println("Delete User!");
    	   return SUCCESS;
    	   
       }
       //�޸��û�
        public String updateUser(){
        	System.out.println("Update User");
        	return SUCCESS;
        }
}
