package day15.assignment2;

public abstract class Factory {

  private final int openHour;
  private final int closeHour;
  private final String name;

  Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName() {
    return name;
  }

  public int getWorkingTime() {
    return closeHour-openHour;
  }

  public abstract int makeProducts(char skill);

}
