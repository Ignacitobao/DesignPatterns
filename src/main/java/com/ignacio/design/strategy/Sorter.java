package com.ignacio.design.strategy;

import java.util.Arrays;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/11/30 at 22:13
 */
@SuppressWarnings("all")
public class Sorter {

    public void sort(com.ignacio.design.strategy.MyComparable[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1 ; j < arr.length ; j++) {
                minPos = arr[j].compareTo(arr[minPos]) < 0 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(MyComparable[] arr, int i, int j) {
        MyComparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
