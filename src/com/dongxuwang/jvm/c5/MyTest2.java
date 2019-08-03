package com.dongxuwang.jvm.c5;

/*
常量池
 常量在编译阶段会存入到调用这个常量方法所在类的常量池中，
 本质上，不会触发定义常量类的初始化
 注意：这里指的是将常量存放到了MyTest2的常量池中，之后与MyParent2就没任何关系了，甚至可以将其class文件删除

 反编译 javap -c com.dongxuwang.jvm.c5.MyTest2

 助记符：rt.jar com.sun.org.apache.bcel.
 ldc表示将int、float或是String类型的常量池从常量池中推至栈顶
 bipush表示将单字节（-128,127）的常量
 sipush短整型（-32768）
 iconst_m1,iconst_0 ~ iconst_5 7个


 */

public class MyTest2 {

  public static void main(String[] args) {
    System.out.println(MyParent2.s);
  }
}

class MyParent2 {

//  public static String str = "hello world";
  public static final String str = "hello world"; //加上final之后，在编译阶段，常量被调用的类的常量池

  public static final short s = 7;

  static {
    System.out.println("MyParent2 static block");
  }
}