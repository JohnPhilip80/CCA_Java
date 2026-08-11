package edu.cca.john.javastream.model;

public class EmployeeDTO {
	private int id;
    private String name;
    private Department department;
	public EmployeeDTO(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-20s%-15s", id,name,department);
	}
    
    
}
