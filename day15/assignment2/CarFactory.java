package day15.assignment2;

public class CarFactory extends Factory implements IWorkingTogether {

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour,closeHour);
  }

  @Override
  public int makeProducts(char skill) {
    switch (skill) {
      case 'A':
        return super.getWorkingTime() * 3;
      case 'B':
        return super.getWorkingTime() * 2;
      case 'C':
        return super.getWorkingTime();
      default:
        return 0;
    }
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return this.makeProducts('B');
  }
}
