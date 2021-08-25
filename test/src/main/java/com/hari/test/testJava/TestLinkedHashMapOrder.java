package com.hari.test.testJava;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author admin
 *
 * @Description 利用 LinkedHashMap 的原因就在于 LinkedHashMap 是有序的，默认情况下是按照元素的添加顺序存储的
 * ，也可以调整为根据访问顺序来调整内部顺序（设置参数 accessOrder 进行调整），即最近读取的数据放在最前面，
 * 我们就是利用 LinkedHashMap 的这个特性来实现 LRU
 *
 * @Date 2021-08-20
 * @Time 10:08
 */
public class TestLinkedHashMapOrder {
    public static void main(String[] args){
        Map<String,String> map = new LinkedHashMap(10,0.75f,true);

        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");

        System.out.println("原始顺序为：");
        for(Iterator<Map.Entry<String,String>> it = map.entrySet().iterator(); it.hasNext();){
            System.out.print(it.next().getKey() + "    ");
        }
        System.out.println();

        map.get("2");
        map.get("1");

        System.out.println("访问 4 之后的顺序为：");
        for(Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();it.hasNext();){
            System.out.print(it.next().getKey() + "    ");
        }
    }
}
