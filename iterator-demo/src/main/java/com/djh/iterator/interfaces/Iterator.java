package com.djh.iterator.interfaces;

/**
 * Iterator接口用于遍历集合中的元素， 其作用相当于循环语句中的循环变量。那么，在Iterator接口中需要有哪些方法呢？
 * Iterator 接口的定义方式有很多种，这里我们编写了最简单的Iterator接口。
 * 这里我们声明了两个方法，即判断是否存在下一个元素的hasNext方法，和获取下一个元素 的next方法。
 *
 * @author MyMrDiao
 * @date 2021/07/11
 */
public interface Iterator {
    /**
     * hasNext方法的返回值是boolean类型的，其原因很容易理解。当集合中存在下一个元素 时，该方法返回true ;
     * 当集合中不存在下一个元素，即已经遍历至集合末尾时，该方法返回false hasNext方法主要用于循环终止条件。
     *
     * @return boolean
     */
    public abstract boolean hasNext();

    /**
     * 这里有必要说明一下next方法。该方法的返回类型是Object,这表明该方法返回的是集合 中的一个元素。但是，next方法的作用并非仅仅如此。
     * 为了能够在下次调用next方法时正确地返 回下一个元素，该方法中还隐含着将迭代器移动至下一个元素的处理。说“隐含”，是因为 Iterator接口只知道方法名。
     * 想要知道next方法中到底进行了什么样的处理，还需要看一下实 现了 Iterator接口的类(Bookshelf Iterator )这样，我们才能看懂next方法的作用。
     *
     * @return {@link Object}
     */
    public abstract Object next();
}
