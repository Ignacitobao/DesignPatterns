package com.ignacio.design.strategy;

import lombok.Data;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/12/2 at 21:24
 */
@Data
public class Cat implements MyComparable<Cat> {

    private Integer height;


    /**
     * 对比
     *
     * @param
     * @return
     */
    @Override
    public Integer compareTo(Cat anotherCat) {
        if (this.height > anotherCat.height) {
            return 1;
        } else if (this.height < anotherCat.height) {
            return -1;
        } else {
            return 0;
        }
    }
}
