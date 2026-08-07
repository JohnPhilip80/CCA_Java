package edu.cca.john.streamapi.repository;

import java.util.ArrayList;
import java.util.List;

import edu.cca.john.streamapi.model.Department;
import edu.cca.john.streamapi.model.Employee;

public class EmployeeRepository {
	private List<Employee> employees;
	
	public EmployeeRepository() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(101,"John",Department.IT,65000,25,"Chennai"));
		employees.add(new Employee(102,"Balamurugan",Department.IT,90000,35,"Chennai"));
		employees.add(new Employee(103,"Saraswathy",Department.HR,55000,29,"Madurai"));
		employees.add(new Employee(104,"Ashish",Department.SALES,45000,30,"Trichy"));
		employees.add(new Employee(105,"Subashini",Department.IT,72000,31,"Salem"));
		employees.add(new Employee(106,"Franklin",Department.TESTING,47000,26,"Madurai"));
		employees.add(new Employee(107,"Nikila",Department.FINANCE,85000,40,"Coimbatore"));
		employees.add(new Employee(108,"Sumaya",Department.HR,50000,27,"Chennai"));
		employees.add(new Employee(109,"Thilak",Department.IT,100000,38,"Bangalore"));
		employees.add(new Employee(110,"Bharath",Department.SALES,43000,24,"Madurai"));
		employees.add(new Employee(111,"Rajesh",Department.TESTING,51000,28,"Chennai"));
		employees.add(new Employee(112,"Aravind",Department.FINANCE,92000,37,"Salem"));
		employees.add(new Employee(113,"Ramesh",Department.IT,78000,32,"Coimbatore"));
		employees.add(new Employee(114,"Lalith",Department.HR,53000,33,"Madurai"));
		employees.add(new Employee(115,"Roshan",Department.IT,66000,29,"Chennai"));
	}
	public List<Employee> readAll(){
		return employees;
	}
}
