package BookProbelm;

public class Main {
    public static void main(String[] args) {
        EngineeringBook book1 = new EngineeringBook();

        book1.setBookNo(1);
        book1.setCategory("Engg");
        book1.setAuthor("Will");
        book1.setTitle("jkfalkbgs");
        book1.setPrice(22);

        System.out.println(book1.getCategory()+ " " +
        book1.getBookNo()+ " " +
        book1.getAuthor()+ " " +
        book1.getPrice()+ " " +
        book1.getTitle());

    }
}
