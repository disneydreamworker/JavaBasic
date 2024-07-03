package day15.assignment1;

public class AnimalTest {

  public static int cnt = 1;

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(cnt+"시간 후");
      Animal dog = new Dog(8);
      Animal chicken = new Chicken(3);
      Chicken cheatableChicken = new Chicken(5);
      cnt++;

      if (cheatableChicken instanceof Cheatable) {
        cheatableChicken.fly();
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
