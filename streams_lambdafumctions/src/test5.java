import static utils.StudentCollectionUtils.*;
import com.app.core.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Student> student = populateMap(populateList());
		student.forEach((k,v)->System.out.println(v));
		System.out.println("Enter a subjet:");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		System.out.println(subject);
		Optional<Student> max = student.values().stream().filter(s->s.getSubject()==subject).max((s1,s2)->((Double)s1.getGpa()).compareTo(s2.getGpa()));
		System.out.println(max);
	}

}
