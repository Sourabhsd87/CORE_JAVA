import java.util.Map;

import com.banking.AccType;
import com.banking.bankAccount;
import com.customexception.bankingException;

public class validationRules {

	private static final int MINBALANCE;
	static 
	{
		MINBALANCE=1000;
	}
	
	
	public static AccType validateAccType(String type)
	{
		return AccType.valueOf(type.toUpperCase());
	}
	
	public static void validateMinbalance(double balance) throws bankingException
	{
		if(balance<MINBALANCE)
			throw new bankingException("minimum balance reached.");
	}
	
	public static void checkforDuplicate(int acctNo,Map<Integer,bankAccount> bank)
	{
		if(bank.containsKey(acctNo))
			return new bankingException("")
	}
	
}
