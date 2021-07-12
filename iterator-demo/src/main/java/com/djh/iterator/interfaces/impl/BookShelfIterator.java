package com.djh.iterator.interfaces.impl;

import com.djh.iterator.entity.Book;
import com.djh.iterator.entity.BookShelf;
import com.djh.iterator.interfaces.Iterator;

/**
 * 书架迭代器
 * 因为BookshelfIterator类需要发挥Iterator的作用，所以它实现了Iterator接口。 bookshelf字段表示BookshelfIterator所要遍历的书架。
 * index字段表示迭代器当前所指向的书的下标。
 *
 * @author MyMrDiao
 * @date 2021/07/13
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookshelf;
    private int index;

    /**
     * 构造函数会将接收到的Bookshelf的实例保存在bookshelf字段中，并将index初始化为0。
     *
     * @param bookshelf 书架上
     */
    public BookShelfIterator(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    /**
     * hasNext方法是Iterator接口中所声明的方法。该方法将会判断书架中还有没有下一本书， 如果有就返回true,如果没有就返回false。
     * 而要知道书架中有没有下一本书，可以通过比较index和书架中书的总册数（bookshelf.getLength()的返回值）来判断。
     *
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return index < bookshelf.getLength();
    }

    /**
     * next方法会返回迭代器当前所指向的书（Book的实例），并让迭代器指向下一本书。它也是 Iterator接口中所声明的方法。
     * next方法稍微有些复杂，它首先取出book变量作为返回值, 然后让index指向后面一本书。
     * 如果与for语句来对比，这里的“让index指向后面一本书”的处理相当于其中 的i++,它让循环变量指向下一个元素。
     *
     * @return {@link Object}
     */
    @Override
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }
}
