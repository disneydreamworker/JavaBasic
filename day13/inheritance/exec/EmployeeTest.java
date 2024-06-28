package day13.inheritance.exec;

import day13.inheritance.vo.RempVO;

public class EmployeeTest {

  public static void main(String[] args) {
    RempVO vo = new RempVO(true, "홍길동",30,"010-0000-0000","2020.01.01", "홍보부");
    RempVO vo2 = new RempVO(false, "홍길동",30,"010-0000-0000","2020.01.01", "개발팀");
    System.out.println(vo.toString());
    System.out.println(vo2.toString());

    //public Employee(boolean marriage, String name, int age, String phone, String empDate,
    //      String dept)
  }
}
