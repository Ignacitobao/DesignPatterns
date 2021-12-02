package com.ignacio.design.strategy;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/12/2 at 22:14
 */
public class DogHeightComparator implements MyComparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return -1;
        }
        return o1.getHeight() < o2.getHeight() ? 1 : 0;
    }
}
