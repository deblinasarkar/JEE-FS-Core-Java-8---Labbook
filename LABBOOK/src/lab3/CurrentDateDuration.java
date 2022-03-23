package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CurrentDateDuration {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int day=sc.nextInt();
	int month=sc.nextInt();
	int year=sc.nextInt();
	LocalDate ld=LocalDate.of(year,month,day);
	LocalDate today=LocalDate.now();
	Period diff=Period.between(ld, today);
	System.out.println(diff.getDays());
	System.out.println(diff.getMonths());
	System.out.println(diff.getYears());
	sc.close();
	
}
}
