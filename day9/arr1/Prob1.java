package day9.arr1;

//제1. Prob1의 main() 메소드에는 정수형 배열이 초기화되어 있다. 이 배열을 매개변수로 받아
//서 배열의 내용을 홀수,짝수인지 구분하여 홀수의 합과 짝수의 합을 아래와 같이 출력할 수 있
//도록 구현하세요.
public class Prob1 {

  public static void main(String[] args) {
    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    int odd = 0;
    int even = 0;
    for (int a : ia) {
      if (a % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println(" 배열 ia ");
    System.out.println("홀수의 합 : " + odd);
    System.out.println("짝수의 합 : " + even);

    odd = 0;
    even = 0;
    for (int b : ib) {
      if (b % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println(" 배열 ib ");
    System.out.println("홀수의 합 : " + odd);
    System.out.println("짝수의 합 : " + even);
  }
}
