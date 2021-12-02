package com.ignacio.design.singleton.case1;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/11/30 at 21:43
 */
@SuppressWarnings("all")
public class Singleton2 {

    private static Singleton2 INSTANCE;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

    //这是一个Main方法，是程序的入口
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton2.getInstance().hashCode());
            }).start();
        }
    }
}
