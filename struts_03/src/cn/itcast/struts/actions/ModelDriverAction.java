package cn.itcast.struts.actions;

import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.struts.bean.Customer;

public class ModelDriverAction implements ModelDriven<Customer> {
    
	
	 private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		
		return this.customer;
	}
	
	public String testModelDriver(){
		System.out.println(this.customer.getUsername());
		System.out.println(this.customer.getPassword());
		System.out.println(this.customer.getPhone());
		return "modelDriver";
	}

}
