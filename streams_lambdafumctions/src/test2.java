import java.util.List;
import java.util.Map;

import static utils.StudentCollectionUtils.*;
import com.app.core.*;

public class test2 {

	public static void main(String[] args) {
		List<Student> l = populateList();
		Map<String, Student> student = populateMap(l);
		
		student.forEach((k,v)->System.out.println(v));
		
}
}