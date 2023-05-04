package validationRules;
import static validationRules.ValidationRules.validateEmail;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import custom_exception.CustomerhandlingException;

import lab_day5.*;

public class ValidationRules {
	
	
	public static Customer validateAll(String firstName, String lastName, String email, String password, double regAmount,
			String dob, String plan,String SubscriptionDate,List<Customer> customerList) throws CustomerhandlingException
	{	
		checkDuplicate(email, customerList);
		ServicePlan Plan = parseAndCheckPlan(plan);
		checkRegAmount(Plan,regAmount);
		LocalDate birthDate = LocalDate.parse(dob);
		checkAge(birthDate);
		LocalDate lastSubscriptionDate = LocalDate.parse(SubscriptionDate);
		Customer c = new Customer(firstName,lastName,email,password,regAmount,birthDate,Plan,lastSubscriptionDate);
		return c;
	}
	public static void checkDuplicate(String email,List<Customer> customerList) throws CustomerhandlingException
	{
		Customer c = new Customer(email);
		if(customerList.contains(c))
			throw new CustomerhandlingException("Email already exist,enter a new email.....");
		//System.out.println("No duplicate email found.");
	} 
	
	public static ServicePlan parseAndCheckPlan(String plan) throws CustomerhandlingException
	{
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	public static void checkRegAmount(ServicePlan Plan,double amount) throws CustomerhandlingException
	{
		if(Plan.getPrice()!=amount)
		{
			throw new CustomerhandlingException("Invalid Registration amount.");
		}
	}
	
	/*
	 * public static servicePlan parseValidatePlanandRegAmount(String Plan,double
	 * amount) { ServicePlan servicePlan = servicePlan.valueOf(Plan.toUpperCase());
	 * if(servicePlan.getPrice()!=amount) throw new
	 * CustomerhandlingException("Invalid Registration amount."); return
	 * servicePlan;
	 * 
	 * }
	 */
	
	public static void checkAge(LocalDate birthDate) throws CustomerhandlingException
	{
		LocalDate curDate = LocalDate.now();
		int date = Period.between(birthDate, curDate).getYears();
		if(date<18)
			throw new CustomerhandlingException("You are minor in age.");
	}
	public static void validateEmail(String email,String password,List<Customer> cust) throws CustomerhandlingException
	{
		Customer newCustomer = new Customer(email);
		int index = cust.indexOf(newCustomer);
		if(index == -1)
		{
			throw new CustomerhandlingException("Invalid email.");
		}
		else
		{
			if(cust.get(index).getPassword().equals(password))
				System.out.println("Login successfull.");
			else
				throw new CustomerhandlingException("Invalid Password");
		}
	}
	
	public static void changePassword(String password,String email,List<Customer> list) throws CustomerhandlingException
	{
		Customer newCustomer = new Customer(email);
		
		int index = list.indexOf(newCustomer);
		//System.out.println(new);
		System.out.println(index);
		list.get(index).setPassword(password);
		/*
		 * if(index == -1) { throw new CustomerhandlingException("Invalid email."); }
		 * else { if(list.get(index).getPassword().equals(password)) {
		 * System.out.println("Enter new Password."); list.get(index).getPassword(); }
		 * else throw new CustomerhandlingException("Invalid Password"); }
		 */
		System.out.println("Password changed");
	}
	
	public static void unSubscribe(String email,List<Customer> customerList)
	{
		Iterator<Customer> itr = customerList.iterator();
		System.out.println("Do you want to unSubscribe(Y/N):");
		while(itr.hasNext())
		{
			if(itr.next().getEmail().equals(email))
			{
				itr.remove();
			}
		}
	}
	
}
