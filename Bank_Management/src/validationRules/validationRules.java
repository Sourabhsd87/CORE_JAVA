package validationRules;
import java.time.LocalDate;
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
	
	public static bankAccount validateAllInputs(String name, String acctType, double balance, String createdDate, String lastUpdated) throws bankingException
	{
		AccType type = validateAccType(acctType);
		validateMinbalance(balance);
		LocalDate created = LocalDate.parse(createdDate);
		LocalDate updated = LocalDate.parse(lastUpdated);
		return new bankAccount(name, type, balance, created, updated );
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
	
	public static void checkforDuplicate(int acctNo,Map<Integer,bankAccount> bank) throws bankingException
	{
		if(bank.containsKey(acctNo))
			throw new bankingException("invalid Acc number....");
	}
	
}
