import static utils.StudentCollectionUtils.*;
import com.app.core.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> sList = populateList();
		System.out.println("Enter city");
		String city = sc.next();
		sList.stream().filter(s->s.getAddress().getCity().equals(city)).forEach(s->System.out.println(s.getName()));
		
	}

}
