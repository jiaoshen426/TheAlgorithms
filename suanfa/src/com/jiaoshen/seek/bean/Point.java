package com.jiaoshen.seek.bean;


public class Point {
	
	private Integer x;
	private Integer y;
	
	
	public Point() {
		super();
	}
	public Point(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public Integer getArrayData(int[][] a) {
		return a[this.x][this.y];
		
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this){
			return true;
		}else if((obj instanceof Point)) {
			Point bPoint= (Point)obj;
			if(bPoint.getX().equals(this.x)&&bPoint.getY().equals(this.y)){
				return true;
			}
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		
		return x.hashCode() + y.hashCode();
	}

}
