package day12.MorningTest;

import day12.MorningTest.Q20.AccountBank;

public class Account {

  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;
  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
      return;
    }
    this.balance = balance;
  }
}
