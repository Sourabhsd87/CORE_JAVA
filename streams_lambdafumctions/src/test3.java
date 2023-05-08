import static utils.StudentCollectionUtils.*;

import java.util.List;

import com.app.core.Student;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> populateList = populateList();
		
		populateList.stream().sorted((g1,g2)->((Double)g1.getGpa()).compareTo(g2.getGpa())).forEach(s->System.out.println(s));
		
	}

}


