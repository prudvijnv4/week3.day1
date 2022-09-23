package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Prudvi Krishna M");
	}
	public void studentDept() {
		System.out.println("CAD/CAM");
	}
	public void studentId() {
		System.out.println("0401462");
	}
	
		
public static void main(String[] args) {
	
	Student obj = new Student();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.deptName();
	obj.studentName();
	obj.studentDept();
	obj.studentId();
	
	System.out.println(obj);
	}

}
