package com.djh.adapter.inherit.interfaces;

/**
 * 假设Print接口中声明了两种方法，即弱化字符串显示（加括号）的printWeak （ weak有弱化 的意思）方法，
 * 和强调字符串显示（加*号）的printStrong （ strong有强化的意思）方法。
 * 我们 假设这个接口是类似于前文中的“直流12伏特电压”的“需求”。
 * @author MyMrDiao
 * @date 2021/07/19
 */
public interface Print {
    /**
     * 弱化字符串显示（加括号）的printWeak （ weak有弱化 的意思）方法
     */
    public abstract void printWeak();

    /**
     * 强调字符串显示（加*号）的printStrong （ strong有强化的意思）方法
     */
    public abstract void printStrong();
}
