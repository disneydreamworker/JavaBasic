package day9.arr3;

import java.util.Arrays;

public class Prob6 {

  public static void main(String[] args) {
    Prob6 median = new Prob6();

    int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
    System.out.println("input : " + Arrays.toString(values1));
    System.out.println("median : " + median.findMedian(values1));
    System.out.println("=================================================");

    int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
    System.out.println("input : " + Arrays.toString(values2));
    System.out.println("median : " + median.findMedian(values2));
  }

  public int findMedian(int[] values) {
    double average = 0.0;
    //평균치 구하기
    for (int value : values) {
      average += value;
    }
    average = average / values.length;
    //각 숫자의 중간값 구하기
    double temp = Integer.MAX_VALUE;
    int num = Integer.MAX_VALUE;

    for (int v : values ) {
      double m = Math.abs(average - v);
      if (m < temp) {
        temp = m;
        num = v;
      } else if (m == temp) {
        num = Math.min(v, num);
      }
    }
    return num;
  }
}
