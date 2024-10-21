package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	  @Id  
	  int id;
	  String sname;
	  String saddress;
	  
	  //go to source then constructor
	public Student()
	{
		super();
	}
	//Constructor create at the time of object creation
	public Student(int id, String sname, String saddress) {
		super();
		this.id = id;
		this.sname = sname;
		this.saddress = saddress;
	}
// first right click then go to source there you will get generate getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	  
}
