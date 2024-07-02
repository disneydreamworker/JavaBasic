package day15.assignment1;

import static day15.assignment1.AnimalTest.cnt;

public class Chicken extends Animal implements Cheatable{
  //생성자
  Chicken(int speed){
    super(speed);
  }

  //오버라이딩
  //닭은 속력 * 시간 만큼의 거리
  @Override
  void run(int hours) {
      double distance = super.getSpeed() * hours;
      super.setDistance(distance);
      System.out.printf("닭의 이동거리= %.1f\n", super.getDistance());
    }

  @Override
  public void fly() {
    int speed = super.getSpeed() * 2;
    super.setSpeed(speed);
    double distance = speed * cnt;
    super.setDistance(distance);
    System.out.printf("날으는 닭의 이동거리= %.1f\n", super.getDistance());
  }
}