public class ActiveState implements AccountState{

    @Override
    public void deposit(Account account, Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        account.to_String();
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        account.to_String();
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
}
