package com.demo.manytomany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	@Column
	String title;
	
	@ManyToMany(mappedBy ="courselist",cascade = CascadeType.ALL )
	List<Student> getStudentlist() {
		List<Student> getStudentlist;
		return getStudentlist;
	}
	public void setStudentlist(List<Student> studetlist) {
		this.studentlist = studentlist;
	}
	

public Course() {

}

	public Course(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public Course(String title) {
		super();
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
