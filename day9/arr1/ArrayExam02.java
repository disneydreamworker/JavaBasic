package day9.arr1;
//문제 2. 1부터 100 사이의 난수를 발생시켜서 배열의 원소로 초기화하고, 출력하기
//1) 생성할 배열은 int 타입이며, 개수는 5개

public class ArrayExam02 {
  static int[] inputRandom(int[] arr) {
//    int index = 0;
//    for (int i : arr) {
//      arr[index] = (int)(Math.random()*100) + 1;
//      index++;
//    }
    for (int index = 0; index < arr.length; index++) {
      arr[index] = (int) (Math.random() * 100) + 1;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
//    arr = inputRandom(arr);
    for (int n : inputRandom(arr)) {
      System.out.print(n + " ");
    }

  }
}
