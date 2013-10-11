package com.spring.Common.dao;

import com.spring.Common.model.Customer;

public interface CustomerDAO {
	void insert(Customer customer);

	Customer getCustomerById(long id);
	
	void addNoticeById(long id, String notice);
	
}
