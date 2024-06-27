package day9.arr3;

import java.util.*;
import java.util.HashMap;

public class Prob3 {
  //10번 문제
//  public int[][] sub (int[][] a, int[][] b, int[][] c) {
//    //행렬의 차를 구하기
//
//  }
//
//  public void prn (int [][] c) {
//    //배열 c 를 출력
//    //각 행 별로 줄바꿈 각 열은 공백으로 구분
//  }


  public static void main(String[] args) {
    int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array);
  }

  private static void printUniqueNumber(int[] array) {
    // 구현하세요.
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int a : array) {
      map.put(a, map.getOrDefault(a, 0) + 1);
    }

    List<Integer> arr = new ArrayList<>();

    for (Integer i : map.keySet()) {
      if (map.get(i) == 1) {
        arr.add(i);
      }
    }
    if (arr.isEmpty()) {
      System.out.println("중복되는 값이 없습니다.");
    } else {
      for (int i = 0; i < arr.size(); i++) {
        if (i == arr.size() - 1) {
          System.out.print(arr.get(i));
        } else {
          System.out.print(arr.get(i) + ", ");
        }
      }
    }
  }
}