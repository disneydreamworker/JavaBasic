package day13.inheritance.vo;

public class DempVO extends Employee{
  private String period;

  public DempVO(boolean marriage, String name, int age, String phone, String empDate, String dept,
      String period) {
    super(marriage, name, age, phone, empDate, dept);
    this.period = period;
  }

  @Override
  public String toString() {
    return "DempVO{" +
        "period='" + period + '\'' +
        '}';
  }
}
