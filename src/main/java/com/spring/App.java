package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Common.dao.CustomerDAO;
import com.spring.Common.model.Customer;

/**
 * Hello world! фу на твоё форматирование!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("classpath*:Spring-Module.xml");
	 
	    CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
	    Customer customer = new Customer(2, "yong", "old", "kiev", "044", "qwe");
	    customerDAO.insert(customer);
	 
	    Customer customer1 = customerDAO.getCustomerById(2l);
	    System.out.println(customer1.getNotice());
	    customer1.setNotice("asd");
	    System.out.println(customer1.getNotice());
	}
}