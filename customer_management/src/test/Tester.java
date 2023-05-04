package test;

import static validationRules.ValidationRules.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import comparator.firstNameComparator;
import lab_day5.Customer;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customerList = new ArrayList<Customer>();
			
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Sign up 2. Sign in i/p : email n password 3. Change password "
						+ "4. Un subscribe customer 5. Display all customers. 6.Sort According to email: "
						+ "7.Sort according to First Name: " + "8.Sort according dob and "
								+ "9.Pay subscription.");
				System.out.println("Enter a option");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;
					case 1:// signup
						System.out.println("Enter customer details : ");
						System.out.println(
								"FirstName | LastName | Email | Password | RegAmount | Date of birth | Plan | Subscription Date");
						Customer newCustomer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), sc.next(), customerList);
						customerList.add(newCustomer);
						// System.out.println("Customer details are:");
						// System.out.println(newCustomer);

						break;
					case 2:// signIn
						System.out.println("Enter Email:");
						String email = sc.next();
						System.out.println("Enter password:");
						String password = sc.next();
						validateEmail(email, password, customerList);
						break;
					case 3:// Change Password
						System.out.println("Enter Email:");
						email = sc.next();
						System.out.println("Enter password:");
						password = sc.next();
						validateEmail(email, password, customerList);
						System.out.println("Enter new Password.");
						changePassword(sc.next(), email, customerList);
						break;
					case 4:
						System.out.println("Enter Email:");
						email = sc.next();
						System.out.println("Enter password:");
						password = sc.next();
						validateEmail(email, password, customerList);
						System.out.println("Do you want to unSubscribe(Y/N)");
						if (sc.next().equals("Y"))
							unSubscribe(email, customerList);
						break;
					case 5:
						for (Customer c : customerList) {
							System.out.println(c);
						}
						break;
					case 6:
						Collections.sort(customerList);
						for (Customer c : customerList) {
							System.out.println(c);
						}
						break;
					case 7:
						Collections.sort(customerList, new firstNameComparator());
						for (Customer c : customerList) {
							System.out.println(c);
						}
					case 8:
						Collections.sort(customerList, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								int c = o1.getDob().compareTo(o2.getDob());
								if (c == 0) 
								{
//									if (o1.getRegAmount() < o1.getRegAmount())
//										return -1;
//									if (o1.getRegAmount() == o2.getRegAmount())
//										return 0;
//									return 1;
									return ((Double)o1.getRegAmount()).compareTo(o2.getRegAmount());
								} else
									return c;
							}
						});
					case 9:
						System.out.println("Enter Email:");
						validateEmail(sc.next(), sc.next(), customerList);
						System.out.println("Enter your Plan name :");
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // sc.close()

	}

}
//System.out.println("Enter customer details : ");
//System.out.println("FirstName | LastName | Email | Password | RegAmount | Date of birth | Plan");
//Customer customer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next(), sc.next(),customerList);
//sourabh deshmukh sourabh@gmail sourabh 10000 2000-06-23 platinum
//malhar patil malhar@gmail malhar 5000 1999-02-27 diamand
//suraj jagdale suraj@gmail suraj 10000 1999-02-20 platinum
//anmol dubey anmo@gmail anmol 1000 1995-04-25 silver
//akanksha parihar aka@gmail akanksha 2000 1990-01-01 gold
//kirti dahake kirti@gmail kirti 10000 2000-03-23 platinum
//krishna shrivastav krishna@gmail krishna 5000 1999-06-18 diamand
