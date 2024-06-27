package day12.MorningTest;

import day12.MorningTest.Q20.AccountBank;

public class Q19 {

  public static void main(String[] args) {
    AccountBank account = new AccountBank();
    account.setBalance(10000);
    System.out.println("현재 잔고는 " + account.getBalance());
    account.setBalance(-100);
    System.out.println("현재 잔고는 " + account.getBalance());
    account.setBalance(2000000);
    System.out.println("현재 잔고는 " + account.getBalance());
    account.setBalance(300000);
    System.out.println("현재 잔고는 " + account.getBalance());
  }

}
