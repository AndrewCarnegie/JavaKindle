package com.jb.backend.webserver.java.j2se.coretechnology.encapsulation;

import java.util.ArrayList;

/**
*@author Andy YE
*@date 2018年9月4日下午2:26:02
*
*	数据封装中，对基本数据类型的封装使用访问修饰符、setter方法私有化、构造方法一次性初始化就可以达到目的
*	但是对于引用数据类型的封装必须特别小心，否则很容易破坏封装特性
*	
*	引用类型封装办法：如果返回值是引用类型，则显式创建该数据的副本，然后返回该副本，这样就可以避免触及到数据原本
*/

public class EncapsulationForObject {

	public static void main(String[] args) {
		
		TestReturn tr = new TestReturn();
		//得到该私有数据，不是副本，而是引用。引用的含义在于，通过它直接找到所操作对象在内存中的原始位置，这样在该类的外部对其进行修改就会影响到对象的内部状态
		//所以如果返回值是对数据的引用，则必须首先显式地创建该数据的副本，然后在返回该副本，避免变更数据原本
		ArrayList<Integer> intArray = tr.getIntArray();
		
		System.out.println(intArray.size());
		
		ArrayList<Integer> intArray2 = tr.getIntArray();
		intArray2.add(4);
		//下面注释的部分就是克隆一个对象副本，将不会变更原本的对象
//		ArrayList<Integer> intArray2 = (ArrayList<Integer>) tr.getIntArray().clone();
//		intArray2.add(4);
		
		System.out.println("在外部修改其私有变量以后其长度变为：" + intArray2.size());
		System.out.println(tr.getIntArray().size());
		
		//判断两个对象的地址是否相等
		if (intArray == intArray2) {
			System.out.println("intArray 和 intArray2 相等");
		}else {
			System.out.println("intArray 和 intArray2 不相等");
		}
		//判断两个对象的内容是否相等
		if (intArray.equals(intArray2)) {
			System.out.println("intArray 和 intArray2 是同一个对象");
		} else {
			System.out.println("intArray 和 intArray2 不是同一个对象");
		}
	}

}


class TestReturn{
	
	private ArrayList<Integer> intArray = new ArrayList<Integer>();
	
	TestReturn(){
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
	}
	
	ArrayList<Integer> getIntArray(){
		return intArray;
	}
}


