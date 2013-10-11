package com.spring.Common.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;

import com.spring.Common.model.Customer;
 
public class CustomerRowMapper implements RowMapper
{
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setId(rs.getInt("id"));
		customer.setFirstName(rs.getString("first_name"));
		customer.setLastName(rs.getString("last_name"));
		customer.setCity(rs.getString("city"));
		customer.setMobile(rs.getString("mobile"));
		customer.setNotice(rs.getString("notice"));
		return customer;
	}
 
}