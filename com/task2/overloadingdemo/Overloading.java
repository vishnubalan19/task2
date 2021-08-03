package com.task2.overloadingdemo;

public class Overloading{
    public static void main(String args[]){
        OverloadingDemo overloadingDemo1 = new OverloadingDemo();
        OverloadingDemo overloadingDemo2 = new OverloadingDemo(3,2,5);
        OverloadingDemo overloadingDemo3 = new OverloadingDemo(2,5);
        System.out.println(overloadingDemo1);
        System.out.println(overloadingDemo2);
        System.out.println(overloadingDemo3);
    }
}