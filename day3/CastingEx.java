package day3;

public class CastingEx {
    public static void main(String[] args) {

        // 강제 타입변환 (큰 -> 작) 캐스팅
        int intvalue1 = 249849;
        char charv1 = (char) intvalue1;
        System.out.println(charv1);

        int v1 = 102020202;
        byte b1 = (byte) v1;
        System.out.println(v1 + " " + b1);

        long longv1 = 3000000;
        int intvalue2 = (int) longv1;
        System.out.println(intvalue2);

        //연산식 자동 타입 변환
        //자바는 실행 속도의 향상을 위해 컴파일 단계에서 연산을 수행한다
        //바이트, 쇼트형 연산을 할 때 자동으로 프로모션(타입변환)하여 계산한다
        byte result = 10 + 20;
        // byte x = 10; byte y = 20; byte z = x + y; <- 불가능
        int z = (byte) 10 + (byte) 20;

        //실수
        int intvalue3 = 10;
        double doublevalue3 = 5.5;
        double result5 = intvalue3 + doublevalue3; // int 변수가 double로 자동 캐스팅되어 double 형에 연산한다
        int result6 = intvalue3 + (int) doublevalue3; // double 변수를 int로 캐스팅하여 int형에 연산한다

        int a = 1; int b = 2;
        double result7 = (double)a / (double)b; // 0.5 출력
        double result8 = (double)a / b;
        double result9 = a / (double)b;
        System.out.println(result9);

        //자바에서 '+' 연산자의 기능
            // 1. 피연산자가 모두 숫자인 경우 덧셈 연산 수행
            // 2. 피연산자 중 하나가 문자일 경우 나머지 피연산자도 문자열로 자동 변환되어 문자열로 저장
        String op2 = "3" + 7 ;
        System.out.println(op2);
        //왼쪽부터 계산한다
        String op3 = 4 + 5 + "0"; //9 + "0" => 90 출력
        String op4 = "1" + (4 + 5); // 괄호 먼저 수행 후 "1" 결합 => 19 출력
        System.out.println(op4);
    }
}
