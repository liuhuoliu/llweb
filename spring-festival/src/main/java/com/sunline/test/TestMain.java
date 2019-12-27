package com.sunline.test;

import java.text.NumberFormat;

public class TestMain {

    public static void main(String[] args) {
        double aa = 14388.4;
        long finalAmt = aa > 1 ? Math.round(aa) : 1;
        System.out.println(NumberFormat.getInstance().format(finalAmt));
    }
}
