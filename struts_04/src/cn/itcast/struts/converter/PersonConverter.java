package cn.itcast.struts.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import cn.itcast.struts.domain.Person;

public class PersonConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		System.out.println(values[0]);
		String[] temp = values[0].split(",");
		Person person = new Person();
		person.setUsername(temp[0]);
		person.setPassword(temp[1]);
		return person;
	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
