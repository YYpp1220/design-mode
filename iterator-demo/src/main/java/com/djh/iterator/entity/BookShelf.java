package com.djh.iterator.entity;

import com.djh.iterator.interfaces.Aggregate;
import com.djh.iterator.interfaces.Iterator;
import com.djh.iterator.interfaces.impl.BookShelfIterator;

/**
 * Bookshelf类是表示书架的类。由于需要将该类作为集合进行处理，因此它 实现了 Aggregate接口。代码中的implements Aggregate部分即表示这一点。
 * 此外，请注 意在Bookshelf类中还实现了 Aggregate接口的iterator方法。
 *
 * @author MyMrDiao
 * @date 2021/07/13
 */
public class BookShelf implements Aggregate {
    /**
     * 这个书架中定义了 books字段，它是Book类型的数组。该数组的大小(maxsize )在生成 Bookshelf的实例时就被指定了。
     * 之所以将books字段的可见性设置为private,是为了防止 外部不小心改变了该字段的值。
     */
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }

    /**
     * iterator方法。该方法会生成并返回BookshelfIterator类的实例作为 Bookshelf类对应的Iterator当外部想要遍历书架时，就会调用这个方法。
     *
     * @return {@link Iterator}
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
