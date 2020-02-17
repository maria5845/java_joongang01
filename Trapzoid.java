package object;

import java.util.Scanner;

/*
 * -base  : int
 * -top : int
 * -height : int
 * 
 * -setTrapzoid (base : int. top : int , height :int) :void 
 * +calc() :double 사다리꼴 넓이 를 구하는 리턴 (아랫변 + 윗변 ) *높이 /2.0
 * +toString() : String 
 */
public class Trapzoid {
	private int base;
	private int top;
	private int height;

	public void setTrapzoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;

	}
	public double calc() {
		return (base+top)*height/2.0;
		
		
	}

	public String toString () {
		
	return"넓이"+calc();
	
		
	}
	
	
	
}
