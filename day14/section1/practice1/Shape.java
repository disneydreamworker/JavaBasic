package day14.section1.practice1;

public abstract class Shape {
  protected double area;
  private String name;

  public Shape(){}

  public Shape(String name){
    this.name = name;
  }

  public abstract void calculationArea();

  public void print(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
