package edu.cca.john.jfs.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.cca.john.jfs.blueprint.StudentCRUD;
import edu.cca.john.jfs.entity.Student;

public class StudentRepository implements StudentCRUD {
	private final String FILE_NAME = "students.dat";
	
	@Override
	public Integer createStudent(Student student) {
		List<Student> students = readStudents();
        students.add(student);
        writeStudents(students);
        return student.getId();
	}

	@Override
	public List<Student> readStudents() {
		File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
	}

	@Override
	public Student readStudent(Integer id) {
		List<Student> students = readStudents();
		Student st = null;
        for (Student s : students) {
            if (s.getId().equals(id)) {
            	st = s;
            	break;
            }
        }
        return st;
	}
	
	public Integer readStudentIndex(Integer id) {
		List<Student> students = readStudents();
		Integer index = -1;
        for (Student s : students) {
        	index++;
            if (s.getId().equals(id))
            	break;
        }
        return index;
	}

	@Override
	public Boolean updateStudent(Student student) {
		boolean found = false;
		
		List<Student> students = readStudents();
        for (Student st : students) {
            if (st.getId().equals(student.getId())){
            	found = true;
            	st.setCourse(student.getCourse());
            	st.setName(student.getName());
            	break;
            }
        }
        if(found) {
        	writeStudents(students);
        }
		return found;
	}

	@Override
	public Boolean deleteStudent(Integer id) {
		List<Student> students = readStudents();
		int index = -1;
        for (Student s : students) {
        	index++;
            if (s.getId().equals(id))
            	break;
        }
		if(index != -1) {
			students.remove(index);
			writeStudents(students);
			return true;
		}
		else
			return false;
	}
	
	public void writeStudents(List<Student> students) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			oos.writeObject(students);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
