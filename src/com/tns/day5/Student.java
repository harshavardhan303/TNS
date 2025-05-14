package com.tns.day5;

public class Student extends Citizen {

	private String collegeName;
	private int rollNo;
	
	public Student(String address, String name, String aadharNo, int phNo, int rollNo,String collegeName) {
		super(address, name, aadharNo, phNo);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", getAddress()=" + getAddress() + ", getName()=" + getName() + ", getAadharNo()=" + getAadharNo() + ", getPhNo()=" + getPhNo() + "]";
	}

}
