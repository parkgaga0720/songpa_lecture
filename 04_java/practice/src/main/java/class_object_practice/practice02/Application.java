package class_object_practice.practice02;

public class Application {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO();
        System.out.println(book1.printInformation());

        BookDTO book2 = new BookDTO("자바의 정석","도우출판","남궁성");
        System.out.println(book2.printInformation());

        BookDTO book3 = new BookDTO("홍길동정","활빈당","허균", 50000, 0.5);
        System.out.println(book3.printInformation());

    }
}
