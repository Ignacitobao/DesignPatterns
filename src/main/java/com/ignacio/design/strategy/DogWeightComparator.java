package com.ignacio.design.strategy;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/12/2 at 22:09
 */
public class DogWeightComparator implements MyComparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        }
        return o1.getWeight() < o2.getWeight() ? -1: 0;
    }
}
