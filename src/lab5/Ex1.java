package lab5;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age = sc.nextInt();
		try {
		ageOfPerson(age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

	public static void ageOfPerson(int age) throws InvalidAgeException {
		if(age<16)
		{
			throw new InvalidAgeException("age of a person should be greater than 15");
		}
		else
			System.out.println("OK Good!!");
		
	}
}