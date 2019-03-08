package com.jiaoshen.seek;
/**
 * 深序遍历
 * @author jiaoshen
 *
 */
public class DeepSeekDemo {
	public static void main(String[] args) {
		//fn(3);
		fn2();
	}
	/** 标记装数的盒子 */
	private static int len = 0;
	/** 标记装数的盒子 */
	private static int[] box ;
	/** 标记已走过的点*/
	private static int[] book;
	
	/**
	 * 输出一个数的全排列
	 * @param a
	 * @return void
	 */
	static  void fn(int a ){
		if(a<1){
			return;
		}
		len = a;
		box = new int[a]; 
		book = new int[a]; 
		def(1);
		
	}
	static void def(int step){
		if(step == len+1){
			show(box);
			return ;
		}
		for(int i=0; i<len;i++){
			if(book[i] == 0){
				book[i]=1;
				box[step - 1] = i+1;
				def(step+1);
				book[i] = 0;
			}
		}
		
	}
	
	/**
	 * 输出符合 xxx + xxx =xxx 的算式（1 - 9）
	 * @param a
	 * @return void
	 */
	static  void fn2( ){
		len = 9;
		box = new int[len]; 
		book = new int[len]; 
		def2(1);
		
	}
	static void def2(int step){
		if(step == len+1){
			if((box[0]*100+box[1]*10+box[2])+(box[3]*100+box[4]*10+box[5]) == (box[6]*100+box[7]*10+box[8])){
				show(box);
				return ;
			}
		}
		for(int i=0; i<len;i++){
			if(book[i] == 0){
				book[i]=1;
				box[step - 1] = i+1;
				def2(step+1);
				book[i] = 0;
			}
		}
		
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
		System.out.println();
		
	}

}
