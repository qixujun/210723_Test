package com.hari.test.testJava;

import java.time.LocalDate;

/**
 * @author admin
 * @Description
 * @Date 2021-07-19
 * @Time 17:24
 */
public class TestStringFormat {
    public static void main(String[] args) {
        LocalDate curdate = LocalDate.now();
        System.out.println(String.format("%s", curdate));
    }
}
