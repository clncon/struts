package cn.itcast.servlet_refactory.utils;

public class StringUtils {

	public static String parse(String uri) {
		
		//1.对uri进行分割
		  String[] temp = uri.split("/");
		//2.得到action
		 String actionName = temp[temp.length-1].substring(0,temp[temp.length-1].indexOf("."));
		  return actionName;
	}

}
