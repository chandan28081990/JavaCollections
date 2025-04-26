package com.java.project.collections;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//to sort by id- return this.id-o.id 
		//to sort by age- return this.age-o.age
		return this.name.compareTo(o.name);
		//to get the descending order - return o.name.compareTo(this.name);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(123,"Chandan",21);
		Student s2=new Student(124,"Raj",22);
		Student s3=new Student(125,"Arun",34);
		Student s4=new Student(126,"Raj",35);
		
		Set<Student> set=new TreeSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for(Student s:set) {
			System.out.println(s);
		}
	}

	

}
