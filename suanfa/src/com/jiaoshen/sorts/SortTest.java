package com.jiaoshen.sorts;

import static com.jiaoshen.sorts.SortsUtils.print;

/**
 * @author jiaoshen
 * @date 2019/4/7-20:59
 */
public class SortTest {
    public static void main(String[] args) {
        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 13};
        SortAlgorithms mysort = new QuickSort();
        mysort.sort(integers);

        // Output => 231, 78, 54, 23, 13, 9, 6, 4, 1
        print(integers);

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};
        //Output => e, d, c, b, a
        print(mysort.sort(strings));
    }
}
