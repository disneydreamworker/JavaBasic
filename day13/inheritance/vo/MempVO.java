package day13.inheritance.vo;

public class MempVO extends Employee{

  private String mdept;

  public MempVO(boolean marriage, String name, int age, String phone, String empDate, String dept,
      String mdept) {
    super(marriage, name, age, phone, empDate, dept);
    this.mdept = mdept;
  }

  @Override
  public String toString() {
    return "MempVO{" +
        "mdept='" + mdept + '\'' +
        '}';
  }
}
