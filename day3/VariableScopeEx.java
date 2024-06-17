package day3;

public class VariableScopeEx {
    // 클래스 변수-> 메소드 메모리 영역에 저장. 모든 인스턴스에서 접근 가능
    static int globalValue = 700;

    public static void main(String[] args) {
        System.out.println("GlobalValue : " + globalValue);

        VariableScopeEx instance = new VariableScopeEx();
        instance.accessInstanceVariable();

        modifyGlobalValue();

        //렉시컬 스코프 : 변수의 유효범위가 코드의 작성 위치에 의해 결정
        {
            int anmos = 7;
            System.out.println("anmos=" + anmos);
        }
    }

    public static void modifyGlobalValue() {
        globalValue = 777;
        System.out.println("modified global value = " + globalValue);
    }

    public void accessInstanceVariable() {
        int localVariable = 0;
        System.out.println("localvariable : " + localVariable + globalValue);
    }
}
