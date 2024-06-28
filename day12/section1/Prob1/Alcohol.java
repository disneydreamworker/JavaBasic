package day12.section1.Prob1;

public class Alcohol extends Drink {

  private double alcper;

  public Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }

  public static void printTitle() {
    System.out.println("상품명(도수[%])\t\t단가\t\t수량\t\t금액");
  }

  public void printData() {
    System.out.println(
        super.getName() + "(" + alcper + ")   " + super.getPrice() + "  " + super.getCount() + "  "
            + super.getTotalPrice());
  }
}
