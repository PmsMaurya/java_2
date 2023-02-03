package dsa_java;

import java.util.*;

class ClassMethodObject {
	String name;
	int age;
	String course;

	void eat() { // function/method
		System.out.println(name + " eat food");

	}

	void eat(String food) { // both eat function same also called "compile time polymorphism";
		System.out.println(name + " " + "eat " + food);
	}

	public static void main(String[] args) {
		ClassMethodObject p = new ClassMethodObject(); // object
		p.name = "Priyanshu Maurya";
		p.age = 19;
		p.course = "Btech";
		p.eat();
		System.out.println(p.name + " " + p.age + " " + p.course);
		p.eat("golgappe");

	}
}