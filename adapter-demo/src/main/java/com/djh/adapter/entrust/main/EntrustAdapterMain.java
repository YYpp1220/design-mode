package com.djh.adapter.entrust.main;

import com.djh.adapter.entrust.adapterclass.EntrustPrintBanner;
import com.djh.adapter.entrust.interfaces.EntrustPrint;

/**
 * 委托适配器主要
 *
 * @author MyMrDiao
 * @date 2021/08/28
 */
public class EntrustAdapterMain {
    public static void main(String[] args) {
        EntrustPrint banner = new EntrustPrintBanner("Hello, Word");
        banner.printWeak();
        banner.printStrong();
    }
}
