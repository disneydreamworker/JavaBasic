package day13.inheritance.Prob1;

public class CheckingAccount extends Account{

  ///////Field////////
  private String cardNo;

//  //////Constructor: Private////////
//  public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
//    super(accId, balance, ownerName);
//    this.cardNo = cardNo;
//  }

  ////Constructor: Protected////////
  public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
    super(); //protected 필드이기 때문에 슈퍼클래스의 필드를 this 연산자로 내 것 처럼 쓸 수 있다
    this.accId = accId;
    this.balance = balance;
    this.ownerName = ownerName;
    this.cardNo = cardNo;
  }


//  //////Private일때////////
//  //////Method1////////
//  public void pay (long amount, String cardNo) {
//    if(cardNo.equals(this.cardNo) && amount <= super.getBalance()) {
//      System.out.println("현재잔액====>" + super.getBalance());
//      super.withdraw(amount);
//      System.out.println("현재잔액====>" + super.getBalance());
//    } else {
//      System.out.println("지불이 불가능합니다.");
//    }
//  }
//  //////Method2////////
//  public void deposit (long amount) {
//    System.out.println("현재잔액====>" + super.getBalance());
//    super.deposit(amount);
//    System.out.println("현재잔액====>" + super.getBalance());
//  }


  //////Protected일때////////
  //////Method1////////
  public void pay (long amount, String cardNo) {
    if(cardNo.equals(this.cardNo) && amount <= this.balance) {
      System.out.println("현재잔액====>" +this.balance);

      this.withdraw(amount);

      System.out.println("현재잔액====>" + this.balance);
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }
  //////Method2////////
  public void deposit (long amount) {
    System.out.println("현재잔액====>" + this.balance);

    super.deposit(amount); //method이름이 같아서 super이라고 명시해줌

    System.out.println("현재잔액====>" + this.balance);
  }


  //////toString////////
  @Override
  public String toString() {
    return "CheckingAccount{" +
        "cardNo='" + cardNo + '\'' +
        '}';
  }
}
