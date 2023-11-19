public class Main {
    public static void main(String[] args){
        Library library = new Library();

        Book eximple1 = new Book("first place", "lin Bouson", 1768);
        Book eximple2 = new Book("war in india", "gota Problem", 1987);

        //add
        library.addBook(eximple1);
        library.addBook(eximple2);

        library.displayBooks();

        // Removing
        library.removeBook(eximple1);
        //Show books
        System.out.println("Updated list of books in the library: \n");
        library.displayBooks();

        
    }
}

public class Book {

    private String nameOfBook;
    private String author;
    private int year;



    public Book(String nameOfBook, String author, int year){
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.year = year;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

import java.util.HashMap;
import java.util.Vector;

public class Library {
    private Vector<Book> books;

    public Library() {
        books = new Vector<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayBooks() {
        System.out.println("List of books in the library: \n");
        for (Book book : books) {
            System.out.println("Title: " + book.getNameOfBook() +
                    ", Author: " + book.getAuthor() +
                    ", Publication Year: " + book.getYear());
        }
    }
}
