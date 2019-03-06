package com.prm.ImplCustomerServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prm.ICustomerServices.ICustomerServices;
import com.prm.entity.Customer;
import com.prm.repository.CustomerRepository;

@Service
public class ImplCustomerServices implements ICustomerServices {
	
	@Autowired
	private CustomerRepository CustomerRepo;
	
	
	@Override
	public List<Customer> getCustomer() {	
		return CustomerRepo.findAll();
	}


	@Override
	public Customer addCustomer(Customer cus) {	
		return CustomerRepo.save(cus);
	}


	@Override
	public Customer updateCustomer(Long id, Customer cus) {
		Customer cusDetails = CustomerRepo.getOne(id);
		if(cusDetails == null) {
			
		}
		cusDetails.setName(cus.getName());
		cusDetails.setPassportnumber(cus.getPassportnumber());
		return CustomerRepo.save(cusDetails);
	}


	@Override
	public ResponseEntity<Customer> deleteCustomer(Long id) {
		Customer customer = CustomerRepo.getOne(id);
		CustomerRepo.delete(customer);
		return ResponseEntity.ok().build();
	}

}
