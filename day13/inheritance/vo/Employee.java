package day13.inheritance.vo;

public class Employee {

  private boolean marriage;
  private String name;
  private int age;
  private String phone;
  private String empDate;
  private String dept;

//  //접근제한자 변환에 따른 결과
//  private boolean marriage;
//  protected String name;
//  protected int age;
//  protected String phone;
//  protected String empDate;
//  protected String dept;

  public Employee(){}

  public Employee(boolean marriage, String name, int age, String phone, String empDate,
      String dept) {
    this.marriage = marriage;
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.empDate = empDate;
    this.dept = dept;
  }

  public Employee(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "marriage=" + marriage +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", empDate='" + empDate + '\'' +
        ", dept='" + dept + '\'' +
        '}';
  }
}
