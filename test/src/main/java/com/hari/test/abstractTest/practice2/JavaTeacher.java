package com.hari.test.abstractTest.practice2;

public class JavaTeacher extends Teacher{
    private Integer age;

    public JavaTeacher(){
        this.name="哈哈哈";
    }
    public JavaTeacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    /**
     *实现讲课的第一种形态
     */
    @Override
    public void TeachClass() {
        System.out.println("java老师"+this.name+"正在教课");
    }

    public void hello(String name){
        System.out.println(name + "在对你说\"Hello\"");
    }
}
