package cn.itcast.servlet_refactory.utils;

public class StringUtils {

	public static String parse(String uri) {
		
		//1.��uri���зָ�
		  String[] temp = uri.split("/");
		//2.�õ�action
		 String actionName = temp[temp.length-1].substring(0,temp[temp.length-1].indexOf("."));
		  return actionName;
	}

}
