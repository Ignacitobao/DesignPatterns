package com.ignacio.design.strategy;

import java.util.Arrays;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/11/30 at 22:14
 */

public class Main {

    //这是一个Main方法，是程序的入口
    public static void main(String[] args) {

        Dog[] dogs = new Dog[]{new Dog(1,3), new Dog(3,2), new Dog(2,5)};
        MySorter<Dog> sorter = new MySorter<>();

        sorter.sort(dogs, new DogWeightComparator());

        sorter.sort(dogs, new DogHeightComparator());
        System.out.println(Arrays.toString(dogs));
    }
}
