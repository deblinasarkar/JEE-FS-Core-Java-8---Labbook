package lab1;
import java.util.*;

public class ex2 {
public static void main(String[] args) {
	int ch;
	Scanner sc=new Scanner(System.in);
	ch=sc.nextInt();
	ex2.message(ch);
}
public static void message(int ch)
{
	switch(ch)
	{
	case 1: System.out.println("Stop!");
	break;
	case 2: System.out.println("Ready");
	break;
	case 3: System.out.println("Go");
	break;
	default: System.out.println("no message");
	}
}
}
