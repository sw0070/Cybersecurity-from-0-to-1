package ming;


public class Tmp
{
	public static void main(String[] args){
		Person ming = new Person("xiaoming", 19);
		Person hong = new Person("xiaohong", 20);
		Person.number = 99;
		System.out.println(Person.number);

		
	}
}

class Person
{
	public String name;
	public int age;

	public static int number;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}


import java.util.Scanner

//包 一个类总是属于一个包













































