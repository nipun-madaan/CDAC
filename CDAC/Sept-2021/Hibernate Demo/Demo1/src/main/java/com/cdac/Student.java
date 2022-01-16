package com.cdac;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private Integer studentId;
	
	private String name;
	
	@Column(name = "email_id")
	private String email;
	
	@Column(length = 11,nullable = false)
	private  String mobileNo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String email, String mobileNo) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
