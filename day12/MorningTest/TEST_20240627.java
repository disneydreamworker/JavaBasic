package day12.MorningTest;

import java.util.Scanner;

public class TEST_20240627 {

  public static void main(String[] args) {
    TEST_20240627 test = new TEST_20240627();
    test.Q9();
  }

  public void Q6() {
    System.out.println("3");
    System.out.println("5");
  }

  public void Q7(){
    int[] array = {1,5,3,8,2};
    int i = 0;
    for (int a : array){
      i = Math.max(i, a);
    }
    System.out.println(i);
  }

  public void Q8(){
    int[][] array = {{95,86}, {83,92,96}, {78,83,93,87,88}};

    int sum = 0;
    for(int i = 0 ; i < array.length; i++) {
      for (int j =0; j < array[i].length; j++){
        sum += array[i][j];
      }
    }
    System.out.println((double)sum/array.length);
  }

  public void Q9() {
    boolean exit = true;
    Scanner s = new Scanner(System.in);
    int[] scores = null; //null로 배열 초기화
    int numStudent = 0; //3

    while(exit){
      System.out.println("------------------------------------------------------");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("------------------------------------------------------");
      System.out.print("선택> ");
      int input1 = Integer.parseInt(s.nextLine());

      switch (input1) {
        case 1 :
          System.out.print("학생수> ");
          numStudent = Integer.parseInt(s.nextLine());
          scores = new int[numStudent];
          break;
        case 2 :
          if (scores == null)  {
            System.out.println("학생수를 먼저 입력해주세요.");
            break;
          }
          for (int i = 0; i  < numStudent; i++) {
            System.out.print("scores[" + i + "]> ");
            scores[i] = Integer.parseInt(s.nextLine());
          }
          break;
        case 3:
          if (scores == null)  {
            System.out.println("학생수를 먼저 입력해주세요.");
            break;
          } else {
            for (int i = 0; i  < numStudent; i++) {
              System.out.print("scores[" + i + "]: " + scores[i] + "\n");
            }
          }
          break;
        case 4:
          if (scores == null)  {
            System.out.println("학생수를 먼저 입력해주세요.");
            break;
          } else {
            int maxScore = 0, sum = 0; double averageScore = 0;
            for (int i = 0; i  < numStudent; i++) {
              maxScore = Math.max(scores[i], maxScore);
              sum += scores[i];
            }
            averageScore = Math.round((double)(sum / scores.length));
            System.out.println("최고 점수 : " + maxScore);
            System.out.println("평균 점수 : " + averageScore);
            break;
          }
        case 5:
          System.out.println("프로그램 종료");
          exit = false;
          break;
      }
    }
  }


}
