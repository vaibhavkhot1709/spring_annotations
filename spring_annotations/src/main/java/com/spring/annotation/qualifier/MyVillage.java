package com.spring.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyVillage {

	@Value("01")
	int id;

	@Value("Savarde B.K.")
	String name;

	@Autowired
	Address address;

	public MyVillage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyVillage(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MyVillage [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
