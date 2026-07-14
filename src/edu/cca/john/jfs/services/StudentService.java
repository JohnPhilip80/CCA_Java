package edu.cca.john.jfs.services;

import java.util.List;
import java.util.Scanner;

import edu.cca.john.jfs.entity.Student;
import edu.cca.john.jfs.repository.StudentRepository;

public class StudentService {
	private StudentRepository repo;
	private Scanner scan;
	public StudentService() {
		repo = new StudentRepository();
		scan = new Scanner(System.in);
	}
	public void createStudent() {
		Student st = new Student();
		System.out.println("Enter Student Name:");
		st.setName(scan.nextLine());
		System.out.println("Enter Course:");
		st.setCourse(scan.nextLine());
		repo.createStudent(st);
		System.out.println("New Student Created Successfully!");
	}
	public void readStudents() {
		List<Student> students = repo.readStudents();
		Student.showHeading();
		for(Student student:students)
			System.out.println(student);
	}
	public void readStudent() {
		Integer id;
		System.out.println("Enter Student Id:");
		id= scan.nextInt();scan.nextLine();
		Student student = repo.readStudent(id);
		if(student!=null) {
			Student.showHeading();
			System.out.println(student);
		}
		else
			System.out.println("Student Id Not Found!");
	}
	public void updateStudent() {
		Integer id;
		System.out.println("Enter Student Id to Update:");
		id= scan.nextInt();scan.nextLine();
		Student student = repo.readStudent(id);
		if(student!=null) {
			System.out.println("Enter Student Name:");
			student.setName(scan.nextLine());
			System.out.println("Enter Course:");
			student.setCourse(scan.nextLine());
			repo.updateStudent(student);
			System.out.println("Student Updated Successfully!");
		}
		else
			System.out.println("Student Id Not Found!");
	}
	public void deleteStudent() {
		Integer id;
		System.out.println("Enter Student Id to Update:");
		id= scan.nextInt();scan.nextLine();
		if(repo.deleteStudent(id))
			System.out.println("Student Deleted Successfully!");
		else
			System.out.println("Student Id Not Found");
	}
}
