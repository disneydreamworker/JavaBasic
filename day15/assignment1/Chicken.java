package day15.assignment1;

public class Chicken extends Animal implements Cheatable{
  //생성자
  Chicken(int speed){
    super(speed);
  }

  //오버라이딩
  //닭은 속력 * 시간 만큼의 거리
  @Override
  void run(int hours) {
    this.distance = hours * this.speed;
    }

  @Override
  public void fly() {
    this.speed = this.speed * 2;
  }

  public double getDistance() {
    return distance;
  }
}