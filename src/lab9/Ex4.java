package lab9;
//Write a class with main method to demonstrate instance creation using method reference.
//(Hint: Create any simple class with attributes and getters and setters)

//There are four type method references that are as follows:
//
//Static Method Reference.
//Instance Method Reference of a particular object.
//Instance Method Reference of an arbitrary object of a particular type.
//Constructor Reference.

import java.util.*;

class Person {

	private String name;
	private Integer age;

	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}

	
}

public class Ex4 {

	public static int compareByName(Person a, Person b)
	{
		return a.getName().compareTo(b.getName());
	}

	public static int compareByAge(Person a, Person b)
	{
		return a.getAge().compareTo(b.getAge());
	}
	public static void main(String[] args)
	{
	
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));
		Collections.sort(personList, Ex4::compareByName);

		
		System.out.println("Sort by name :");

		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		Collections.sort(personList, Ex4::compareByAge);


		System.out.println("Sort by age :");


		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
	}
}
