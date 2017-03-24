package cn.itcast.struts.utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;

public class UploadUtil {
    public static String  saveUploadFile(File uploadResource,String fileName){
    	//获得能能把日期格式化的对象，格式话为yyyy/mm/dd
    	 SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    	 //得到文件上传的绝对路径
    	  String basePath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/upload");
    	  System.out.println(basePath);
    	  //将当前的日期转化成字符串
    	  String subPath = sdf.format(new Date());
    	   //判断此目录是否存在
    	  File dir = new File(basePath+subPath);
    	  if(!dir.exists()){
    		  //如果不存在就创建一个
    		  /*
    		   * mkdir():只会创建一级目录
    		   * mkdirs():可以创建多级目录
    		   * 
    		   */
    		  dir.mkdirs();
    		  System.out.println(dir);
    	  }
    	  //取得正式的全路径(带文件名的)
    	  String path = basePath+subPath+UUID.randomUUID().toString()+"_"+fileName;
    	  //创建一个文件
    	  File file = new File(path);
    	   //将文件移动到file中
    	  uploadResource.renameTo(file);
    	return path;
    }
}
