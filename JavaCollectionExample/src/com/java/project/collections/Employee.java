package com.java.project.collections;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee implements Serializable {
	int empId, salary;
	String empName, department;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", empName=" + empName + ", department=" + department
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, empId, empName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && empId == other.empId
				&& Objects.equals(empName, other.empName) && salary == other.salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setSalary(50000);
		e1.setEmpName("Varun");
		e1.setDepartment("IT");

		Employee e2 = new Employee();
		e2.setEmpId(123);
		e2.setSalary(50000);
		e2.setEmpName("Varun");
		e2.setDepartment("IT");

		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		System.out.println(set.size());// 1 because we have overriding hashcode and equals.
	}

}
