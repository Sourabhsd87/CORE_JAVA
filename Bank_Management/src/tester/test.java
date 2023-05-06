package tester;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import utils.populateMap;

import com.banking.AccType;
import com.banking.bankAccount;

public class test {

	public static void main(String[] args) throws Exception{
		
		try(Scanner sc = new Scanner(System.in)){
			
			Map<Integer,bankAccount> Bank= populateMap.populateMap();
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("0.Exit | 1.Create account | 2.Display all accounts | 3.Transfer amount | 4.Close the account"
						+ " | 5.specific account details | 6.Simple interest | ");
				try {
					switch(sc.nextInt())
					{
					case 1:System.out.println("Enter Name | Account type | Balance | CreatedOn | lastUpdated");
						
						break;
					case 2:
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
						break
					}
				}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		}

	}

