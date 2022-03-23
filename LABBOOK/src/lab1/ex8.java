package lab1;
import java.util.*;

public class ex8 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean p=checkNumber(n);
		System.out.println(p);
		sc.close();
	}
	public static boolean checkNumber (int n)
	{
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
			return true;
		else
			return false;
		
	}


}
