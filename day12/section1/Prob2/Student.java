package day12.section1.Prob2;

public class Student {
  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student(String name, String subject, int fee){
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee(){

  };

  public void print(){

  }


  public static void main(String args[]){
    Student stu = new Student("차은우", "jspprogram",
        500000);
    stu.calcReturnFee();
    stu.print();
  }
}