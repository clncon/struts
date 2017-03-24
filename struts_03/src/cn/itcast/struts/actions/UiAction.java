package cn.itcast.struts.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.struts.bean.Person;

public class UiAction extends ActionSupport{
   
	
	
	 private String aa ;
	 
	  public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public String testList(){
		 Person person1 = new Person();
		   person1.setPid(1);
		   person1.setName("刺客");
		 
		   Person person2 = new Person();
		   person2.setPid(2);
		   person2.setName("刺客2");
		   
		   Person person3 = new Person();
		   person3.setPid(3);
		   person3.setName("刺客3");
		   
		   List<Person> personList = new ArrayList<Person>();
		     personList.add(person1);
		     personList.add(person2);
		     personList.add(person3);
		     ActionContext.getContext().put("personList", personList);
		   
		  return "ui";
	  }
	  
	   /**
	    * 
	    * 数据的回显
	    */
	  
	  public String showBackData(){
		  
		   Person person = new Person();
		    person.setPid(1);
		    person.setName("会显得信息");
		    this.aa = "abcde";
		   // ActionContext.getContext().put("person", person);
		    ActionContext.getContext().getValueStack().push(person);
		  return "ui";
	  }
}
