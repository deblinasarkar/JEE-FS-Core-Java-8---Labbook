package lab1;
import java.util.*;

public class ex5 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(calculateSum (n));
		sc.close();
	}
	public static int calculateSum (int n)
	{
		int s=0;
		for(int i=0;i<=n;i++)
		{
			if((i%3==0) || (i%5==0))
			{
				s=s+i;
			}
		}
		return s;
	}

}
