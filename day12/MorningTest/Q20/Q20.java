package day12.MorningTest.Q20;

public class Q20 {

  static java.util.Scanner s = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    Q20 main = new Q20();
    BankApplication bankApplication = new BankApplication();
    int cnt = 0; //생성된 계좌의 수=BankApplication[]에 저장된   AccountBank 객체의 수
    boolean exit = true;

    while (exit) {
      main.printMessageMenu();
      int menu = main.scanner();

      switch (menu) {
        case 1:
          main.printMessage1();

          if (cnt >= 100) {
            System.out.println("더 이상 계좌를 생성할 수 없습니다.");
            break;
          }

          try {
            //계좌번호가 중복되는지 확인
            AccountBank insertAccount;
            boolean loop;

            do {
              loop = false;
              insertAccount = main.createAcc();

              for (int i = 0; i < cnt; i++) {
                String existingAccount = bankApplication.accounts[i].accountNum;
                if (insertAccount.accountNum.equals(existingAccount)) {
                  System.out.println("중복된 계좌번호가 존재합니다.");
                  loop = true;
                  break;
                }
              }
            } while (loop);

            bankApplication.accounts[cnt] = insertAccount; //AccountBank를 배열에 담아준다
            System.out.println("결과 : 계좌가 생성되었습니다.");
            cnt++;
          } catch (Exception e) {
            System.out.println("결과 : 계좌 생성이 실패했습니다.");
          }
          break;

        case 2:
          main.printMessage2();

          if (bankApplication.accounts[0] == null) {
            System.out.println("생성된 계좌가 없습니다.");
            break;
          } else {
            for (int i = 0; i < cnt; i++) {
              System.out.printf("%s\t\t\t%s\t\t\t%d\n", bankApplication.accounts[i].accountNum,
                  bankApplication.accounts[i].name, bankApplication.accounts[i].balance);
            }
          }
          break;

        case 3:
          main.printMessage3();

          if (bankApplication.accounts[0] == null) {
            System.out.println("생성된 계좌가 없습니다.");
          }

          String account = main.depositWithdrawalAccount();
          System.out.print("예금액: ");
          int deposit = Math.abs(Integer.parseInt(s.nextLine()));

          for (int i = 0; i < cnt; i++) {
            if (account.equals(bankApplication.accounts[i].accountNum)) {
              bankApplication.accounts[i].balance += deposit;
              break;
            }
          }
          break;

        case 4:
          main.printMessage4();

          if (bankApplication.accounts[0] == null) {
            System.out.println("생성된 계좌가 없습니다.");
          }

          String account4 = main.depositWithdrawalAccount();
          System.out.print("출금액: ");
          int deposit4 = Math.abs(Integer.parseInt(s.nextLine()));

          for (int i = 0; i < cnt; i++) {
            if (account4.equals(bankApplication.accounts[i].accountNum)) {
              if (bankApplication.accounts[i].balance >= deposit4) {
                bankApplication.accounts[i].balance -= deposit4;
                System.out.println("결과: 출금이 성공되었습니다.");
                break;
              } else {
                System.out.println("출금액이 예금액보다 많아 출금할 수 없습니다.");
              }
            }
          }
          break;

        case 5:
          exit = false;
          System.out.println("프로그램 종료");
          break;
      }
    }
  }

  int scanner() {
    System.out.print("선택> ");
    return Integer.parseInt(s.nextLine());
  }

  void printMessageMenu() {
    System.out.println("-----------------------------------------------");
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

  String depositWithdrawalAccount() {
    System.out.print("계좌번호: ");
    return s.nextLine();
  }


}
