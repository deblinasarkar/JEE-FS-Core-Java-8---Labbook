package lab9;
//Write a lambda expression which accepts x and y numbers and return xy.

import java.util.Scanner;
interface power{
	double pow(int x,int y);
}
public class Ex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
power p= (int a,int b)->{
		double res=Math.pow(x, y);
		return res;
	};
	System.out.println(p.pow(x, y));
	sc.close();
}
}
