package com.hari.test.testJava;

import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 * @Description
 * @Date 2021-07-26
 * @Time 9:27
 */
public class IntegerMaxAndMin {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(Integer.MIN_VALUE + 1);

        Map map = new HashMap();
        List<String> list = Arrays.asList(new String[]{"aa","bb"});
        map.put("1", list.toString());
        map.put("2", list);

        System.out.println("\"dd\"");

        StringBuilder dd = new StringBuilder();
        dd.append("[");
        list.forEach(s ->{
            dd.append("\""+ s + "\",");
        });
        dd.deleteCharAt(dd.length() - 1).append("]");
        map.put("3", dd.toString());

        System.out.println(new JSONObject(map).toJSONString());
    }
}
