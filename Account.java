public class Account {
    String accountNumber;
    Double balance;
    AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void to_String(){
        System.out.println(STR."Current Balance: P\{getBalance()}");
        System.out.println(STR."Your Account Number: P\{getAccountNumber()}");
    }

    void deposit(Double depositAmount){
        accountState.deposit(this, depositAmount);
    }
    void withdraw(Double withdrawAmount){
        accountState.withdraw(this, withdrawAmount);
    }

    void activate(){
        accountState.activate(this);
    }
    void suspend(){
        accountState.suspend(this);
    }
    void close(){
        accountState.close(this);
    }

}
