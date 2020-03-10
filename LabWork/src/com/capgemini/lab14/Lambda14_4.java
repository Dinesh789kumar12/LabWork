package com.capgemini.lab14;

public class Lambda14_4 {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Lambda14_4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Lambda14_4 [name=" + name + ", age=" + age + "]";
	}

	
}
