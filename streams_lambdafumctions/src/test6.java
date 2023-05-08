import static utils.StudentCollectionUtils.*;
import com.app.core.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> populateList = populateList();
		populateList.forEach(s->System.out.println(s));
		System.out.println("Enter the subject:");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		long count = populateList.stream().filter(s->s.getSubject()==subject).filter(s->s.getGpa()<5.0).count();
		System.out.println(count);
		
	}

}
