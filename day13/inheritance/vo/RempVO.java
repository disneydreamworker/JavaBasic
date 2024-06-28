package day13.inheritance.vo;

public class RempVO extends Employee{
  public RempVO(){
  }

//  public RempVO(boolean marriage, String name, int age, String phone, String empDate, String dept) {
//    super(marriage, name, age, phone, empDate, dept);
//  }

  //슈퍼클래스의 상태정보를 마음대로 접근해서 정보은닉에 위배하지 않고 객체 자신이 초기화를 해서 우회하여 접근하는 것이 바람직하다
  public RempVO(boolean marriage, String name, int age, String phone, String empDate, String dept) {
    //private일 경우 슈퍼클래스에 던지는 방법밖엔 없음
    super(marriage, name, age, phone, empDate, dept);

    //private일 경우 this로 접근 불가능
//    this.name = name;
//    this.age = age;
//    this.phone = phone;
//    this.empDate = empDate;
//    this.dept = dept;
//    this.marriage = marriage;
  }

  public RempVO(String name, int age, String phone){
    super(name, age, phone);
  }

}
