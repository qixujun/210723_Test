package com.hari.test.abstractTest.practice2;

public class PhpTeacher extends Teacher {
    public PhpTeacher(){
        this.name="嘿嘿嘿";
    }
    public PhpTeacher(String name) {
        this.name = name;
    }
    /**
     *实现讲课的第二种形态
     */
    @Override
    public void TeachClass(){
        System.out.println("php老师"+this.name+"正在教课");
    }
}
