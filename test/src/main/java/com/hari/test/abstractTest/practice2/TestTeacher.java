package com.hari.test.abstractTest.practice2;

/**
 * 父类Teacher，子类JavaTeacher，子类PhpTeacher
 */
public class TestTeacher {
    public static void main(String[] args) {
        // 子类实例赋给父类引用
        Teacher jt= new JavaTeacher("aa",21); //生成父类Teacher对象，为Teacher类，不能调用JavaTeacher的hello方法
        Teacher pt= new PhpTeacher("yoyoyoyo...");
        Lender lender = new Lender();
        lender.CheckTeach(jt);
        lender.CheckTeach(pt);

        JavaTeacher hello = new JavaTeacher();  //生成子类JavaTeacher对象，为JavaTeacher类，能调用JavaTeacher的hello方法
        hello.hello("sa");
    }
}

/**
 * 抽象类总结规定
 * 1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
 *
 * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 *
 * 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
 *
 * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
 *
 * 5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
 */
