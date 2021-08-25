package com.hari.test.testJava;

/**
 * @author admin
 * @Description System.currentTimeMillis()的性能
 * @Date 2021-08-25
 * @Time 10:48
 */
public class MeasuringSpeed {
    static void test_milli_speed ()
    {
        long sum = 0;
        int N = 100000000;
        long t1 = System.currentTimeMillis ();
        for (int i = 0; i < N; i++){
            sum += System.currentTimeMillis ();
        }
        long t2 = System.currentTimeMillis ();
        System.out.println ("Sum = " + sum + "; time = " + (t2 - t1) +
                "; or " + (t2 - t1) * 1.0E6 / N + " ns / iter");
    }

    public static void main(String[] args) {
        test_milli_speed();
        test_milli_speed();
        test_milli_speed();
    }
}
