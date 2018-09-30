package com.jb.backend.webserver.java.j2se.fundamental;
/**
*@author Andy YE
*@date 2018年9月1日下午4:39:08
*数组：
*	实现方式：使用反射reflect以及native引用其他外部语言所定义的实现方式，这里java引用C
*	定义：使用[]来声明的变量
*	作用：对数据进行增删查改，排序
*	优点：
*		a.因为数据是连续存储的，所有内存地址也是连续的，这样数据检索效率高
*		b.
*	缺点：
*		a.在编译器就必须确定数组的大小；而运行期其空间大小无法改变；
*		b.数据较大时容易出现数组越界；数据较小时又容易浪费空间
*		c.在改变数组大小时，增删改查效率低下
*	使用场景：
*		a.数据量较小
*		b.常做的运算是按序号访问数据元素；
*		c.数据更容易实现，任何语言都支持
*		d.构建的线性表比较稳定
*/

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array statement;
			//handle
			final int [] arraydemo;
			//initialization
			arraydemo = new int[10];
			//check the heap memory
			for (int i = 0; i < arraydemo.length; i++) {
				System.out.println(arraydemo[i]);
			}
		//array usage
			//add
			for (int i = 0; i < arraydemo.length; i++) {
				arraydemo[i]=i;
			}
			//clone
			final int [] arrayclone = arraydemo.clone();
			//equals
			if (arraydemo.equals(arrayclone)) {
				System.out.println("arraydemo and arrayclone point to the same object");
			}
			
	}

}


