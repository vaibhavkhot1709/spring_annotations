package com.spring.annotation.first;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("10")
	int id;
	@Value("Vaibhav")
	String name;
	@Value("Male")
	String gender;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Pearson [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

	@PostConstruct
	public void initAnnotation() {
		System.out.println("annotation init invoked");
	}

	@PreDestroy
	public void destroyAnnotation() {
		System.out.println("annotation Destroyed invoked");
	}

}
