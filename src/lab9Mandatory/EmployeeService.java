package lab9Mandatory;

import java.util.Scanner;

public class EmployeeService {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	
		
		EmployeeRepository er=new EmployeeRepository();
		er.createEmployee(18127011,"deblina","sarkar","deblinasarkarbmgs@gmail.com","8777807665", null, null, null, 0, null);
		
	}
}
