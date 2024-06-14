package day3;

public class StringExam {
    public static void main(String[] args) {
        String name = "Java";
        String job = "programming";

        String str = "나는 \" 자바 \"를 배웁니다.";
        System.out.println(str);
        String str1 = "나는 \" "+ name + job +" \"를 배웁니다.";
        System.out.println(str1);
        String str2 = "번호\t이름\t작업";
        System.out.println(str2);
        String str3 = "나는 \n 자바 프로그래머 입니다\n백엔드 개발자 과정을 수료했습니다.\n";
        System.out.println(str3);
        String str4 = "" +"{\n" + "\t\"id \":\"silver\",\n" +"}";
        System.out.println(str4);
        String str5 = """
                {흠? id
                :silver
                }
                """;
        System.out.println(str5);
    }
}
