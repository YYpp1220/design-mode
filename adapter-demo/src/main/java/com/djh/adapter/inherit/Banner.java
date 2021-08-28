package com.djh.adapter.inherit;

/**
 * 如果想让额定工作电压是直流12伏特的笔记本电脑在交流100伏特①的AC电源下工作，应该 怎么做呢？
 * 通常，我们会使用AC适配器，将家庭用的交流100伏特电压转换成我们所需要的直流 12伏特电压。这就是适配器的工作，它位于实际情况与需求之间，填补两者之间的差异。
 * 适配器的 英文是Adapter,意思是“使……相互适合的东西”。前面说的AC适配器的作用就是让工作于直流 12伏特环境的笔记本电脑适合于交流100伏特的环境
 *
 * 在程序世界中，经常会存在现有的程序无法直接使用，需要做适当的变换之后才能使用的情 况。这种用于填补“现有的程序”和“所需的程序”之间差异的设计模式就是Adapter模式。
 * Adapter模式也被称为Wrapper模式。Wrapper有“包装器”的意思，就像用精美的包装纸将普 通商品包装成礼物那样，替我们把某样东西包起来，使其能够用于其他用途的东西就被称为“包装 器”或是“适配器”。
 * Adapter模式有以下两种。
 * • 类适配器模式（使用继承的适配器）
 * • 对象适配器模式（使用委托的适配器）
 *
 * 使用继承的适配器的示例程序。这里的示例程序是一段会将输入的字符 串显示为（Hello）或是*Hello*的简单程序。
 * @author MyMrDiao
 * @date 2021/07/19
 */
public class Banner {
    /**
     * 目前在Banner类（Banner有广告横幅的意思）中，有将字符串用括号括起来的showWithParen 方法，和将字符串用*号括起来的showWithAster方法。
     * 我们假设这个Banner类是类似前文 中的“交流100伏特电压”的“实际情况”。
     */
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*" );
    }
}
