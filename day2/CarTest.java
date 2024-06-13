package day2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        // private이라 직접 접근이 불가능
//        car1.model = "BMW528i";
//        car1.distance = 100000;
//        car1.price = 90000000;

        car1.company = "BMW";
        car1.type = 'A';
        car1.auto = true;
        car1.year = 2010;
        car1.gasmi = 12.5f;

        System.out.println(car1.getModel()); // 멤버 변수 model에 저장된 데이터는 없음. null이 출력.
        car1.setModel("BMW-1000"); // 멤버 변수 model에 데이터 할당.
        System.out.println(car1.getModel()); // BMW-1000 출력됨.

    }
}
