package com.djh.iterator.entity;

/**
 * Book类是表示书的类
 * 但是这个类的作用有限，它可以做的事情只有一 件一通过getName方法获取书的名字。书的名字是在外部调用Book类的构造函数并初始化 Book类时，作为参数传递给Book类的。
 *
 * @author MyMrDiao
 * @date 2021/07/11
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
