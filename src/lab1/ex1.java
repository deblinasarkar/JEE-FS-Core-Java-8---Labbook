package lab1;
import java.util.*;

import org.junit.jupiter.api.Test;

public class ex1 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n<0)
	{
		System.out.println("Invalid input");
		System.exit(0);
	}
	else
	{
		System.out.println(ex1.sumofcubes(n));
	}
	sc.close();
	
}
@Test
public static int sumofcubes(int n)
{
	int r=1,s=0;
	while(n!=0)
	{
		r=n%10;
		s=s+(r*r*r);
		n=n/10;
	}
	return s;
}

}
