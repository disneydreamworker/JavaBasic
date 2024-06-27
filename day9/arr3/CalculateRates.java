package day9.arr3;

import java.text.DecimalFormat;

public class CalculateRates {

  public static void main(String[] args) throws Exception {
    CalculateRates calculateRates = new CalculateRates();

    // ���� ���: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
    calculateRates.calculate(new int[]{10, 30, 20, 80, 50});

    // ���� ���: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
    calculateRates.calculate(new int[]{50, 50, 50, 50, 50});

    // ���� ���: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
    calculateRates.calculate(new int[]{1, 2, 3, 4, 5});
  }

  public void calculate(int[] nums) throws Exception {
    // calculate �޼ҵ� ����
    float star;
    int sum = 0;
    for (int n : nums) {
      sum += n;
    }

    for (int n : nums) {
      star = ((float)n /sum) * 100;
//      double percentage = Math.ceil(star);
      double p2 = Math.round(star);
      System.out.print("*".repeat((int)star) + "(" + p2+ "%)\n");
    }
  }
}
