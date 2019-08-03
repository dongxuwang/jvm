package com.dongxuwang.jvm.c5;

import java.util.UUID;

public class MyTest3 {

  public static void main(String[] args) {
    System.out.println(MyParent3.str);
  }
}

class MyParent3 {

  public static final String str = UUID.randomUUID().toString();//运行期才能确定

  static {
    System.out.println("MyParent3 static block");
  }
}