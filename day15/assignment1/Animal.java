package day15.assignment1;

public abstract class Animal {
  private int speed; //속도 km/h
  private double distance; //이동거리 km

  //생성자
  Animal(int speed){
    this.speed = speed;
  }

  //추상 메서드
  abstract void run(int hours);

  //게터세터
  public double getDistance(){
    return distance;
  }
  public void setDistance(double distance){
    this.distance = distance;
  }
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
