package day9.practice.p2;
//이 름 : 유관순 나 이 : 40 부 서 : 교무과
public class Employee {
  private String name;
  private   int age;
  private String dept;

  public void print() {
    System.out.println("이  름 : " + name + " 나 이 : " + age + " 부   서 : " + dept);
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }
}
