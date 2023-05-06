package tester;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import utils.populateMap;

import com.banking.AccType;
import com.banking.bankAccount;
import static validationRules.validationRules.*;
public class test {

	public static void main(String[] args) throws Exception{
		
		try(Scanner sc = new Scanner(System.in)){
			
			//Map<Integer,bankAccount> Bank= populateMap.populatemap();
			Map<Integer,bankAccount> Bank = new HashMap<Integer, bankAccount>();
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("0.Exit | 1.Create account | 2.Display all accounts | 3.Transfer amount | 4.Close the account"
						+ " | 5.specific account details | 6.Simple interest | ");
				try {
					switch(sc.nextInt())
					{
					case 1:System.out.println("Enter Name | Account type | Balance | CreatedOn | lastUpdated");
					    bankAccount acc = validateAllInputs(sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
						Bank.put(acc.getAcctno(),acc);
						System.out.println("Account created successfully.");
						break;
					case 2:
						for(Map.Entry<Integer, bankAccount> m : Bank.entrySet()) 
						{
							System.out.println(m);
						}
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 0:
						exit=true;
						break;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
					sc.next();
				}
				
			}
		}

	}
}
