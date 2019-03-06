package com.prm.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id @GeneratedValue
	private Long Id;
	private String Name;
	private String Passportnumber;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassportnumber() {
		return Passportnumber;
	}
	public void setPassportnumber(String passportnumber) {
		Passportnumber = passportnumber;
	}
	
	
}
