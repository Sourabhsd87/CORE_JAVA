package RunnableTasks;

import java.util.stream.IntStream;

public class EvenPrinter implements Runnable{

	private int n1,n2;
	
	public EvenPrinter(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" stsrted");
		try {
			IntStream.rangeClosed(n1, n2)       //int from n1 to n2
			.filter(n -> n%2==0)                //ints which are even
			.forEach(n->System.out.println(Thread.currentThread().getName()+" printed even "+n)); //display even numbers
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+"got exc "+e);
		}
		
		System.out.println(Thread.currentThread().getName()+" over");
	}

}
