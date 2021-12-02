package com.ignacio.design.strategy;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/12/2 at 22:04
 */
@SuppressWarnings("all")
public class MySorter<T> {

    public void sort(T[] arr, MyComparator<T> comparator) {

        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1 ; j < arr.length ; j++) {
                minPos = comparator.compare(arr[j],arr[minPos]) < 0 ? j : minPos; ;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
