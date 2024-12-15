package interfaceconcept;

public class BankImpl implements Bank {

    @Override
    public void withdraw(Account a, double amt) {
        // Check if the account balance is sufficient for the withdrawal
        if (amt > a.getBalance()) {
            System.err.println("Insufficient funds to withdraw");
        } else {
            a.setBalance(a.getBalance() - amt);
            System.out.println("Withdrawn " + amt + " from account: " + a.getAccNo());
        }
    }

    @Override
    public void deposite(Account a, double amt) {
        // Check if the deposit amount exceeds the limit
        if (amt > DEPOSIT_LIMIT) {
            System.err.println("Deposit limit exceeds");
        } else {
            // Update the balance if the deposit is within the limit
            a.setBalance(a.getBalance() + amt);
            System.out.println("Deposited " + amt + " into account: " + a.getAccNo());
        }
    }
}


