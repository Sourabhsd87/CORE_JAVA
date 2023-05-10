package RunnableTasks;

import java.util.stream.IntStream;

public class odd implements Runnable{

	private int n1,n2;
	
	
	
	public odd(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}



	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+" started");
		try {
			IntStream.rangeClosed(n1, n2)       //int from n1 to n2
			.filter(n -> n%2!=0)                //ints which are even
			.forEach(n->System.out.println(Thread.currentThread().getName()+" printed odd "+n)); //display even numbers
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+"got exc "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}

}
