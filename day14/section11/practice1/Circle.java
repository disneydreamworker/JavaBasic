package day14.section11.practice1;

public class Circle extends Shape {

  private double radius;

  public Circle() {
  }

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  @Override
  public void calculationArea() {
    super.area = Math.pow(radius, 2) * Math.PI;
    System.out.println(super.getName() + "의 면적은 " + super.area);
  }
}
