package lab1;
import java.util.*;

public class ex6 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(ex6.calculateDifference (n));
		sc.close();
	}
	public static int calculateDifference (int n)
	{
		int i,sumofsquare=0,squareofsum=0,sum=0,d=0;
		for(i=0;i<=n;i++)
		{
			sumofsquare=sumofsquare+(i*i);
		}
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		squareofsum=squareofsum+(sum*sum);
		d=sumofsquare-squareofsum;
		return d;
		
	}

}
