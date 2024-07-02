package day14.section1.practice1;

public class Rectangular extends Shape {

  private double width;
  private double height;

  public Rectangular() {
  }

  public Rectangular(String name, double width, double height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  @Override
  public void calculationArea() {
    super.area = width * height;
    System.out.println(super.getName() + "의 면적은 " + super.area);
  }
}
