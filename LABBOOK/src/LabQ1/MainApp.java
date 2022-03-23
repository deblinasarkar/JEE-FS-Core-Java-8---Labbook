package LabQ1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("enter the type of account");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equals("Saving") || str.equals("saving"))
		{
		SavingAccount a1=new SavingAccount();
		SavingAccount a2=new SavingAccount();
		
		a1.setName("Smith");
		a1.setAccNum(20444964063l);
		a1.setBalance(2000);
		a1.setAge(21);
		a2.setName("Kathy");
		a2.setAccNum(70004657l);
		a2.setBalance(3000);
		a2.setAge(21);
	
		while(true)
		{
			System.out.println("1. Smith's account Access");
			System.out.println("2. Kathy's account Access");
			System.out.println("3. Smith's Account deposite");
			System.out.println("4. Kathy's Account deposite");
			System.out.println("5. Smith's Account Withdraw");
			System.out.println("6. kathy's Account Withdraw");
			System.out.println("7. To exit");
	
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Name:" +a1.getName()+",Account Number:"+a1.getAccNum()
						+",Age:" +a1.getAge()+"Current Balance:"+a1.getBalance()+"\n");
				break;
				case 2: System.out.println("Name:" +a2.getName()+",Account Number:"+a2.getAccNum()
				+",Age:" +a2.getAge()+"Current Balance:"+a2.getBalance()+"\n");
				break;
				case 3: System.out.println("Enter the amount you want to deposite");
						double deposite=sc.nextDouble();
						a1.Deposit(deposite);
						a1.getAccountBalance();
						
						break;
				case 4: System.out.println("Enter the amount you want to deposite");
						double deposite1=sc.nextInt();
						a2.Deposit(deposite1);
						a2.getAccountBalance();
				break;
				case 5: System.out.println("enter the amont you want to withdraw");
						double withdraw=sc.nextDouble();
						a1.withDraw(withdraw);
						a1.getAccountBalance();
						break;
				case 6: System.out.println("enter the amont you want to withdraw");
						double withdraw1=sc.nextDouble();
						a2.withDraw(withdraw1);
						a2.getAccountBalance();
				case 7:
						System.exit(0);
					
		
				
			}
			}
		}
		else if(str.equals("Current") ||str.equals("current"))
		{
			Current a1=new Current();
			Current a2=new Current();
			a1.setName("Smith");
			a1.setAccNum(20444964063l);
			a1.setAge(21);
			a1.setBalance(2000);
			
			a2.setName("Kathy");
			a2.setAccNum(700465478l);
			a2.setAge(21);
			a2.setBalance(3000);

			while(true)
			{
			System.out.println("1. Smith's account Access");
			System.out.println("2. Kathy's account Access");
			System.out.println("3. Smith's Account deposite");
			System.out.println("4. Kathy's Account deposite");
			System.out.println("5. Smith's Account Withdraw");
			System.out.println("6. kathy's Account Withdraw");
			System.out.println("7. To exit");
	
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Name:" +a1.getName()+",Account Number:"+a1.getAccNum()
						+",Age:" +a1.getAge()+"Current Balance:"+a1.getBalance()+"\n");
				break;
				case 2: System.out.println("Name:" +a2.getName()+",Account Number:"+a1.getAccNum()
				+",Age:" +a2.getAge()+"Current Balance:"+a2.getBalance()+"\n");
				break;
				case 3: System.out.println("Enter the amount you want to deposite");
						double deposite=sc.nextDouble();
						a1.Deposit(deposite);
						a1.getAccountBalance();
						
						break;
				case 4: System.out.println("Enter the amount you want to deposite");
						double deposite1=sc.nextInt();
						a2.Deposit(deposite1);
						a2.getAccountBalance();
				break;
				case 5: System.out.println("enter the amont you want to withdraw");
						double withdraw=sc.nextDouble();
						a1.withDraw(withdraw);
						a1.getAccountBalance();
						break;
				case 6: System.out.println("enter the amont you want to withdraw");
						double withdraw1=sc.nextDouble();
						a2.withDraw(withdraw1);
						a2.getAccountBalance();
				case 7:
						System.exit(0);
					
		
				
			}
			}
		}
		sc.close();

	}
}
