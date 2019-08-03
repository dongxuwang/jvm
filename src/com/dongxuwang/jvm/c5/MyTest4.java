package com.dongxuwang.jvm.c5;

/*
 对数组来说，其类型是由JVM在运行期动态生成的，表示为[Lcom.xxx
 动态生成类型，其父类型就是Object

 对数组来说，JavaDoc经常将构成数组的元素为Component，实际上就是数组降低一个维度后的类型


 助记符：
 anewarray 创建一个引用类型的数组，并将其引用值压入栈顶
 newarray  原始类型，。。
 */
public class MyTest4 {

  public static void main(String[] args) {
//    MyParent4 myParent4 = new MyParent4();//首次主动使用，创建类的实例

//    System.out.println("-------");
//    MyParent4 myParent5 = new MyParent4();

    MyParent4[] myParent4s = new MyParent4[1];
    System.out.println(myParent4s.getClass());//jvm 在运行期创建的数组类型，像动态代理

    MyParent4[][] myParent4s1 = new MyParent4[1][1];
    System.out.println(myParent4s1.getClass());

    System.out.println(myParent4s.getClass().getSuperclass());
    System.out.println(myParent4s1.getClass().getSuperclass());

    System.out.println("====");
    int[] ints = new int[1];
    System.out.println(ints.getClass());
    System.out.println(ints.getClass().getSuperclass());
    char[] chars = new char[1];
    System.out.println(chars.getClass());
    //...
  }
}

class MyParent4 {

  static {
    System.out.println("MyParent4 static block");
  }
}