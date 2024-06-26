package day11.exec;

import day11.dao.CarDAO;
import day11.dto.CarVO;
import day11.util.CarUtility;
import java.util.Scanner;

public class CarMain {

  public static void main(String[] args) {
    //1. 자동차 VO의 정보를 입력받아 자동차 volvo 객체를 생성해 주세요.
    CarVO volvo = new CarVO();
    Scanner s = new Scanner(System.in);
    System.out.println("자동차의 정보를 차례로 입력해주세요. 1. 이름 2. 차주인 3. 가격 ");
    //입력구간
    volvo.carName = s.nextLine();
    volvo.carOwner = s.nextLine();
    volvo.carPrice = 10000000;
    volvo.carSn = "12345";
    volvo.carType = "SUV";
    volvo.carYear = 2023;

    System.out.println("입력하신 정보로 CarVO 객체가 생성되었습니다.");
    CarDAO dao = new CarDAO();

    //2. 생성된 volvo 인스턴스를 데이터베이스에 입력해 주세요.  carInsert 실행
    System.out.println("=================================");
    dao.carInsert(volvo);

    //3.데이터베이스에 저장된 volvo를 조회해 주세요 carSelect
    System.out.println("=================================");
    System.out.println("조회하시겠습니까? (y/n)");
    dao.carSelect(volvo);

    CarUtility util = new CarUtility();
    util.carPrint(volvo);
  }
}
