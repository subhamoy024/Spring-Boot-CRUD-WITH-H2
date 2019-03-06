package com.prm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prm.ICustomerServices.ICustomerServices;
import com.prm.entity.Customer;

@RestController
@RequestMapping(value="/api/v0.1/")
public class CustomerController {
	
	@Autowired
	private ICustomerServices CustomerInterface;
	
	@GetMapping("/AllCustomer")
	public List<Customer> GetAllCustomer() {	
		return CustomerInterface.getCustomer();
	}
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public Customer addCustomer(@RequestBody Customer cus) {
		return CustomerInterface.addCustomer(cus);
	}
	
	@RequestMapping(value="/updateCustomer/{id}",method=RequestMethod.PUT,
			consumes="application/json",produces="application/json")
	public Customer updateCustomer(@RequestBody Customer cus, @PathVariable("id") Long id) {
		return CustomerInterface.updateCustomer(id,cus);
	}
	
	@RequestMapping(value="/deleteCustomer/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id) {
		return CustomerInterface.deleteCustomer(id);
	}
}
