package cn.itcast.struts.service;

import java.util.List;

import org.junit.Test;

import cn.itcast.struts.dao.impl.UserDaoImpl;
import cn.itcast.struts.domain.User;

public class ServiceTest {

	/*public static void main(String[] args) {
		 UserDaoImpl udl = new UserDaoImpl();
		User user = udl.getUserByUsernameAndPassword("admin", "admin");
		System.out.println(user.getUsername()+":"+user.getPassword());
	}*/
	
	 @Test
	 public void testGetAllUSer(){
		 UserDaoImpl udl = new UserDaoImpl();
		 List<User> list = udl.getAllUser();
		 for(User user :list){
			 
			 System.out.println(user.getUsername());
		 }
	 }
	 @Test
	 public void testSaveUser(){
		 UserDaoImpl udl = new UserDaoImpl();
		  User user = new User();
		 udl.saveUser(user);
	 }

}
