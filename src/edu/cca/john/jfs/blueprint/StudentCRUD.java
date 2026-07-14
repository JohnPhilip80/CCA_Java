package edu.cca.john.jfs.blueprint;

import java.util.List;

import edu.cca.john.jfs.entity.Student;

public interface StudentCRUD {
	Integer createStudent(Student student);
	List<Student> readStudents();
	Student readStudent(Integer id);
	Boolean updateStudent(Student student);
	Boolean deleteStudent(Integer id);
}
