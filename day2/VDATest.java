package day2;

public class VDATest {
    public static void main(String[] args) {
        //Q. [정수 int ] 한 개를 저장하기 위해서 변수를 선언 하세요. 변수명은 v
        int v;
        // 정수형 변수 v에 20을 저장하세요
        v = 20;
        // 정수형 v에 값을 "v=10" 출력하세요
        System.out.println("v = " + v);

        //Q2.
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = "  + c);

        //Q3.
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println(sum);

        //Q4.
        int x = 10;
        int y = 20;
        int z = x;

        x = y;
        y = z;
        System.out.println("x = " + x + " y = " + y);
    }
}
