package interfaceconcept;

public class BankAppln {
	public static void main(String[] args) {
		Bank bank =new BankImpl();
		  // Create an Account
	   Account account=new Account(987654, "Sukruth", 155000, bank);
        account.getBank().deposite(account,2000);
	    System.out.println(account);
	   
	    
	    account.getBank().withdraw(account, 7000);
	    System.out.println(account);
	}
}
