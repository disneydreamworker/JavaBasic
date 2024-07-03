package day16.homework.exec;

import day16.homework.dao.MemberDao;
import java.util.Scanner;

public class MemberMain {

  static int id;
  static String name;
  static String job;

  public static void main(String[] args) {
    System.out.println("==회원 정보 입력 후 조회===");
    //회원의 정보를 사용자 받는 기능  (static 메소드로)
    scanInsert();
    MemberDao member = new MemberDao(id, name, job);
    member.memberInsert();
    member.memberSearch();
    System.out.println("==회원 정보수정 후 조회===");
    scanUpdate();
    member.memberUpdate(job, id);
    member.memberSearch();
    System.out.println("==회원 정보삭제 후 조회===");
    scanDelete();
    member.memberDelete(id);
    member.memberSearch();
  }


  public static void scanInsert() {
    Scanner s = new Scanner(System.in);
    System.out.println("id를 입력해주세요.");
    id = Integer.parseInt(s.nextLine());
    System.out.println("이름을 입력해주세요.");
    name = s.nextLine();
    System.out.println("직업을 입력해주세요.");
    job = s.nextLine();
  }

  public static void scanUpdate() {
    Scanner s = new Scanner(System.in);
    System.out.println("직업을 입력해주세요.");
    job = s.nextLine();
    System.out.println("회원 아이디를 입력해주세요.");
    id = Integer.parseInt(s.nextLine());
  }

  public static void scanDelete() {
    Scanner s = new Scanner(System.in);
    System.out.println("회원 아이디를 입력해주세요.");
    id = Integer.parseInt(s.nextLine());
  }

}
