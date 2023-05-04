package lab_day5;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
	private int custid;
	private String firstName,lastName,email,password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastSubscriptionDate;
	private static int idcounter;
	
	static
	{
		idcounter=101;
	}

	public Customer(String firstName, String lastName, String email, String password, double regAmount,
			LocalDate dob, ServicePlan plan,LocalDate lastSubscriptionDate) {
		super();
		this.custid = idcounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	//overloaded ctor to wrap uniqueid email in vehicle
	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in customer equals");
		if(obj instanceof Customer)
			return this.email.equals(((Customer) obj).email);
		return false;
	}

	@Override
	public String toString() {
		return "customer [custid=" + custid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.email.compareTo(o.email);
	}

	public LocalDate getDob() {
		return dob;
	}

	public double getRegAmount() {
		return regAmount;
	}

	

	
	
	
	
}
