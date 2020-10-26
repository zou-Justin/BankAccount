public class BankAccount{
  private double balance;
  private String password;
  private int accountID;
  public BankAccount(String p,int a){
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
}
