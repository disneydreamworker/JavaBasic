package day12.section1.Prob1;

public class Drink {
private String name;
private int price;
private int count;

  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public void printTitle() {
    System.out.println("상품명\t\t단가\t\t수량\t\t금액");
  }

  public int getTotalPrice() {
    int totalPrice = price * count;
    return totalPrice;
  }
  public void printData() {
    int totalPrice = getTotalPrice();
    System.out.println(name + "  " + price + "  " + count + "  " + totalPrice);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
