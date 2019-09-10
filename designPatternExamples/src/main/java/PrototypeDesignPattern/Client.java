package PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop1 =new BookShop();
        bookShop1.setBookShopName("National");
        bookShop1.getBookDataFromDB();

       /* //Normal Approach
        BookShop bookShop2 =new BookShop();
        bookShop2.setBookShopName("College");
        bookShop2.getBookDataFromDB();
        System.out.println(bookShop2);*/

        BookShop bookShop2 = bookShop1.clone();
        bookShop1.books.remove(2);
        System.out.println(bookShop1);
        bookShop2.setBookShopName("College");
        System.out.println(bookShop2);

    }
}
