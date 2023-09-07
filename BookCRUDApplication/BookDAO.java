package BookCRUDApplication;

import java.util.Scanner;

public class BookDAO {

    Scanner sc = new Scanner(System.in);
    //create
    public void create(Book books[]){
        for(int i =0; i<books.length; i++){
                //enter an id
                System.out.println("Please enter a unique ID");
                int bookID = sc.nextInt();

                //enter a book name
                System.out.println("Please enter a name");
                 //character check
                String bookName = sc.next();
                while(bookName.length() < 4){
                    System.out.println("Please enter a name that is greater than 4 characters");
                    bookName = sc.next();
                }

                //enter a price
                System.out.println("Please enter a price for the book. The price must be between 1 and 5000");
                float price =  sc.nextFloat();
                while ( price < 1 || price >5000){
                    System.out.println("Try again. The value must be between 1 and 5000");
                    price = sc.nextFloat();
                }
                Book b = new Book(bookID, bookName, price);

                books[i] = b;
        }

    }

    // read books
    public void read(Book books[]){
        if(books.length == 0 ){
            System.out.println("no elements in this array!");
        }else {
            for(int i =0; i<books.length; i++){
                System.out.println("Book details: " + books[i].getBookNo()+","+ books[i].getTitle()+"," +books[i].getPrice());
            }
        }
    }

    //Update
    public void update(Book books[], int id){
        for(int i=0; i<books.length; i++ ){
            if(books[i].getBookNo() == id){
                System.out.println("The current name of the selected book you would like to change:  "+ books[i].getTitle());
                System.out.println("Please enter a new title: ");
                //character count check
                String bookName = "";
                if(sc.next().length() < 4){
                    System.out.println("Please enter a name that is greater than 4 characters");
                } else {
                    books[i].setTitle(bookName);
                }
            }
        }
    }

    //Delete
    public void delete(Book books[], int id){
        for(int i= 0; i< books.length; i++ ){
            if(books[i].getBookNo() == id){
                books[i] = null;
                System.out.println("The book is deleted from the record ");
            }
        }
    }

}
