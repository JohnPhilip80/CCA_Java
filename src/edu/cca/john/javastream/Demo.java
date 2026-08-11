package edu.cca.john.javastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.cca.john.javastream.model.Department;
import edu.cca.john.javastream.model.Employee;
import edu.cca.john.javastream.model.EmployeeDTO;
import edu.cca.john.javastream.repository.EmployeeRepository;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Stream API");
		EmployeeRepository repo = new EmployeeRepository();
		
		//List<Employee> empList = new ArrayList<Employee>();
		List<Employee> empList = repo.readAll();
		
		Long empCount = empList.stream().count();
		
		System.out.println("Employee Count:" + empCount);
		
		Optional<Employee> maxSal = empList
				.stream()
				.min((o1,o2) -> (int)(o1.getSalary() - o2.getSalary()));
		
		System.out.println(maxSal.get());
		
		/*Optional<Employee> firstEmp = empList
			.stream()
			.findAny();
		
		if(firstEmp.isPresent())
			System.out.println(firstEmp);
		else
			System.out.println("Employee Not available");
		
		*/
		
		//List<EmployeeDTO> empDtoList = new ArrayList<EmployeeDTO>();
		
		/*for(Employee emp:empList) {
			empDtoList.add(new EmployeeDTO(emp.getId(),emp.getName(),emp.getDepartment()));
		}
		
		for(EmployeeDTO emp:empDtoList)
			System.out.println(emp);
		*/
		
		/*empDtoList = empList.stream()
			.map((emp)-> new EmployeeDTO(emp.getId(),emp.getName(),emp.getDepartment()))
			.collect(Collectors.toList());
		
		empDtoList.stream().forEach(System.out::println);
		*/
		
		
		
	}

}
