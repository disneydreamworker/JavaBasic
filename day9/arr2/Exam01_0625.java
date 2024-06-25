package day9.arr2;
//문제1. 다음은 주어진 정수 배열로부터, 전체 정수의 합 대비 각 정수의 비율을 분석하는
//RateTest 클래스 입니다. 입력값에 따라 다음과 같은 결과가 수행되도록 작성하시오. (일차원배
//열)
public class Exam01_0625 {
  public static double[] calculation(int[] arr) {
    int sum = 0;
    for(int a : arr) {
      sum+= a;
    }
    double[] arrReturn = new double[arr.length];
    for(int i =0; i< arr.length;i++){
      arrReturn[i] = ((double) arr[i] /sum) * 100;
    }
    return arrReturn;
  }
  public static void main(String[] args) {
    int[] arr = {10,30,20,80,50};
    double[] arrPrint = calculation(arr);

    for(double b : arrPrint){
      System.out.print("*".repeat((int)b));
      System.out.println("(" + b + ")");
    }
  }
}
