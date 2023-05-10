package RunnableTasks;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average implements Runnable{

	private int n1,n2;
	
	
	public Average(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {
			double d1 = IntStream.rangeClosed(n1, n2)       //int from n1 to n2
			.average().orElseThrow();
			System.out.println(Thread.currentThread().getName()+" printing average "+d1);
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+"got exc "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}

}
