package com.ignacio.design.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/12/2 at 21:41
 */
@Data
@AllArgsConstructor
public class Dog implements MyComparable<Dog> {

    private int weight;

    private int height;

    /**
     * 对比
     *
     * @param
     * @return
     */
    @Override
    public Integer compareTo(Dog anotherDog) {
        if (this.weight > anotherDog.weight) {
            return 1;
        }
        return this.weight < anotherDog.weight ? -1: 0;
    }
}
