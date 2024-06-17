package day3;

public class PrintF {
    public static void main(String[] args) {
        //printf
        // %o : 8진수
        // %x : 16진수
        // %f : 소수
        //%e %c : 문자

        long l1 = 10;
        System.out.printf("result = [%5d%n]", l1); // 공간 5개에 l1을 할당 -> 오른쪽 정렬
        System.out.printf("result = [%-5d%n]", l1); // 왼쪽 정렬
        System.out.printf("result = [%05d%n]", l1); // 빈칸은 0으로 채워라


        long hx = 0xFFFF; //16진수 15151515
        System.out.printf("hx = %x   %n", hx);
        System.out.printf("hx = %#x   %n", hx);
        System.out.printf("hx = %#X   %n", hx);

        //Integer.toBinaryString(int i) 로 10진수 -> 2진수 문자열로 변환
        int binaryNum = 0b11; //b는 2진수
        System.out.printf("%s%n", Integer.toBinaryString(binaryNum));

        char c = 'A';
        System.out.println((int)c);

    }
}
