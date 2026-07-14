package edu.cca.john.jfs.entity;

import java.io.Serializable;

public class Student implements Serializable {
	private Integer id;
    private String name;
    private String course;
    
    static Integer nextId;
    
    static {
    	nextId = 1001;
    }
    
    public static void showHeading() {
    	System.out.printf("%-10s%-20s%-15s\n","Id","Name","Course");
    }
    public Student() {
    	this.id = nextId; nextId++;
    	this.name = "";
    	this.course = "";
    }
	public Student(String name, String course) {
		this.id = nextId; nextId++;
		this.name = name;
		this.course = course;
	}

	public Student(Integer id,String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-20s%-15s",this.id,this.name,this.course);
	}
}
