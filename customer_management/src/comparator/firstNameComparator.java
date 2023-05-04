package comparator;

import java.util.Comparator;

import lab_day5.Customer;

public class firstNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		
		return c1.getFirstName().compareTo(c2.getFirstName());
			
	}
	

}
