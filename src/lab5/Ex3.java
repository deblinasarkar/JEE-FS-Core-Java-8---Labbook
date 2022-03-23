package lab5;

import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	double salary=sc.nextDouble();
	salaryCheck(salary);
	sc.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

public static void salaryCheck(double salary) throws EmployeeException{
	if(salary<3001)
	{
		throw new EmployeeException("salary can not be less than 3000");
	}
	else
		System.out.println("Ok");
	
}
}
class EmployeeException extends Exception{
	EmployeeException(String msg)
	{
		super(msg);
	}
}
