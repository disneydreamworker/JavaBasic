package day9.arr3;

// 1~30 사이의 10 개의 난수(랜덤한 정수)를 발생시켜 배열에 저장하여 리턴하는
//generateRandom() 메소드와 매개변수로 받은 정수형 배열에서 최대값을 리턴하는
//getMaxNum() 메소드를 각각 구현하시오.
//getMaxNum() 메소드 구현 시, java.util.Arrays 클래스를 사용해서는 안되며, 반복문을 사
//용하여 로직을 구현해야 합니다.
public class Prob2 {

  public static int[] generateRandom() {
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = (int) (Math.random() * 30) + 1;
    }
    return arr;
  }

  public static int getMaxNum(int[] arr) {
    int max = 0;
    for (int a : arr) {
      if (max < a) {
        max = a;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] generateRandomReturn = generateRandom();
    int max = getMaxNum(generateRandomReturn);
    System.out.println("<<생성된 난수>>");
    for (int i = 0; i < generateRandomReturn.length; i++) {
      System.out.print(generateRandomReturn[i] + ", ");
    }
    System.out.println();
    System.out.println("=================================");
    System.out.println("배열에서 가장 큰 숫자 : " + max);
  }
}
