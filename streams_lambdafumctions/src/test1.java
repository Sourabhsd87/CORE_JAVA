import java.util.ArrayList;
import java.util.List;

import static utils.StudentCollectionUtils.*;
import com.app.core.*;
public class test1 {

	public static void main(String[] args) {

		List<Student> stu = populateList();
		
		stu.forEach(student -> System.out.println(student));
	}

}
