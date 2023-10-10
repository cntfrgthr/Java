import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    Lib lib = new Lib();
    Book book0 = new Book("1", "Ernest", "2002", 100);
    Book book1 = new Book("2", "Hemingway", "2020", 200);
    Book book2 = new Book("3", "Ahmad", "1993", 500);
    Book book3 = new Book("4", "Donish", "492", 50);
    lib.addBook(book0);
    lib.addBook(book1);
    lib.addBook(book2);
    lib.addBook(book3);
    lib.printAllBooks();
    lib.printBooksWFilter("Ernest", "2002");
    }
}

final class Lib{
    private ArrayList<Book> lib = new ArrayList<Book>();

    void addBook(Book book){
        lib.add(book);
    }
    void printBook(Book book){
        System.out.printf("Bookname = %s | Author = %s | Year of production = %s | Price = %d \n", book.getName(), book.getAuthor(), book.getYearOfProd(), book.getPrice());
    }
    void printAllBooks(){
        for (Book book : this.lib){
            printBook(book);
        }
    }
    void printBooksWFilter(String author, String yearOfProd){
        for (Book book : this.lib){
            if (book.getAuthor() == author && book.getYearOfProd() == yearOfProd){
                printBook(book);
            }
        }
    }
}

class Book{
    private String name, author, yearOfProd;
    private int price;
    Book(String name, String author, String yearOfProd, int price){
        setName(name);
        setAuthor(author);
        setYearOfProd(yearOfProd);
        setPrice(price);
    }
    private Book(){
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAuthor(String author){
        this.author = author;
    }
    String getAuthor(){
        return this.author;
    }
    void setYearOfProd(String yearOfProd){
        this.yearOfProd = yearOfProd;
    }
    String getYearOfProd(){
        return this.yearOfProd;
    }
    void setPrice(int price){
        this.price = price;
    }
    int getPrice(){
        return this.price;
    }
}