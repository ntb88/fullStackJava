package BookCRUDApplication;



import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int choice;

        Book books[]= null;
        BookDAO dao = new BookDAO();

        do{
            System.out.println("1-Create Book");
            System.out.println("2-Read Book");
            System.out.println("3-Update Book");
            System.out.println("4-Delete Book");
            System.out.println("5-Exit");

            System.out.println("Please select a choice from the menu: ");
            choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("How many books do you wish to create? ");
                int size = sc.nextInt();
                books = new Book[size];
                dao.create(books);
                break;

            case 2:
                dao.read(books);
                break;

            case 3:
                System.out.println("Enter an Id to update the name of the book");
                int id = sc.nextInt();
                dao.update(books, id);
                break;

            case 4:
                System.out.println("Enter the id of a the book you wish to delete: ");
                id = sc.nextInt();
                dao.delete(books, id);

        }

        } while(choice!=5);

    }
}
