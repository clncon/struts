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
	  //�����û�
       public String SaveUser(){
    	   System.out.println("Save User!");
    	   return "m1";
    	   
       }
        //ɾ���û�
       public String deleteUser(){
    	   System.out.println("Delete User!");
    	   return "m2";
    	   
       }
       //�޸��û�
        public String updateUser(){
        	System.out.println("Update User");
        	return "m3";
        }
}
