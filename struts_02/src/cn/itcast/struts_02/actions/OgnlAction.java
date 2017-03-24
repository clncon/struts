package cn.itcast.struts_02.actions;


import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.struts_02.entity.Person;

public class OgnlAction extends ActionSupport{
       /*
        * 
        * 测试debug
        */
	
	  public String testDebug(){
		  /*//放入数据到map栈中 
		  ActionContext.getContext().put("aaa","aaa");*/
		  //放入数据到对象栈中
		  ActionContext.getContext().getValueStack().push("bbbb");
		  //将数据放入到request域对象中
		  ServletActionContext.getRequest().setAttribute("aa_Request", "aa_Request");
		  return "Debug";
	  }
	  
	   /**
	    *把一个String数据放入到对象栈中并显示出来
	    * 
	    */
	  
	     public String addStringToObjectStack(){
	    	  //使用此方式在对象栈中添加数据时，要指定index为0
	    	 ActionContext.getContext().getValueStack().getRoot().add(0,"aaaaaa");
	    	 // ActionContext.getContext().getValueStack().push("bbbbbbbbb");
	    	 return "ObjectStack"; 
	     }
	     /**
	      *把一个对象放入到对象栈中并显示出来
	      * 
	      */
	     
	     public String addObjectToObjectStack(){
	    	 Person person = new Person();
	    	 person.setId(1);
	    	 person.setName("张三");
	    	 ActionContext.getContext().getValueStack().push(person);
	    	 return "ObjectStack"; 
	     }
	     
	      //ognl表达式是根据getName方法来取得对象的值得，setName()方法来设置对象的值
	       //当Action和对象中都有getXxx方法时，以对象中的为先
	     public String getName(){
	    	 
	    	 return "ObjectStack";
	     }
	     
	     /*
	      * 把一个map对象放入到对象栈的
	      * 
	      */
	     
	      public String addMapToObjectStack(){
	    	  Map<String,String> map = new HashMap<String,String>();
	    	   map.put("aaaa", "aaaa");
	    	   ActionContext.getContext().getValueStack().push(map);
	    	  return "ObjectStack";
	      }
	      /*
	       * 在map栈中存放一个key,value
	       * 
	       */
	      
	      public String addKeyValueToMapStack(){
	    	
	    	  ActionContext.getContext().put("bbb", "bbbb");
	    	  return "ObjectStack";
	      }
	      /*
	       * 在request域中存放一个值
	       * 
	       */
	      
	      public String addValueToRequest(){
	    	  
	    	  ServletActionContext.getRequest().setAttribute("bb_request", "bb_request");
	    	  return "ObjectStack";
	      }
	      /*
	       * 在application域中存放一个值
	       * 
	       */
	      
	      public String addValueToApplication(){
	    	  
	    	  ServletActionContext.getServletContext().setAttribute("cc_application", "cc_application");;
	    	  return "ObjectStack";
	      }
	      /*
	       * 在session域中存放一个值
	       * 
	       */
	      
	      public String addValueToSession(){
	    	  
	    	  ServletActionContext.getRequest().getSession().setAttribute("dd_session", "dd_session");
	    	  return "ObjectStack";
	      }
	      /*
	       * 把一个对象放到request域中
	       * 
	       */
	      
	      public String addObjectToRequest(){
	    	  
	          Person person = new Person();
	          person.setId(2);
	          person.setName("李四");
	          ServletActionContext.getRequest().setAttribute("person", person);
	    	  return "ObjectStack";
	      }
	      /*
	       * 使用parameters访问表单中的数据
	       * 
	       */
	      
	      public String testParameters(){
	    	  return "ObjectStack";
	      }
	      /*
	       * 使用attr访问各个域中的值
	       * 
	       */
	      
	      public String testAttr(){
	    	  ServletActionContext.getRequest().setAttribute("a_app", "a_app");
	    	  return "ObjectStack";
	      }
	      /*
	       * 创建三个Person对象，将这三个对象放入到集合中，再将这个集合放入到map中
	       * 
	       */
	      
