package cn.itcast.struts.action;

import java.io.File;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.struts.domain.User;
import cn.itcast.struts.service.Service;
import cn.itcast.struts.utils.UploadUtil;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User model = new User();
	private Service service = new Service();
	private File upload;//该属性用于文件上传
	private String uploadFileName;
	
     public File getUpload() {
		return upload;
	}


	public void setUpload(File upload) {
		this.upload = upload;
	}


	public String getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

      public String addUI(){
		return "add";
    	  
      }
	/**
      * 
      * 显示所有的用户信息
      * @return
      */
	public String showAllUser(){
		
		List<User> userlist = this.service.getAllUser();
	  ActionContext.getContext().put("UserList", userlist);
		return "list";
	}
	
	
	 /**
	  * 
	  * 取得模型
	  */
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
   
	
	 public String add(){
		User user = this.getModel();
		String path = UploadUtil.saveUploadFile(upload, uploadFileName);
		user.setFilename(uploadFileName);
		user.setPath(path);
		service.saveUser(user);
		 return "action2Action";
	 }
}
