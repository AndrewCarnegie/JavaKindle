package com.jb.backend.webserver.java.j2se.fundamental;

/**
递归：
	概念：方法直接或者间接调用自己
	作用：a.实现无需循环的计算操作;b.简化代码
	特性：a.须设定结束条件
	使用场景：出现循环的地方都可以使用递归
 *
 */
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		System.out.println(r.addRecursion(10));
		System.out.println(r.addNonRecursion(10));
	}
	
	public int addRecursion(int n) {
		if(n<1) return n; //结束条件，而且此条件必须放在递归前面
		return n + addRecursion(n-1);
	}
	
	public int addNonRecursion(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