	      public String testIterator(){
	    	  Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("张三");
	    	  
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("李四");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("王五");
	    	   
	    	   List<Person> list = new ArrayList<Person>();
	    	    list.add(person1);
	    	    list.add(person2);
	    	    list.add(person3);
	    	   ActionContext.getContext().put("personList", list);
	    	   
	    	   
	    	   
	    	 
	    	  return "Iterator";
	      }
	      /*
	       * 创建三个Person对象,创建一个map对象，将这三个对象放入到map集合中
	       */
	      
	      public String testMap(){
	    	  Person person1 = new Person();
	    	  person1.setId(1);
	    	  person1.setName("张三");
	    	  
	    	  Person person2 = new Person();
	    	  person2.setId(2);
	    	  person2.setName("李四");
	    	  
	    	  Person person3 = new Person();
	    	  person3.setId(3);
	    	  person3.setName("王五");
	    	 
	    	  Map<String,Person> map = new HashMap<String, Person>();
	    	     map.put("person1",person1);
	    	     map.put("person2",person2);
	    	     map.put("person3",person3);
	    	  ActionContext.getContext().put("personMap",map);
	    	  
	    	  return "Iterator";
	      }
	      
	      /**
	       * 数组的情况
	       */
	      
	       public String testArray(){
	    	   Person person1 = new Person();
		    	  person1.setId(1);
		    	  person1.setName("张三");
		    	  
		    	  Person person2 = new Person();
		    	  person2.setId(2);
		    	  person2.setName("李四");
		    	  
		    	  Person person3 = new Person();
		    	  person3.setId(3);
		    	  person3.setName("王五");
		    	 
		    	Person[] array = new Person[]{person1,person2,person3};
		    	ActionContext.getContext().put("Array",array);
		    	return "Iterator";
	    	   
	       }
	       /**
	        * Set的情况
	        */
	       
	       public String testSet(){
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("张三");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("李四");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("王五");
	    	   
	    	  Set<Person> set = new HashSet<Person>();
	    	   set.add(person1);
	    	   set.add(person2);
	    	   set.add(person3);
	    	   ActionContext.getContext().put("Set",set);
	    	   return "Iterator";
	    	   
	       }
	       /**
	        * List<Map<String,Person>>的情况
	        */
	       
	       public String testListMap(){
	    	 List<Map<String,Person>> listMap = new ArrayList<Map<String,Person>>();
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("张三");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("李四");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("王五");
	    	   
	    	 Map<String,Person> map = new HashMap<String, Person>();
	    	    map.put("person1",person1);
	    	    map.put("person2",person2);
	    	    map.put("person3",person3);
	    	    listMap.add(map);
	    	   ActionContext.getContext().put("ListMap",listMap);
	    	   return "Iterator";
	    	   
	       }
	       /**
	        *  Map<String,List<Person>>情况
	        */
	       
	       public String testMapList(){
	    	  Map<String,List<Person>> mapList = new HashMap<String, List<Person>>();
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("张三");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("李四");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("王五");
	    	   
	    	   List<Person> list = new ArrayList<Person>();
	    	    list.add(person1);
	    	   list.add(person2);
	    	   list.add(person3);
	    	   mapList.put("PersonList",list);
	    	   ActionContext.getContext().put("MapList",mapList);
	    	   return "Iterator";
	    	   
	       }
	       /**
	        *   List<Map<String,List<Person>>>情况
	        */
	       
	       public String testListMapList(){
	    	  List<Map<String,List<Person>>> listMapList = new ArrayList<Map<String,List<Person>>>();
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("张三");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("李四");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("王五");
	    	   
	    	   List<Person> list = new ArrayList<Person>();
	    	   list.add(person1);
	    	   list.add(person2);
	    	   list.add(person3);
	    	   Map<String,List<Person>> mapList = new HashMap<String, List<Person>>();
	    	   mapList.put("personList",list);
	    	   listMapList.add(mapList);
	    	   ActionContext.getContext().put("ListMapList",listMapList);
	    	   return "Iterator";
	    	   
	       }
	     
}
