package day15.assignment2;

public class CarFactory extends Factory implements IWorkingTogether {
  CarFactory(String name, int openHour, int closeHour){
    super(name, openHour,closeHour);
  }

  @Override
  public int makeProducts(char skill) {
    return 0;
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return 0;
  }
}
