package day2;

public class Book {
    //
    public String title;
    public String author;
    public String company;
    public int price;
    public String isbn;
    public int totalpage;

    //메소드 변수 : 스택 영역에 저장되어서 실행 후 메모리 날라감
    public void bookInfo() {  //되돌려줄 값도 없고 나 스스로 실행하고 끝내면 됨
        System.out.println("야옹서점 책 정보 입니다.");
        System.out.println(this.title + "\t" + this.author);
    }

    public int bookPrice(){ // 할인된 가격을 전달하고 싶을 때
        int price = (int)(this.price * 0.1);
        return price;
    }

    public void setBookPrice(int price){ //어딘가에서 받아온 값을 수정하고 싶을 때
        this.price = price;
    }
}
