package com.hari.test.testJava;

import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 * @Description
 * @create 2021-07-05
 */
public class Test {
    public static void main(String[] args) {

        String ss = String.format("%sqqq%d","xxxxx",123);
        System.out.println(ss);

        Map map = new HashMap();
        map.put("ab","ss");
        map.put("a","s2");

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        
        String var1 = "ssdewfg";
        System.out.println(getvalue(var1));
        System.out.println(var1.charAt(6));
    }

    private static String getvalue(String var1) {
        String var2;
        return (var2 = var1) == null ? (var2 = null): var2;
    }

}
