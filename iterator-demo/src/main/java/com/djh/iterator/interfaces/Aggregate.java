package com.djh.iterator.interfaces;

/**
 * 集合的接口
 * 在Aggregate接口中声明的方法只有一个	iterator方法。该方法会生成一个用于遍历集合的迭代器。
 *
 * @author MyMrDiao
 * @date 2021/07/11
 */
public interface Aggregate {
    /**
     * iterator方法。该方法会生成一个用于遍历集合的迭代器。
     * 想要遍历集合中的元素时，可以调用iterator方法来生成一个实现了 Iterator接口的类 的实例
     *
     * @return {@link Iterator}
     */
    public abstract Iterator iterator();
}
