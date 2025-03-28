package com.demo.oneToMany;

import org.hibernate.mapping.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table 
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	
	@Column
	String marks;
	
	@Column
	String email;
	
	@ManyToOne
	@JoinColumn(name ="sid", referencedColumnName = "id")
	Subject subject;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String marks, String email, Subject subject) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.email = email;
	this.subject = subject;
}
public Student(String name, String marks, String email, Subject subject) {
	super();
	this.name = name;
	this.marks = marks;
	this.email = email;
	this.subject = subject;
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
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	this.subject = subject;
}


	
}
