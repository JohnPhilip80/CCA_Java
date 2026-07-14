package edu.cca.john.jfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.cca.john.jfs.entity.Student;
import edu.cca.john.jfs.services.StudentService;

public class Demo {
	public static void main(String[] args) {
		//createFile();
		//writeFile();
		//appendData();
		//readFile();
		//bufferedReader();
		//bufferedWriter();
		//copyFile();
		//moveFile();
		//deleteFile();
		//createDirectory();
		//serialization();
		//deserialization();
		
		/*List<Student> students = new ArrayList<Student>();
		students.add(new Student(1001,"John","Java"));
		students.add(new Student(1002,"Bala","Python"));
		students.add(new Student(1003,"Suba","HTML"));
		students.add(new Student(1004,"Niki","Javascript"));
		students.add(new Student(1005,"Sara","Data Science"));
		
		Student.showHeading();
		for(Student student:students)
			System.out.println(student);
		*/
		studentCRUD();
    }
	
	public static void studentCRUD() {
		StudentService service = new StudentService();
		Scanner scanner = new Scanner(System.in);
		byte choice = 0;
		System.out.println("Welcome to Student CRUD Operations(File).");
		do {
			System.out.println("1.Create 2.Read All 3.Read One 4.Update 5.Delete 6.Exit. Enter your choice:");
			choice = scanner.nextByte(); scanner.nextLine();
			switch(choice) {
			case 1:
				service.createStudent();break;
			case 2:
				service.readStudents();break;
			case 3:
				service.readStudent();break;
			case 4:
				service.updateStudent();break;
			case 5:
				service.deleteStudent();break;
			default:
				choice = 6;
			}
		}while(choice !=6);
		System.out.println("Program Ends Here!");
	}
	
	public static void createFile() {
		File file = new File("student.txt");
        try {
            if(file.createNewFile())
                System.out.println("File Created");
            else
                System.out.println("Already Exists");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
	}
	public static void writeFile() {
		try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write("101,John,Java\n");
            writer.write("102,Saraswathy,Python\n");
            writer.write("103,Sumaya,Data Science\n");
            writer.write("104,Bala,Cyber Security");
            writer.close();
            System.out.println("Data Written");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
	}
	public static void readFile() {
		try {
            File file = new File("student.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
	}
	public static void appendData() {
		try {
            FileWriter writer=new FileWriter("student.txt",true);
            writer.write("\n105,Franklin,AI");
            writer.close();
            System.out.println("Data Appended");
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
	public static void bufferedReader() {
		try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
	public static void bufferedWriter() {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("course.txt"));
	        bw.write("Java");
	        bw.newLine();
	        bw.write("Python");
	        bw.newLine();
	        bw.write("AI");
	        bw.close();
	        System.out.println("Written Successfully");
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
	public static void copyFile() {
		try{
            FileInputStream fis=new FileInputStream("student.txt");
            FileOutputStream fos=new FileOutputStream("backup.txt");
            int ch;
            while((ch=fis.read())!=-1){
                fos.write(ch);
            }
            fis.close();
            fos.close();
            System.out.println("Copied");
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
	public static void moveFile() {
		File oldFile=new File("backup.txt");
        File newFile=new File("Backup/backup.txt");
        if(oldFile.renameTo(newFile))
            System.out.println("Moved");
        else
            System.out.println("Move Failed");
	}
	public static void deleteFile() {
		File file=new File("course.txt");
        if(file.delete())
            System.out.println("Deleted");
        else
            System.out.println("Not Deleted");
	}
	public static void createDirectory() {
		File dir=new File("Students");
        if(dir.mkdir())
            System.out.println("Directory Created");
        else
            System.out.println("Already Exists");
	}
	public static void serialization() {
		Student s=new Student(101,"John","Java");
        try{
            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("student.obj"));
            out.writeObject(s);
            out.close();
            System.out.println("Serialized");
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
	public static void deserialization() {
		try{
            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("student.obj"));
            Student s=(Student)in.readObject();
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getCourse());
            in.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
}
