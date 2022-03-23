package lab9;

import java.util.Scanner;

//Write a method that uses lambda expression to accept username and password and return true or false. 
//		(Hint: Use any custom values for username and password for authentication)
interface validateName{
	boolean valName(String name);
}
interface validatePassword{
	boolean valPass(String password);
}
public class Ex3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	String password=sc.next();
	validateName v=(n)->{
		String l="^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		boolean res=false;
		if(n.matches(l))
		{
			res=true;
		}
		else
			res=false;
		return res;
		
	};
	System.out.println(v.valName(name));
	validatePassword p=(k)->{
	String f="^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";
		boolean res=false;
		if(k.matches(f)) {
			res=true;
		}
		else
			res=false;
		return res;
		
	};
	System.out.println(p.valPass(password));
	sc.close();
}
}
