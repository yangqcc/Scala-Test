package com.yqc.patternMatch;

/**
 * Created by yangqc on 2017/4/27.
 */
public class SwatchDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            switch (i) {
                case 10:
                    System.out.println("10");
                    break;
                //实际编码中,很容易忽略break语句,
                //这容易导致意外进入另外一个分支
                case 50:
                    System.out.println("50");
                    System.out.println("80");
                default:
                    break;
            }
        }
    }
}
