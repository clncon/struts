package cn.itcast.struts.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.struts.domain.Person;

public class ConverterAction extends ActionSupport {
 
    private Person person;
    private List<String> likes;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
    
    public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public String testPersonConverter(){
    	System.out.println(this.getPerson().getUsername());
    	System.out.println(this.getPerson().getPassword());
    	return null;
    	
    }	
	
	  public String testPersonConverter2(){
		 for(String s:this.getLikes()){
			 
			 System.out.println(s);
		 }
		return null;
		
	}


}
