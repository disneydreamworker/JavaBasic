package day14.section1.assignment;

public class Prob1 {

  public static void main(String[] args) {
    Wheeler wheeler1 = new Truck(100, "현대", 4);
    Wheeler wheeler2 = new Bike (0, "기아", 2);

    wheeler1.speedUp(100);
    wheeler2.speedUp(25);

    wheeler1.speedDown(70);
    wheeler2.speedDown(25);

    wheeler1.stop();
    wheeler2.stop();

    wheeler1.speedUp(10);
  }
}
