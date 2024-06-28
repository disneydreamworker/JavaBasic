package day13.inheritance.Prob1;

public class TestAccount {
  public static void main(String[] args) {
    CheckingAccount check = new CheckingAccount("111-1111", 100000, "KIM", "1234-1234");
    check.pay(20000000, "1234-1234");
    check.pay(20000, "1234-1234");
    check.deposit(10000);
  }
}
