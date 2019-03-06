package com.prm.ICustomerServices;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.prm.entity.Customer;

public interface ICustomerServices {

	public List<Customer> getCustomer();

	public Customer addCustomer(Customer cus);

	public Customer updateCustomer(Long id, Customer cus);

	public ResponseEntity<Customer> deleteCustomer(Long id);

}
