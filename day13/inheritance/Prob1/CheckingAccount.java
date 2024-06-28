package day13.inheritance.Prob1;

public class CheckingAccount extends Account{
  private String cardNo;

  public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
    super(accId, balance, ownerName);
    this.cardNo = cardNo;
  }

  public void pay (long amount, String cardNo) {
    if(cardNo.equals(this.cardNo) && amount <= super.getBalance()) {
      System.out.println("현재잔액====>" + super.getBalance());
      this.setBalance(this.getBalance()-amount);
      System.out.println("현재잔액====>" + super.getBalance());
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  @Override
  public void calcRate() {

  }

  @Override
  public String toString() {
    return "CheckingAccount{" +
        "cardNo='" + cardNo + '\'' +
        '}';
  }
}
