package com.jiaoshen.sorts;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiaoshen
 * @date 2019/4/7-15:02
 */
public interface SortAlgorithms {
    /**
     * 数组排序方法
     *
     * @param unsorted
     * @param <T>
     * @return
     */
    <T extends Comparable<T>> T[] sort(T[] unsorted);


    default <T extends Comparable<T>> List<T> sort(List<T> unsorted) {
        return Arrays.asList(unsorted.toArray((T[]) new Comparable[unsorted.size()]));
    }


}

