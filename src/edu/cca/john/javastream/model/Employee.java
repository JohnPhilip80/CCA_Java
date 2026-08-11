package edu.cca.john.javastream.model;

public class Employee {
	private int id;
    private String name;
    private Department department;
    private double salary;
    private int age;
    private String city;
    
	public Employee(int id, String name, Department department, double salary, int age, String city) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Department getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
    
	 @Override
    public String toString() {

        return String.format("%-10d%-20s%-15s%-10.2f%-5d%-15s", id,name,department,salary,age,city);
    }
}
