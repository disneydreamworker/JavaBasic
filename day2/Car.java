package day2;

public class Car {
    //멤버 변수
    private String model;
    private long distance;
    private int price;
    public String company;
    public char type;
    public boolean auto;
    public int year;
    public float gasmi;

    //동작 메소드
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
