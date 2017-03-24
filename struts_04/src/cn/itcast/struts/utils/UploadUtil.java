package cn.itcast.struts.utils;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;

public class UploadUtil {
    public static String  saveUploadFile(File uploadResource,String fileName){
    	//������ܰ����ڸ�ʽ���Ķ��󣬸�ʽ��Ϊyyyy/mm/dd
    	 SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    	 //�õ��ļ��ϴ��ľ���·��
    	  String basePath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/upload");
    	  System.out.println(basePath);
    	  //����ǰ������ת�����ַ���
    	  String subPath = sdf.format(new Date());
    	   //�жϴ�Ŀ¼�Ƿ����
    	  File dir = new File(basePath+subPath);
    	  if(!dir.exists()){
    		  //��������ھʹ���һ��
    		  /*
    		   * mkdir():ֻ�ᴴ��һ��Ŀ¼
    		   * mkdirs():���Դ����༶Ŀ¼
    		   * 
    		   */
    		  dir.mkdirs();
    		  System.out.println(dir);
    	  }
    	  //ȡ����ʽ��ȫ·��(���ļ�����)
    	  String path = basePath+subPath+UUID.randomUUID().toString()+"_"+fileName;
    	  //����һ���ļ�
    	  File file = new File(path);
    	   //���ļ��ƶ���file��
    	  uploadResource.renameTo(file);
    	return path;
    }
}
