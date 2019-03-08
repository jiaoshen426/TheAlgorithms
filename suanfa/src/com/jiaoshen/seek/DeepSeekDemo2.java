package com.jiaoshen.seek;

import java.util.Stack;

import com.jiaoshen.seek.bean.Point;


/**
 * 深度遍历 （走迷宫）
 * 迷宫      0010        (8是终点，1是路障)    
 *      0000
 *      0010
 *      0180
 *      0001 
 * @author jiaoshen
 *
 */
public class DeepSeekDemo2 {
	static final int[][]  map ={{0,0,1,0},
			              {0,0,0,0},
			              {0,0,1,0},
			              {0,1,0,0},
			              {0,0,0,1}};
	/** 标记是否已走 */
	static int[][] book = new int[5][4];
	/** 标记路径 */
	static int[][] path = new int[5][4];
	/** 终点 */
	static final Point finalPoint = new Point(3,2);
	/** 四个方向 */
	static final int[][] nextDirection = {{0,1},{1,0},{0,-1},{-1,0}};
	
	
	static Stack<Point> stackPoints = new Stack<>();
	/** 廣度遍歷 */
	static Stack<Point> stackPoints2 = new Stack<>();
	
	//深度遍历
	static void fn1(){
		dfs(new Point(0, 0));
	}
	static void dfs(Point point){
		if(point.getX()>=map.length || point.getX()<0 || point.getY()>=map[0].length || point.getY()<0){
			return;
		}
		if(point .equals(finalPoint)){
			stackPoints.push(point);
			System.out.println(stackPoints);
			stackPoints.pop();
			return;
		}
		if(map[point.getX()][point.getY()] == 1){
			return;
		}
		for(int i = 0;i<nextDirection.length;i++){
			if(point.getArrayData(book) == 0){
				book[point.getX()][point.getY()] = 1;
				stackPoints.push(point);
				dfs(new Point(point.getX() + nextDirection[i][0],point.getY() + nextDirection[i][1]));
				stackPoints.pop();
				book[point.getX()][point.getY()] = 0;
			}
			
		}
	}

	// 广度遍历
	static void fn2() {
		int head = 1;
		int step = 0;
		//stackPoints2.push();
		
		
	}

	static void dfs2(Point point,int step) {
		if (point.getX() >= map.length || point.getX() < 0 || point.getY() >= map[0].length || point.getY() < 0) {
			return;
		}
		if (point.equals(finalPoint)) {
			stackPoints2.push(point);
			System.out.println(stackPoints2);
			stackPoints.pop();
			return;
		}
		if (map[point.getX()][point.getY()] == 1) {
			return;
		}
		for (int i = 0; i < nextDirection.length; i++) {
			if (point.getArrayData(book) == 0) {
				book[point.getX()][point.getY()] = 1;
				stackPoints.push(point);
				dfs(new Point(point.getX() + nextDirection[i][0], point.getY() + nextDirection[i][1]));
				stackPoints.pop();
				book[point.getX()][point.getY()] = 0;
			}

		}
	}
	
	public static void main(String[] args) {
		fn1();
	}
	
     
}
