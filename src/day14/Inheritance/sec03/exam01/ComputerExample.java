package day14.Inheritance.sec03.exam01;

import day14.Inheritance.sec05.package2.C;

public class ComputerExample {

  public static void main(String[] args) {
    int radius = 10;
    Calculator calculator = new Calculator();
    System.out.println("원 면적 :" + calculator.areaCircle(10));
    System.out.printf("원 면적 : %.2f\n", calculator.areaCircle(10));

    System.out.println("========UpCasting============");
    Calculator calculator2 = new Computer();
    double area = calculator2.areaCircle(20);
    System.out.printf("원 면적 : %.2f", area);

    int radius = 10;
    Calculator calculator = new Calculator();
    System.out.println("원의 면적 : " + calculator.areaCircle(radius));

    System.out.println("======UPCasting======");
    Calculator calculator1 = new Computer();
    double area = calculator1.areaCircle(10);
    System.out.printf("원의 면적 : %.2f", area);
    
  }
}