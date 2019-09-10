package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookShop  implements Cloneable{
    String bookShopName;
    List<Book> books =new ArrayList<>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }



    public void getBookDataFromDB(){
         //for eg data is loading from database
        for (int i=1;i<=5;i++) {
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("Book " + i);
            books.add(book);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

       // return super.clone(); //Normal approach to clone
        BookShop bookShop =new BookShop();
        for(Book book:this.books){
            bookShop.books.add(book);
        }
        return bookShop;

    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }





}
