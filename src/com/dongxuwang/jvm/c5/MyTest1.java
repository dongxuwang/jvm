package com.dongxuwang.jvm.c5;

/*
  对于静态字段来说，只有直接定义了该字段的类才会被初始化；
  当一个类在初始化时，要求其父类全部都已初始化完毕

  -XX:+TraceClassLoading 【VM Options】

  -XX:
  -XX:+<option> 开启
  -XX:-<option> 关闭
  -XX:<option>=<value> 设置值


 */

public class MyTest1 {

  public static void main(String[] args) {
    System.out.println(MyChild1.str);
//    System.out.println(MyChild1.str2); MyChild1的首次主动使用
//    System.out.println(MyChild1.str); 看是否被加载 -XX:+TraceClassLoading，没有初始化，但是也完成了加载
//    MyTest1也被加载了
  }
}

class MyParent1 {

  public static String str = "Hello world";

  static {
    System.out.println("MyParent1 static block");
  }
}

class MyChild1 extends MyParent1 {

  public static String str2 = "Hello world";
  static {
    System.out.println("MyChild1 static block");
  }
}

