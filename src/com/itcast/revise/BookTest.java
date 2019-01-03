package com.itcast.revise;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Java实战");
        book1.setPrice(88.5);
        book1.showMe();
        Book book2 = new Book();
        book2.setName("JavaEE高级");
        book2.setPrice(66.70);
        book2.showMe();
    }
}
