package com.jiaoshen.util;

public class CommonUtil {

	/**
	 * 打印数组
	 * @param a
	 * @return void
	 */
	public static void show(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	 public static void main(String[] args) {
	         int[] a =new int[10];
	         System.out.println(a[2]);
 	    }

}
