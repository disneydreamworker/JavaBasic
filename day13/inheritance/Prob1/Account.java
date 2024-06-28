package day13.inheritance.Prob1;

public class Account {
//  private String accId;
//  private long balance;
//  private String ownerName;


  //필드의 접근제한자가 protected일때
  protected String accId;
  protected  long balance;
  protected String ownerName;

  //////Constructor1////////
  public Account() {
  }

  //////Constructor2 : private////////
  public Account(String accId,long balance,String ownerName){
    this.accId = accId;
    this.balance = balance;
    this.ownerName = ownerName;
  }

  //////Method1////////
  public void deposit(long money){
    this.balance = this.balance + money;

  }

  //////Method2////////
  public void withdraw(long money){
    this.balance = this.balance - money;
  }

//일반 클래스에서는 추상 메서드와 공존할 수 없음
//  public abstract void calcRate();


  ///////////Getters&Setters////////////
  public long getBalance(){
    return this.balance;
  }
  public String getAccId() {
    return accId;
  }
  public void setAccId(String accId) {
    this.accId = accId;
  }
  public String getOwnerName() {
    return ownerName;
  }
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }


  ////////toString////////
  @Override
  public String toString() {
    return "Account{" +
        "accId='" + accId + '\'' +
        ", balance=" + balance +
        ", ownerName='" + ownerName + '\'' +
        '}';
  }
}