package day2;

public class BookExam {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "자바";
        book1.author = "김자바";
        book1.company = "한빛미디어";
        book1.price = 10000;
        book1.isbn = "ISBN-20230312";
        book1.totalpage = 1004;

        book1.bookInfo();
        int price = book1.bookPrice();
        System.out.println("해당 도서의 가격은 " + price);
        book1.setBookPrice(33000);
        System.out.println("변동된 도서의 가격은 " + book1.price);
    }
}
