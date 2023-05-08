import static utils.StudentCollectionUtils.*;
import com.app.core.*;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.app.core.Student;
public class test4 {

	public static void main(String[] args) {
		//i/p subject
		Scanner sc = new Scanner(System.in);
		List<Student> student = populateList();
		Map<String, Student> populateMap = populateMap(student);
		System.out.println("enter subject");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		OptionalDouble average = populateMap.values().stream().filter(s->s.getSubject()==subject).mapToDouble(p->p.getGpa()).average();
		System.out.println(average);
	}

}
