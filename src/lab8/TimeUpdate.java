package lab8;

import java.time.LocalTime;

public class TimeUpdate extends Thread {

	public static void main(String[] args) {
		TimeUpdate t1=new TimeUpdate();
		while(true)
		{
			LocalTime t=LocalTime.now();
			System.out.println(t);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}

}
