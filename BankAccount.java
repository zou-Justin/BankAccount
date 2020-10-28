public class BankAccount{
  private double balance;
  private String password;
  private int accountID;
  public BankAccount(int a,String p){
    balance = 0;
    accountID = a;
    password = p;
  }
  public double getBalance(){
    return balance;
  }
  public double getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (amount >= 0 && amount <= balance){
      balance = balance - amount;
      return true;
    }
    return false;
  }
  public String toString(){
    return ("#" + accountID + "\t" + "$" + balance);
  }
  private boolean authenticate(String password){
    return this.password.equals(password);
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password) && withdraw(amount)){
      if (other.deposit(amount)){
      return true;
    }
  }
    return false;
  }
}
