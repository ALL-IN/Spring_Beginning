package com.spring.Common.dao.impl;

import java.sql.*;
import java.util.*;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.spring.Common.dao.CustomerDAO;
import com.spring.Common.model.Customer;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO{
	
	private static String SQL_INSERT_CUSTOMER = "insert into customer " +
			"(id, first_name, last_name, city, mobile, notice) values (?, ?, ?, ?, ?, ?)";
	
	private static String SQL_SELECT_CUSTOMER_BY_ID = "select * from customer where id = ?";
	private static String SQL_UPDATE_CUSTOMER_BY_ID = "UPDATE customer SET notice = ? WHERE  id = ?";
	
	public void insert(Customer customer) {
		getJdbcTemplate().update(SQL_INSERT_CUSTOMER, customer.getId(), customer.getFirstName(), customer.getLastName(),
				customer.getCity(), customer.getMobile(), customer.getNotice());
	}

	public Customer getCustomerById(long id) {
		String sql = "SELECT * FROM CUSTOMER WHERE id = ?";
		 
		Customer customer = (Customer)getJdbcTemplate().queryForObject(
				sql, new Object[] { id }, new CustomerRowMapper());
	 
		return customer;
	}

	public void addNoticeById(long id, String notice) {
		Customer customer = getCustomerById(id);
		customer.setNotice(customer.getNotice() + " " + notice);
		updateNotoiceById(customer);
	}

	private void updateNotoiceById(Customer customer) {
		getJdbcTemplate().update(SQL_UPDATE_CUSTOMER_BY_ID, customer.getId(), customer.getNotice());
	}
}
