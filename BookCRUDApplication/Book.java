package BookCRUDApplication;

public class Book {
    private int bookNo;
    private String title;
    private float price;

    public Book(int bookNo, String title, float price) {
        this.bookNo = bookNo;
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }
}
