package com.hari.test.testJava;

import com.alibaba.fastjson.JSON;

/**
 * @author admin
 * @Description
 * @Date 2021-08-04
 * @Time 17:08
 */
public class testObj {
    public static void main(String[] args) {
        Test test = new Test("ss",12);

        System.out.println(test.toString());
        System.out.println(JSON.toJSON(test));
    }

    static class Test{
        public String aa;
        public Integer bb;

        Test(String aa, Integer bb){
            this.aa = aa;
            this.bb = bb;
        }

        public String getAa() {
            return aa;
        }

        public void setAa(String aa) {
            this.aa = aa;
        }

        public Integer getBb() {
            return bb;
        }

        public void setBb(Integer bb) {
            this.bb = bb;
        }

        @Override
        public String toString(){
            return "{\"aa\":" + aa + ",\"bb\":" +bb + "}";
        }
    }
}
