package com.hari.test.testJava;

/**
 * @author admin
 * @Description
 * @Date 2021-07-20
 * @Time 14:07
 */
public class TestIntToInterger {
    public static void main(String[] args) {
        //在-128~127 之外的数
        Integer num1 = 297;   Integer num2 = 297;
        System.out.println("num1==num2: "+(num1 == num2));
        // 在-128~127 之内的数
        Integer num3 = 97;   Integer num4 = 97;
        System.out.println("num3==num4: "+(num3 == num4));

        // 在-128~127 之外的数
        int num5 = 397;   int num6 = 397;
        System.out.println("num3==num4: "+(num5 == num6));

        // 在-128~127 之外的数
        //因为包装类Integer和基本数据类型int比较时，java会自动拆包装为int，然后进行比较，实际上就变为两个int变量的比较
        int num7 = 397;   Integer num8 = 397;
        System.out.println("num3==num4: "+(num7 == num8));

        //因为非new生成的Integer变量指向的是java常量池中的对象，而new Integer()生成的变量指向堆中新建的对象，两者在内存中的地址不同
        Integer i = new Integer(100);
        Integer j = 100;
        System.out.println("i==j: " + (i == j)); //false

        // 在-128~127 之外的数
        Integer num9 = 397;   Integer num10 = 397;
        System.out.println("num3==num4: "+(num9.equals(num10)));
    }
}
