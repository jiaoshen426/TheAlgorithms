package com.jiaoshen.sort;


public class Demo {
	public static void main(String[] args) {
		int[] a={9,8,9,4,5,6,7};
		quickSort(a);
		//change(a, 0, 6);
		show(a);
		
	}
	/**
	 * 打印数组
	 * @param a
	 * @return void
	 */
	public static void show(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void change(int[] a, int i,int j){
		int temp= a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	/**
	 * 快速排序
	 * @param a
	 * @return void
	 */
	public static void quickSort(int[] a){
		
		quickSortItem(a,0,a.length-1);
		System.err.println("快速排序后。。。");
		
		
	}
	public static void quickSortItem(int[] a,int left, int right){
		if(left >= right ){
			return;
		}
		int  target = a[left];
		int  initLeftIndex = left;
		int  initRightIndex = right;
		while(left < right){
			while (a[right] >= target && left < right) {
				right --;
			}
			while (a[left] <= target && left < right) {
				left ++;
			}
			if(left != right ){
				change(a, left, right);
			}
		}
		if(right != initLeftIndex){
			change(a, initLeftIndex, right); //把汇合点和标准店互换
		}
		quickSortItem(a,initLeftIndex,left);
		quickSortItem(a,left+1,initRightIndex);
	}
	
	/**
	 * 冒泡排序 : 比较耗时间
	 * @param 数列
	 * @return void
	 */
	public static void bubbleSort(int[] a) {
		int length=a.length;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	
	
	

}
