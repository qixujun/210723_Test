package com.hari.test.abstractTest.practice1;

abstract class HowManyTimes {
    // 模板
    public void calculationTimes() {
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        // 调用抽象方法
        fun();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        System.out.println(time2);
    }
    // 定义一个抽象方法
    abstract public void fun();
}

// 定义一个H1类来继承抽象方法HowManyTimes
class H1 extends HowManyTimes{
    // 重写要计算时间的程序的抽象方法
    @Override
    public void fun() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}