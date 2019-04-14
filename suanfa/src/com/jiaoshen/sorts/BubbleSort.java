package com.jiaoshen.sorts;

import static com.jiaoshen.sorts.SortsUtils.*;

/**
 * 冒泡排序
 *
 * @author jiaoshen
 * @date 2019/4/7-15:47
 */
public class BubbleSort implements SortAlgorithms {


    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 0; j < unsorted.length-i-1; j++) {
                if (large(unsorted[j], unsorted[j + 1])) {
                    swap(unsorted, j, j + 1);
                }
            }
        }
        return unsorted;
    }

    public static void main(String[] args) {

    }

}
