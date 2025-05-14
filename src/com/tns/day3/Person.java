package com.tns.day3;

public class Person {
private String personNmae;
private int income;
private int age;
private String gender;
private int tax;

public Person(String personNmae, int income, int age, String gender, int tax) {
	
	this.personNmae = personNmae;
	this.income = income;
	this.age = age;
	this.gender = gender;
	this.tax = tax;
}

public Person() {
	// TODO Auto-generated constructor stub
}

public String getPersonNmae() {
	return personNmae;
}

public void setPersonNmae(String personNmae) {
	this.personNmae = personNmae;
}

public int getIncome() {
	return income;
}

public void setIncome(int income) {
	this.income = income;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getTax() {
	return tax;
}

public void setTax(int tax) {
	this.tax = tax;
}

@Override
public String toString() {
	return "Person [personNmae=" + personNmae + ", income=" + income + ", age=" + age + ", gender=" + gender + ", tax="
			+ tax + "]";
}




}
