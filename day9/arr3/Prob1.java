package day9.arr3;

public class Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    Prob1 p = new Prob1();
    System.out.println("( 배열 ia )");
    p.calc(ia);
    System.out.println("( 배열 ib )");
    p.calc(ib);
  }

  public void calc(int[] arr) {
    int odd = 0, even = 0;
    for (int a : arr) {
      if (a % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println("홀수의 합 : " + odd);
    System.out.println("짝수의 합 : " + even);
  }
}
