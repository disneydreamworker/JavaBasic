package day12.MorningTest.Q20;

public class Q20 {

  static java.util.Scanner s = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    Q20 main = new Q20();
    BankApplication bankApplication = new BankApplication();
    int cnt = 0;
    boolean exit = true;
    while (exit) {
      main.printMessageMenu();
      int menu = main.scanner();

      switch (menu) {
        case 1:
          main.printMessage1();
          if (cnt >= 100) {
            System.out.println("더 이상 계좌를 생성할 수 없습니다.");
          }
          try {
            bankApplication.account[cnt] = main.createAcc(); //AccountBank 객체 생성한거를 담아준다
            System.out.println("결과 : 계좌가 생성되었습니다.");
            cnt++;
          } catch (Exception e) {
            System.out.println("결과 : 계좌 생성이 실패했습니다.");
          }
          break;
        case 2:
          main.printMessage2();
          break;
        case 3:
          main.printMessage3();
          break;
        case 4:
          main.printMessage4();
          break;
        case 5:
          exit = false;
          break;
      }
    }
  }

  int scanner() {
    System.out.print("선택> ");
    return Integer.parseInt(s.nextLine());
  }

  void printMessageMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
    System.out.println("-----------------------------------------------");
  }

  void printMessage1() {
    System.out.println("-----------");
    System.out.println("계좌 생성");
    System.out.println("-----------");
  }

  void printMessage2() {
    System.out.println("-----------");
    System.out.println("계좌 목록");
    System.out.println("-----------");
  }

  void printMessage3() {
    System.out.println("-----------");
    System.out.println("예금");
    System.out.println("-----------");
  }

  void printMessage4() {
    System.out.println("-----------");
    System.out.println("출금");
    System.out.println("-----------");
  }

  AccountBank createAcc() {
    try {
      AccountBank ab = new AccountBank(); //<-리턴할 객체!

      System.out.print("계좌번호: ");
      ab.setAccountNum(s.nextLine());
      System.out.print("계좌주: ");
      ab.setName(s.nextLine());
      System.out.print("초기입금액: ");
      int balance = Integer.parseInt(s.nextLine());
      if (balance >= 0) {
        ab.setBalance(balance);
      } else {
        System.out.println("최소금액은 0원 입니다.");
      }

      return ab;
    } catch (Exception e) {
      System.out.println("계좌생성이 실패했습니다.");
      e.printStackTrace();
    }
    return null;
  }
}
