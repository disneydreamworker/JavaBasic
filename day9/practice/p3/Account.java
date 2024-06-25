package day9.practice.p3;

public class Account {
  private String accNo;
  private int balance;

  public void save(int save) {
    this.balance += save;
    System.out.println(accNo + " 계좌에 " + save + "만원이 입금되었습니다.");
  }
  
  public void deposit(int dep) {
    this.balance -= dep;
    System.out.println(accNo + " 계좌에 " + dep + "만원이 출금되었습니다.");
  }
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
    System.out.println(accNo + " 계좌가 개설되었습니다.");
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
