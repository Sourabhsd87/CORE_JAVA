import java.util.Arrays;
import java.util.stream.IntStream;



public class solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,3,7,2,9,4,55,2,33,99};
		
		Arrays.stream(arr).forEach(s->System.out.print(s+" "));
		
		Arrays.stream(arr).sorted();
		
		IntStream.rangeClosed(1, 100).filter(i->i%2==0).forEach(s->System.out.print(s+" "));
	}

}
