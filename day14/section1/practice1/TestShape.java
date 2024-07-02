package day14.section1.practice1;

public class TestShape {

  public static void main(String[] args) {
    Shape [] shape = new Shape[2];

    shape[0] = new Circle("원", 10.0);
    shape[1] = new Rectangular("직사각형", 10.0, 20.0);

    shape[0].calculationArea();
    shape[1].calculationArea();
  }
}
