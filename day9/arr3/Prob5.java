package day9.arr3;

public class Prob5 {

  public static int getValue(int[] values, boolean isMax) {
    if (isMax) {
      int max = 0;
      for (int i : values) {
        if (i > max) {
          max = i;
        }
      }
      return max;
    } else {
      int min = values[0];
      for (int i : values) {
        if (i < min) {
          min = i;
        }
      }
      return min;
    }
  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

  }
}
