package day2;

public class VDATest2 {
    public static void main(String[] args) {

        String str = ""; // String 클래스는 ""로 초기화가 가능하다.
        char c = ' '; // char 변수는 반드시 공백이 있어야 초기화가 가능하다.
        // 숫자형 변수 byte, short, int, long은 반드시 실제값을 할당해 주어야 한다.

        // 2진수 값을 입력하기
        int x = 0b1011;
        int y = 0b10100;

        //8진수 값을 입력하기
        int o1 = 013; // 8 * 1 + 1 * 3 = 11
        int o2 = 0206; // 64 * 2 + 8 * 0 + 1 * 6 = 134

        //16진수 값을 입력하기 A:10(10진수의 16), B:11(10진수의 17), C:12, D:13, E:14, F:15
        int z1 = 0xB3; // 16 * 11 + 1 * 3 = 179
        int z2 = 0x2A0F; //16^3 * 2 + 16^2 * 10 + 16 * 0 + 1 * 15

        //Byte
        byte v1 = -128; // (byte) 128 와 동일한 결과
        byte v2 = 127;

        //Long
        long l1 = 10;
        long l2 = 20L;
        long l3 = 1000000000000L; // int의 크기를 초과하는 값은 반드시 L을 추가해서 컴파일러에게 고지

        //Float (소수점 7자리까지 표시, 32bit)
        float f1 = 3.14f;
        float f2 = 3E6F;

        //Double (소수점 15자리까지 표시, 64bit)
            // Float 보다 2배의 유효 자릿수를 가지기 때문에 정확한 숫자 저장이 가능
        double d3 = 5e2; // 5.0 * e(10의 2승) = 500.0
        double d4 = 0.12E-2; // 0.12 * e(10의 -2승) = 0.0012

        // Boolean
            // 조건문, 제어문의 실행 흐름을 제어하는데 사용
            // 연산식에서 비교 및 논리 연산의 산출값을 검증할때 사용
        boolean stop = true;
        stop = false;
        System.out.println(stop);

        int x2 = 30;

        // 변수 x2의 값이 20인가?
        boolean result = (x2 == 20);
        // 변수 x2의 값이 20이 아닌가?
        result = (x2 != 20);
        // 변수 x2의 값이 20보다 큰가?
        result = (x2 > 20);
        // 변수 x2의 값이 0보다 크고 20보다 작은가?
        result = (0 < x2 && x2 < 20);
        // 변수 x2의 값이 0보다 작거나 20보다 큰가?
        result = (0 > x2 || x2 > 20);

    }
}
