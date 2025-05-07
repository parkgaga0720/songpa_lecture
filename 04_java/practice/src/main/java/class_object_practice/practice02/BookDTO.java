package class_object_practice.practice02;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {}
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public void setAuthor(String author) {this.author = author;}
    public void setPrice(int price) {this.price = price;}
    public void setDiscountRate(double discountRate) {this.discountRate = discountRate;}

    public String getTitle() {return this.title;}
    public String getPublisher() {return this.publisher;}
    public String getAuthor() {return this.author;}
    public int getPrice() {return this.price;}
    public double getDiscountRate() {return this.discountRate;}

    public String printInformation() {
        return this.title + ", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discountRate;
    }

}
