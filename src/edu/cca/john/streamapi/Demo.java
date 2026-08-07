package edu.cca.john.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.cca.john.streamapi.model.Employee;
import edu.cca.john.streamapi.repository.EmployeeRepository;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Stream API");
		
		/*
		//create a stream
		Stream<String> vowels = Stream.of("a","e","i","o","u");
		//vowels.forEach(letter -> System.out.println(letter));
		vowels.forEach(System.out::println);
		*/
		
		/*
		//create a stream from sources
		EmployeeRepository repo = new EmployeeRepository();
		List<Employee> empList = repo.readAll();
		Stream<Employee> empStream = empList.stream();
		//empStream.forEach(emp -> System.out.println(emp));
		//empStream.forEach(System.out::println);
		empStream.forEach(emp -> System.out.println(emp.getName()));
		*/
		
		/*
		EmployeeRepository repo = new EmployeeRepository();
		List<Employee> empList = repo.readAll();
		List<Employee> highPaidEmp = new ArrayList<Employee>();
		
		for(Employee emp:empList)
			if(emp.getSalary() > 60000)
				highPaidEmp.add(emp);
		
		for(Employee emp:highPaidEmp) 
			System.out.println(emp);
		*/
		
		/*
		EmployeeRepository repo = new EmployeeRepository();
		List<Employee> empList = repo.readAll();
		List<Employee> highPaidEmp = empList.stream().filter(emp -> emp.getSalary()<60000).collect(Collectors.toList());
		
		for(Employee emp:highPaidEmp) 
			System.out.println(emp);
		//empList.stream().filter(emp -> emp.getSalary()<60000).forEach(emp -> System.out.println(emp));
		empList.stream().filter(emp -> emp.getSalary()<60000).forEach(System.out::println);
		*/
		
		/*
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		//fruits.stream().sorted().forEach(System.out::println);
		//fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).forEach(System.out::println);
		//fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		*/
		
		EmployeeRepository repo = new EmployeeRepository();
		List<Employee> empList = repo.readAll();
		//empList.stream().sorted((o1,o2)-> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		//empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
		//empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);
		empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
	}

}
