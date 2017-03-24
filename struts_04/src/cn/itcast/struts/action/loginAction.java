package cn.itcast.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.struts.domain.User;
import cn.itcast.struts.service.Service;

public class loginAction extends ActionSupport implements ModelDriven<User>{
	User model = new User();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
	
	 
	public String login(){
		Service service = new Service();
		 User user = service.login(this.getModel().getUsername(), this.getModel().getPassword());
		 if(user==null){
			 this.addActionError("用户名或者密码错误");
			 return "login";
		 }
		return "home";
	}

}
