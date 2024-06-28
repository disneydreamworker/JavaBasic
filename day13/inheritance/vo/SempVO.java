package day13.inheritance.vo;

public class SempVO extends Employee {

  private final String senior;

  public SempVO(boolean marriage, String name, int age, String phone, String empDate, String dept,
      String senior) {
    super(marriage, name, age, phone, empDate, dept);
    this.senior = senior;
  }

  @Override
  public String toString() {
    return "SempVO{" + "senior='" + senior + '\'' + '}';
  }
}
