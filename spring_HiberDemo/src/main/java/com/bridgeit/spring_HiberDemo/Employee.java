package com.bridgeit.spring_HiberDemo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Emp")
public class Employee implements Serializable {
	
	
	
	@Id
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator = "any")
	@Column
	private  int id;
	@Column
	private String name;
	@Column
	private int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
