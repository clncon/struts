package cn.itcast.struts.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import cn.itcast.struts.dao.UserDao;
import cn.itcast.struts.domain.User;
import cn.itcast.struts.utils.DBUtils;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> getAllUser() {
		Connection conn = DBUtils.getConnection();
		List<User> userList = new ArrayList<User>();
		if(conn!=null){
			String sql = "select * from s_user";
	        try {
	        	Statement stmt = (Statement) conn.createStatement();
	        	ResultSet rs = stmt.executeQuery(sql);
	        	 while(rs.next()){
	        			User user = new User();
	    				user.setEducation(rs.getString("education"));
	    				user.setUsername(rs.getString("username"));
	    				user.setSex(rs.getString("sex"));
	    				user.setUserID(rs.getLong("userID"));
	    				user.setTelphone(rs.getString("telephone"));
	    				userList.add(user);
	        	 }
	        	
	        	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		 return userList;
	}

	@Override
	public User findUserByID(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		Connection conn = DBUtils.getConnection();
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("insert into s_user (username,password,sex,birthday,education,telephone,interest,path,filename,remark) values");
		stringBuffer.append("('");
		stringBuffer.append(user.getUsername());
		stringBuffer.append("','");
		stringBuffer.append(user.getPassword());
		stringBuffer.append("','");
		stringBuffer.append(user.getSex());
		stringBuffer.append("','");
		stringBuffer.append(user.getBirthday());
		stringBuffer.append("','");
		stringBuffer.append(user.getEducation());
		stringBuffer.append("','");
		stringBuffer.append(user.getTelphone());
		
		stringBuffer.append("','");
		stringBuffer.append(user.getInterest());
		stringBuffer.append("','");
		stringBuffer.append(user.getPath());
		stringBuffer.append("','");
		stringBuffer.append(user.getFilename());
		stringBuffer.append("','");
		stringBuffer.append(user.getRemark());
		stringBuffer.append("');");
		try {
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(stringBuffer.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		Connection conn = DBUtils.getConnection();
		if(conn!=null){
			String sql = "select * from s_user where username='"+username+"' and password='"+password+"'";
	        try {
	        	Statement stmt = (Statement) conn.createStatement();
	        	ResultSet rs = stmt.executeQuery(sql);
	        	 User user = new User();
	        	 if(rs.next()){
	        		 user.setUserID(rs.getLong("userID"));
	        	     user.setUsername(rs.getString("username"));
	        	     user.setPassword(rs.getString("password"));
	        	     return user;
	        	 }
	        	 else{
	        		 return null;
	        	 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}

}
