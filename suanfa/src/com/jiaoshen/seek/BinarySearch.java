package com.jiaoshen.seek;

import sun.security.util.Length;

/**二分查找
 * @author jiaoshen
 * @date 2019/4/14-0:08
 */
public class BinarySearch {
    /**
     * 默认a是有序的
     * @param a
     * @param key
     * @return
     */
    public  static int rank(int[] a,int key){
          int low =0;
          int high =a.length-1;
          if(key >a[high]&& key<a[low]){
              return -1;
          }
          while(low <= high){
              int mid = (low+high)/2;
              if(key > a[mid]){
                  low =mid+1;
              }else if(key <a[mid]){
                  high = mid -1;
              }
              else{
                  return mid;
              }
          }
          return -1;
    }
     public static void main(String[] args) {
             int[] a={2,4,6,8,9,10,11,12,13,14};
             int key= 14;
             System.out.println(rank(a,key));

        }
}
