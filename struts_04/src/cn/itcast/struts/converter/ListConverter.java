package cn.itcast.struts.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class ListConverter extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
         List<String> list = new ArrayList<String>();
          for(String s:values){
        	  list.add(s);
        	  
          }
		return list;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
