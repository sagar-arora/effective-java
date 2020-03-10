public class SyncronizedBank {
  class BankAccount {
    private int balance;
    BankAccount(int balance) {
    this.balance = balance;
    }
    int checkBalance(){return this.balance;}
    
    public void withdraw(int amount) {
      if(isAmountGreaterThanBalance()) {
        throw new NoBalanceException("Withdraw on $0 balance!");
      }
      balance = balance - amount;
    }
    
    boolean isAmountGreaterThanBalance() {return balance - amount < 0;}
  }

  class NoBalanceException extends Exception {
    public NoBalanceException(String message, Throwable cause) {
      super(message, cause) 
    }
    public NoBalanceException(String message) {
      super(message);
    }
  }
  
}
