package day15.assignment2;

public class TVFactory extends Factory implements IWorkingTogether{

  TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return 0;
  }

  @Override
  public int makeProducts(char skill) {
    return 0;
  }
}
