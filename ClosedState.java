public class ClosedState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("You cannot deposit on closed account!");
        account.to_String();
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You cannot deposit on closed account!");
        account.to_String();
    }

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed");
    }

    @Override
    public void suspend(Account account){
        System.out.println("You cannot suspend a closed account");
    }
}
