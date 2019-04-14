package com.jiaoshen.sorts;

import static com.jiaoshen.sorts.SortsUtils.*;

/**
 * 快速排序
 * 通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *
 * @author jiaoshen
 * @date 2019/4/7-18:19
 */
public class QuickSort implements SortAlgorithms {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        doQuickSort(unsorted,0,unsorted.length-1);
        return  unsorted;
    }

    <T extends Comparable<T>> void  doQuickSort(T[] unsorted,int left,int right){
        if(left>=right){
            return;
        }
        T target = unsorted[left];
        int initLeft = left;
        int initRight = right;
        while (left < right ){
            while (left < right &&  !large(target,unsorted[right])){
                right--;
            }
            while (left < right &&  !less(target,unsorted[left])){
                left++;
            }
            if(left != right ){
                swap(unsorted,left,right);
                right--;
            }
        }
        if (left != initLeft){
            swap(unsorted,left,initLeft);
        }
        doQuickSort(unsorted,initLeft,left-1);
        doQuickSort(unsorted,left+1,initRight);
    }


}
