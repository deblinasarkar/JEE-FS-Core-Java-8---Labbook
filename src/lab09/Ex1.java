package lab09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {  
	  
    public static void main(String[] args) {  
        ExecutorService executorService = Executors.newFixedThreadPool(10);  
        executorService.execute(new Runnable() {  
              
            @Override  
            public void run() {  
                System.out.println("ExecutorService");  
                  
            }  
        });  
        executorService.shutdown();  
    }  
  
}