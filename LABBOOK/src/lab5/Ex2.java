package lab5;

import java.util.Scanner;
class InvalidName extends Exception{
	InvalidName(String msg)
	{
		super(msg);
	}
}

public class Ex2 {
		String f;
		String l;
		Ex2(String f,String l) throws InvalidName
		{
			this.f=f;
			this.l=l;
		if(f.equals(""))
		{
			throw new InvalidName("first name can not be blank");
		}
		else if(l.equals(""))
		{
			throw new InvalidName("last name can not be blank");
		}
		else
		{
			System.out.println("OK");
		}
		}
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		String f=sc.nextLine();
		String l=sc.nextLine();
		Ex2 p=new Ex2(f,l);
		sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
}