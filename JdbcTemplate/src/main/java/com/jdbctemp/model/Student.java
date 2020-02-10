package com.jdbctemp.model;

public class Student {
 int sid;
 int age;
 String name;
 int number;
 @Override
 public String toString() {
 	return "Student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
 }
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public Student() {
	super();
}
  
}
