package cn.itcast.struts.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	 private static String DBDriver = "com.mysql.jdbc.Driver";
	 private static String DBUrl = "jdbc:mysql:///struts?useUnicode=true&characterEncoding=utf8";
	 private static String DBUser = "root";
	 private static String DBPassword = "root";
	 private static Connection conn = null;
	 
	 static{
		 try {
			Class.forName(DBDriver);
		     conn = DriverManager.getConnection(DBUrl, DBUser, DBPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 //取得连接
	  public static Connection getConnection(){
		  return conn;
	  }
	  
	  //关闭数据库的连接
	   public static void close() throws SQLException{
		   conn.close();
	   }

}
