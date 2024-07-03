package day15.assignment1;

public class AnimalTest {

  public static void main(String[] args) {
      Animal dog = new Dog(8);
      Animal chicken = new Chicken(3);
      Chicken cheatableChicken = new Chicken(5);

      if (cheatableChicken instanceof Cheatable) {
        cheatableChicken.fly();

        for (int i = 0; i < 3; i++) {
          System.out.println(i + 1 + "시간 후");
          dog.run(i + 1);
          System.out.println("개의 이동거리 =" + dog.distance);
          chicken.run(i + 1);
          System.out.println("닭의 이동거리 =" + chicken.distance);
          cheatableChicken.run(i + 1);
          System.out.println("날으는 닭의 이동 거리 =" + cheatableChicken.distance);
        }
      }
  }
}

/*
1시간 후
개의 이동거리=4.0
닭의 이동거리=3.0
날으는 닭의 이동거리=10.0
    2시간 후
개의 이동거리=8.0
닭의 이동거리=6.0
날으는 닭의 이동거리=20.0
    3시간 후
개의 이동거리=12.0
닭의 이동거리=9.0
날으는 닭의 이동거리=30.0 */
