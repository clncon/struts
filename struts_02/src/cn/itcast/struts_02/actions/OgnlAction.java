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
        * ����debug
        */
	
	  public String testDebug(){
		  /*//�������ݵ�mapջ�� 
		  ActionContext.getContext().put("aaa","aaa");*/
		  //�������ݵ�����ջ��
		  ActionContext.getContext().getValueStack().push("bbbb");
		  //�����ݷ��뵽request�������
		  ServletActionContext.getRequest().setAttribute("aa_Request", "aa_Request");
		  return "Debug";
	  }
	  
	   /**
	    *��һ��String���ݷ��뵽����ջ�в���ʾ����
	    * 
	    */
	  
	     public String addStringToObjectStack(){
	    	  //ʹ�ô˷�ʽ�ڶ���ջ���������ʱ��Ҫָ��indexΪ0
	    	 ActionContext.getContext().getValueStack().getRoot().add(0,"aaaaaa");
	    	 // ActionContext.getContext().getValueStack().push("bbbbbbbbb");
	    	 return "ObjectStack"; 
	     }
	     /**
	      *��һ��������뵽����ջ�в���ʾ����
	      * 
	      */
	     
	     public String addObjectToObjectStack(){
	    	 Person person = new Person();
	    	 person.setId(1);
	    	 person.setName("����");
	    	 ActionContext.getContext().getValueStack().push(person);
	    	 return "ObjectStack"; 
	     }
	     
	      //ognl���ʽ�Ǹ���getName������ȡ�ö����ֵ�ã�setName()���������ö����ֵ
	       //��Action�Ͷ����ж���getXxx����ʱ���Զ����е�Ϊ��
	     public String getName(){
	    	 
	    	 return "ObjectStack";
	     }
	     
	     /*
	      * ��һ��map������뵽����ջ��
	      * 
	      */
	     
	      public String addMapToObjectStack(){
	    	  Map<String,String> map = new HashMap<String,String>();
	    	   map.put("aaaa", "aaaa");
	    	   ActionContext.getContext().getValueStack().push(map);
	    	  return "ObjectStack";
	      }
	      /*
	       * ��mapջ�д��һ��key,value
	       * 
	       */
	      
	      public String addKeyValueToMapStack(){
	    	
	    	  ActionContext.getContext().put("bbb", "bbbb");
	    	  return "ObjectStack";
	      }
	      /*
	       * ��request���д��һ��ֵ
	       * 
	       */
	      
	      public String addValueToRequest(){
	    	  
	    	  ServletActionContext.getRequest().setAttribute("bb_request", "bb_request");
	    	  return "ObjectStack";
	      }
	      /*
	       * ��application���д��һ��ֵ
	       * 
	       */
	      
	      public String addValueToApplication(){
	    	  
	    	  ServletActionContext.getServletContext().setAttribute("cc_application", "cc_application");;
	    	  return "ObjectStack";
	      }
	      /*
	       * ��session���д��һ��ֵ
	       * 
	       */
	      
	      public String addValueToSession(){
	    	  
	    	  ServletActionContext.getRequest().getSession().setAttribute("dd_session", "dd_session");
	    	  return "ObjectStack";
	      }
	      /*
	       * ��һ������ŵ�request����
	       * 
	       */
	      
	      public String addObjectToRequest(){
	    	  
	          Person person = new Person();
	          person.setId(2);
	          person.setName("����");
	          ServletActionContext.getRequest().setAttribute("person", person);
	    	  return "ObjectStack";
	      }
	      /*
	       * ʹ��parameters���ʱ��е�����
	       * 
	       */
	      
	      public String testParameters(){
	    	  return "ObjectStack";
	      }
	      /*
	       * ʹ��attr���ʸ������е�ֵ
	       * 
	       */
	      
	      public String testAttr(){
	    	  ServletActionContext.getRequest().setAttribute("a_app", "a_app");
	    	  return "ObjectStack";
	      }
	      /*
	       * ��������Person���󣬽�������������뵽�����У��ٽ�������Ϸ��뵽map��
	       * 
	       */
	      
	      public String testIterator(){
	    	  Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("����");
	    	  
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("����");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("����");
	    	   
	    	   List<Person> list = new ArrayList<Person>();
	    	    list.add(person1);
	    	    list.add(person2);
	    	    list.add(person3);
	    	   ActionContext.getContext().put("personList", list);
	    	   
	    	   
	    	   
	    	 
	    	  return "Iterator";
	      }
	      /*
	       * ��������Person����,����һ��map���󣬽�������������뵽map������
	       */
	      
	      public String testMap(){
	    	  Person person1 = new Person();
	    	  person1.setId(1);
	    	  person1.setName("����");
	    	  
	    	  Person person2 = new Person();
	    	  person2.setId(2);
	    	  person2.setName("����");
	    	  
	    	  Person person3 = new Person();
	    	  person3.setId(3);
	    	  person3.setName("����");
	    	 
	    	  Map<String,Person> map = new HashMap<String, Person>();
	    	     map.put("person1",person1);
	    	     map.put("person2",person2);
	    	     map.put("person3",person3);
	    	  ActionContext.getContext().put("personMap",map);
	    	  
	    	  return "Iterator";
	      }
	      
	      /**
	       * ��������
	       */
	      
	       public String testArray(){
	    	   Person person1 = new Person();
		    	  person1.setId(1);
		    	  person1.setName("����");
		    	  
		    	  Person person2 = new Person();
		    	  person2.setId(2);
		    	  person2.setName("����");
		    	  
		    	  Person person3 = new Person();
		    	  person3.setId(3);
		    	  person3.setName("����");
		    	 
		    	Person[] array = new Person[]{person1,person2,person3};
		    	ActionContext.getContext().put("Array",array);
		    	return "Iterator";
	    	   
	       }
	       /**
	        * Set�����
	        */
	       
	       public String testSet(){
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("����");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("����");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("����");
	    	   
	    	  Set<Person> set = new HashSet<Person>();
	    	   set.add(person1);
	    	   set.add(person2);
	    	   set.add(person3);
	    	   ActionContext.getContext().put("Set",set);
	    	   return "Iterator";
	    	   
	       }
	       /**
	        * List<Map<String,Person>>�����
	        */
	       
	       public String testListMap(){
	    	 List<Map<String,Person>> listMap = new ArrayList<Map<String,Person>>();
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("����");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("����");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("����");
	    	   
	    	 Map<String,Person> map = new HashMap<String, Person>();
	    	    map.put("person1",person1);
	    	    map.put("person2",person2);
	    	    map.put("person3",person3);
	    	    listMap.add(map);
	    	   ActionContext.getContext().put("ListMap",listMap);
	    	   return "Iterator";
	    	   
	       }
	       /**
	        *  Map<String,List<Person>>���
	        */
	       
	       public String testMapList(){
	    	  Map<String,List<Person>> mapList = new HashMap<String, List<Person>>();
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("����");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("����");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("����");
	    	   
	    	   List<Person> list = new ArrayList<Person>();
	    	    list.add(person1);
	    	   list.add(person2);
	    	   list.add(person3);
	    	   mapList.put("PersonList",list);
	    	   ActionContext.getContext().put("MapList",mapList);
	    	   return "Iterator";
	    	   
	       }
	       /**
	        *   List<Map<String,List<Person>>>���
	        */
	       
	       public String testListMapList(){
	    	  List<Map<String,List<Person>>> listMapList = new ArrayList<Map<String,List<Person>>>();
	    	   Person person1 = new Person();
	    	   person1.setId(1);
	    	   person1.setName("����");
	    	   
	    	   Person person2 = new Person();
	    	   person2.setId(2);
	    	   person2.setName("����");
	    	   
	    	   Person person3 = new Person();
	    	   person3.setId(3);
	    	   person3.setName("����");
	    	   
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
