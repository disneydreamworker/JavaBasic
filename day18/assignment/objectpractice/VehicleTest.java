package day18.assignment.objectpractice;

public class VehicleTest {

  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle();
    Vehicle vehicle2 = new Vehicle();

    Owner owner1 = new Owner("LEE", "010-2233-4455");
    Owner owner2 = new Owner("LEE", "010-6677-8899");


    vehicle1.setOwner(owner1); //<- 얉은 복사 owner1이 가리키는 Owner과 vehicle1의 owner가 가리키는 Owner 같다. 주소값만 복사한 얉은 복사
    vehicle1.setPrice(25000000);
    System.out.println(vehicle1); // -> object.toString() -> 오버라이딩된 toString이 출력됨
    System.out.println("vehicle1의 owner => " + vehicle1.owner);

    vehicle2.setOwner(owner2);
    vehicle2.setPrice(50000000);
    System.out.println(vehicle2);
    System.out.println("vehicle2의 owner => " + vehicle2.owner);

    System.out.println("동일한 소유주 여부 : " + vehicle1.equals(vehicle2));
  }
}