package day9.practice.p3;

public class BirdPlay {
 
	public static void main(String[] args){
		Duck duck = new Duck();
		duck.setName("꽥꽥이");
		duck.fly();
		duck.sing();
		String d = duck.toString();
		System.out.println(d);
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("짹짹");
		sparrow.fly();
		sparrow.sing();
		String s = duck.toString();
		System.out.println(s);
		
		
	}


}
