package com;

public class Method01 {
    public static void main(String[] args) {
        //方法使用
        //1.方法写好后，不调用，不会执行
        //2.先创建对象，然后调用方法即可
        Person p1 = new Person();
        p1.cal(5);
    }
}
class Person {
    String name;
    int age;
    //FANG方法（成员方法）
    //1.public 表示方法是公开的
    //2.void 表示方法没有返回值
    //3.speak 表示方法名字
    //4.() 表示方法没有输入的参数
    //5.{} 方法体，可以写执行的代码
    public void cal(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += i;
        }
        System.out.println("cal方法 计算结果：" + res);
    }
}
