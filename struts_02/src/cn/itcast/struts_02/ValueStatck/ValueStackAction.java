package cn.itcast.struts_02.ValueStatck;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.sun.mail.pop3.POP3Folder;

public class ValueStackAction extends ActionSupport {

	
	   /**
	    * ���ֵջ�����ַ���
	    */
	public String testValueStack(){
		 //��һ�ַ�ʽ
		 ValueStack  valueStack = ActionContext.getContext().getValueStack();
		 //�ڶ��ַ���
		 ValueStack valueStack2 = ServletActionContext.getContext().getValueStack();
		 //�����ַ���
		 ValueStack valueStack3 = (ValueStack) ServletActionContext.getRequest().getAttribute("struts.valueStack");
		 
		//��ӡ������ֵջ�����ǲ��ǵ�����
		  System.out.println(valueStack.hashCode());
		  System.out.println(valueStack2.hashCode());
		  System.out.println(valueStack3.hashCode());
		  
		   //����
		     //ֵջ�ǵ�����
		return SUCCESS;
	}
	
	/*
	 * �����ջ������ݵĵ�һ�ַ�ʽ
	 */
	public String addDataToObjectStack_1(){
		 ValueStack valuestack = ActionContext.getContext().getValueStack();
		 //���ַ�����ӵ���CompoundRoot�ĵ�һ��λ�ã����ǰѵ�һ��λ�ó�Ϊ����ջ��ջ��
		   valuestack.push("aaa");
		return SUCCESS;
	}
	
	
	/*
	 * �����ջ������ݵĵڶ��ַ�ʽ
	 */
	public String addDataToObjectStack_2(){
		 ValueStack valuestack = ActionContext.getContext().getValueStack();
		 //���ַ�����ӵ��˶���ջ��,�ŵ���ջ��λ��
		   valuestack.getRoot().add("aaaaaaaa");
		return SUCCESS;
	}
	
	
	/*
	 * �����ջ������ݵĵ����ַ�ʽ
	 */
	public String addDataToObjectStack_3(){
		ValueStack valuestack = ActionContext.getContext().getValueStack();
		// ���ַ�����ӵ��˶���ջ��, ��һ��map���뵽�˶���ջ��ջ��,"aaa"��Ϊkey,"asfd"��Ϊvalue
		valuestack.set("aaaa", "aaaa");
		return SUCCESS;
	}
	
	/*
	 * �����ݴӶ���ջ��ȡ�����ĵ�һ�ַ�ʽ
	 * 
	 */
	
     public String addDataFromObjectStack_01(){
    	   ValueStack valuestack = ActionContext.getContext().getValueStack();
    	   //ȡ��ջ��Ԫ��
    	    valuestack.getRoot().get(0);
    	 return SUCCESS;
     }
     /*
      * �����ݴӶ���ջ��ȡ�����ĵڶ��ַ�ʽ
      * 
      */
     
     public String addDataFromObjectStack_02(){
    	 ValueStack valuestack = ActionContext.getContext().getValueStack();
    	 //ȡ��ջ��Ԫ��
    	 valuestack.peek();
    	 return SUCCESS;
     }
     /*
      * �Ѷ���ջ��ջ����Ԫ���Ƴ�
      * 
      */
     
     public String removeDataFromObjectStack_01(){
    	 ValueStack valuestack = ActionContext.getContext().getValueStack();
    	 //�Ƴ�ջ��Ԫ��
    	 valuestack.getRoot().remove(0);
    	 return SUCCESS;
     }
     /*
      * �Ѷ���ջ��ջ����Ԫ���Ƴ�
      * 
      */
     
     public String removeDataFromObjectStack_02(){
    	 ValueStack valuestack = ActionContext.getContext().getValueStack();
    	 //�Ƴ�ջ��Ԫ��
    	 valuestack.pop();
    	 return SUCCESS;
     }
     
     /*
      * ��һ��key,value��ֵ�Էŵ�request����
      */
      public String putObjectToRequest(){
    	  
    	   ServletActionContext.getRequest().setAttribute("aaa", "aaaaa");
    	  ValueStack valuestack = ActionContext.getContext().getValueStack();
    	  
    	   
    	  return SUCCESS;
      }
      /*
       * ��һ��key,value��ֵ�Էŵ�request����
       */
      public String putObjectToApplication(){
    	  
    	  ServletActionContext.getServletContext().setAttribute("bbbb","bbbbbbb");
    	  ValueStack valuestack = ActionContext.getContext().getValueStack();
    	  
    	  
    	  return SUCCESS;
      }
      /*
       * ��һ��key,value��ֵ��ֱ�ӷ���mapջ��
       */
      public String putObjectToMapStack_1(){
    	  
    	
    	   ValueStack valuestack = ActionContext.getContext().getValueStack();
    	   ActionContext.getContext().put("ccc","ccccc");
    	  
    	  return SUCCESS;
      }
}
