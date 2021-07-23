package com.hari.test.testJava;

import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 * @Description
 * @Date 2021-07-16
 * @Time 15:14
 */
public class TestObjToStr {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] dd = new String[]{"1","bv","ds"};
        List<String> cc = Arrays.asList(new String[]{"1","bv","ds"});

        Test test = new Test();
        test.setObj(cc);

        List<String> rs = (List<String>) test.getObj();
        System.out.println(rs);

        Test test1 = (Test) test.clone();
        System.out.println(test1);
        System.out.println(test1.toString());
    }

    static class Test implements Cloneable{
        private Object obj;

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
//            return super.toString();
            return String.valueOf(getObj());
        }
    }
}
