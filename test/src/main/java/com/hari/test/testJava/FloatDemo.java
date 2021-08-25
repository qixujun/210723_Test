package com.hari.test.testJava;

/**
 * @author admin
 * @Description     Java.lang.Float.isNaN()方法 ：
 *                  此方法如果此对象所表示的值是NaN，返回true，否则返回false。
 * @Date 2021-08-25
 * @Time 10:55
 */
public class FloatDemo {
    public static void main(String[] args) {
        Float f1 = new Float(-1.0/0.0);
        Float f2 = new Float(0.0/0.0);

        // @return  {@code true} if the value represented by this object is NaN; {@code false} otherwise.
        System.out.println(f1 + " = " + f1.isNaN());
        System.out.println(f2 + " = " + f2.isNaN());

        System.out.println(f1 + " = " + f1.isInfinite());
        System.out.println(f2 + " = " + f2.isInfinite());
    }
}
