package test_multithread;
import RunnableTasks.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter starting and ending number :");
			int start=sc.nextInt();
			int end = sc.nextInt();
			
			//create the task,attach a thread to the task,start the thread
			//implements runable :thread(runnable instance,string name)
			Thread t1=new Thread(new EvenPrinter(start, end),"Even");
			Thread t2=new Thread(new odd(start, end),"Odd");
			Thread t3=new Thread(new Average(start, end),"Average");
			
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting for child thread to complete exe");
			t1.join();
			t2.join();
			t3.join();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("main over");
	}

}
