package com.ignacio.design.singleton.case1;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/11/30 at 20:55
 */
public class Singleton1 {
    private Singleton1 () {
    }

    private static final Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    //这是一个Main方法，是程序的入口
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        boolean b = instance1 == instance2;
        System.out.println(b);
    }
}
