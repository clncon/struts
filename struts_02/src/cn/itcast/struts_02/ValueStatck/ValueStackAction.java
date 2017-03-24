package cn.itcast.struts_02.ValueStatck;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.sun.mail.pop3.POP3Folder;

public class ValueStackAction extends ActionSupport {

	
	   /**
	    * 获得值栈的三种方法
	    */
	public String testValueStack(){
		 //第一种方式
		 ValueStack  valueStack = ActionContext.getContext().getValueStack();
		 //第二种方法
		 ValueStack valueStack2 = ServletActionContext.getContext().getValueStack();
		 //第三种方法
		 ValueStack valueStack3 = (ValueStack) ServletActionContext.getRequest().getAttribute("struts.valueStack");
		 
		//打印这三个值栈，看是不是单例的
		  System.out.println(valueStack.hashCode());
		  System.out.println(valueStack2.hashCode());
		  System.out.println(valueStack3.hashCode());
		  
		   //结论
		     //值栈是单例的
		return SUCCESS;
	}
	
	/*
	 * 向对象栈添加数据的第一种方式
	 */
	public String addDataToObjectStack_1(){
		 ValueStack valuestack = ActionContext.getContext().getValueStack();
		 //把字符串添加到了CompoundRoot的第一个位置，我们把第一个位置称为对象栈的栈顶
		   valuestack.push("aaa");
		return SUCCESS;
	}
	
	
	/*
	 * 向对象栈添加数据的第二种方式
	 */
	public String addDataToObjectStack_2(){
		 ValueStack valuestack = ActionContext.getContext().getValueStack();
		 //把字符串添加到了对象栈中,放到了栈底位置
		   valuestack.getRoot().add("aaaaaaaa");
		return SUCCESS;
	}
	
	
	/*
	 * 向对象栈添加数据的第三种方式
	 */
	public String addDataToObjectStack_3(){
		ValueStack valuestack = ActionContext.getContext().getValueStack();
		// 把字符串添加到了对象栈中, 把一个map放入到了对象栈的栈顶,"aaa"作为key,"asfd"作为value
		valuestack.set("aaaa", "aaaa");
		return SUCCESS;
	}
	
	/*
	 * 把数据从对象栈中取出来的第一种方式
	 * 
	 */
	
     public String addDataFromObjectStack_01(){
    	   ValueStack valuestack = ActionContext.getContext().getValueStack();
    	   //取得栈顶元素
    	    valuestack.getRoot().get(0);
    	 return SUCCESS;
     }
     /*
      * 把数据从对象栈中取出来的第二种方式
      * 
      */
     
     public String addDataFromObjectStack_02(){
    	 ValueStack valuestack = ActionContext.getContext().getValueStack();
    	 //取得栈顶元素
    	 valuestack.peek();
    	 return SUCCESS;
     }
     /*
      * 把对象栈的栈顶的元素移除
      * 
      */
     
     public String removeDataFromObjectStack_01(){
    	 ValueStack valuestack = ActionContext.getContext().getValueStack();
    	 //移除栈顶元素
    	 valuestack.getRoot().remove(0);
    	 return SUCCESS;
     }
     /*
      * 把对象栈的栈顶的元素移除
      * 
      */
     
     public String removeDataFromObjectStack_02(){
    	 ValueStack valuestack = ActionContext.getContext().getValueStack();
    	 //移除栈顶元素
    	 valuestack.pop();
    	 return SUCCESS;
     }
     
     /*
      * 把一对key,value键值对放到request域中
      */
      public String putObjectToRequest(){
    	  
    	   ServletActionContext.getRequest().setAttribute("aaa", "aaaaa");
    	  ValueStack valuestack = ActionContext.getContext().getValueStack();
    	  
    	   
    	  return SUCCESS;
      }
      /*
       * 把一对key,value键值对放到request域中
       */
      public String putObjectToApplication(){
    	  
    	  ServletActionContext.getServletContext().setAttribute("bbbb","bbbbbbb");
    	  ValueStack valuestack = ActionContext.getContext().getValueStack();
    	  
    	  
    	  return SUCCESS;
      }
      /*
       * 把一对key,value键值对直接方法map栈中
       */
      public String putObjectToMapStack_1(){
    	  
    	
    	   ValueStack valuestack = ActionContext.getContext().getValueStack();
    	   ActionContext.getContext().put("ccc","ccccc");
    	  
    	  return SUCCESS;
      }
}
