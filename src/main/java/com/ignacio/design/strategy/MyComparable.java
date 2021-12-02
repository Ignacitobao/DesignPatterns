package com.ignacio.design.strategy;

/**
 * @author Ignacio
 */
public interface MyComparable<T> {

    /**
     * 对比
     * @param t
     * @return
     */
    Integer compareTo(T t);
}
