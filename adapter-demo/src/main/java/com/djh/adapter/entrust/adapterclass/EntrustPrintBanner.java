package com.djh.adapter.entrust.adapterclass;

import com.djh.adapter.entrust.interfaces.EntrustPrint;
import com.djh.adapter.inherit.Banner;

/**
 * 扮演适配器角色的是PrintBanner类。该类继承了 Banner类并实现了 “需求” Print 接口。
 * PrintBanner 类使用 showWithParen 方法实现了 printWeak,使用 showWithAster 方法实现了 printStrong。
 * 这样，PrintBanner类就具有适配器的功能了。
 *
 * 电源的比喻和示例程序的对应关系
 * 	         电源的比喻	          示例程序
 * 实际情况	交流100伏特	  Banner 类(showWithParen showWithAster )
 * 变换装置	适配器	      PrintBanner 类
 * 需求	    直流12伏特	  Print 接口 ( printWeak printStrong )
 *
 * @author MyMrDiao
 * @date 2021/07/19
 */
public class EntrustPrintBanner extends EntrustPrint {
    private Banner banner;
    public EntrustPrintBanner(String string) {
        this.banner = new Banner(string);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
