package com.djh.iterator.test;

import com.djh.iterator.entity.Book;
import com.djh.iterator.entity.BookShelf;
import com.djh.iterator.interfaces.Iterator;

/**
 * 测试主要
 *
 * @author MrMyHui
 * @date 2021/07/13
 */
public class TestMain {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(4);
        bookshelf.appendBook(new Book("Around the World in 80 Days"));
        bookshelf.appendBook(new Book("Bible"));
        bookshelf.appendBook(new Book("Cinderella"));
        bookshelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookshelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
