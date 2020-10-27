public class BankAccountTester{
  public static void main(String[]args){
    BankAccount b1 = new BankAccount("hello123",12);
    b1.setPassword("noone");
    System.out.println(b1.getInfo());
  }

}
