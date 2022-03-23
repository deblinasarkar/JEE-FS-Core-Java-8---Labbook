package lab1;
import java.util.*;

public class ex7 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	boolean b=ex7.checkNumber(n);
	System.out.println(b);
	sc.close();
}
public static boolean checkNumber (int n)
{
	int temp=n;
	boolean c=false;
	int r=temp%10;
	temp=temp/10;
	while(temp!=0)
	{
		if(r<temp%10)
		{
			c=true;
			break;
		}
		r=temp%10;
		temp=temp/10;
	}
	if(c)
		return false;
	else
		return true;
}
}
