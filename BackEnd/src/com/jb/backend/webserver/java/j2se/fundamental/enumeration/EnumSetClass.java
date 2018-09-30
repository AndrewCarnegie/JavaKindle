package com.jb.backend.webserver.java.j2se.fundamental.enumeration;

import java.util.EnumSet;
import java.util.Iterator;

/**
*@author Andy YE
*@date 2018年9月3日下午4:05:01
*
*EnumSet类
*	实现方式：它是Set接口的抽象子类，没有提供任何构造方法，这表明其构造方法被私有化了；所有对此类方法的操作均属于静态操作
*	定义：
*	作用：专门用于处理枚举（enum）类型的Set类集
*	优点：
*	缺点：
*	使用场景：
*/


public class EnumSetClass {
	//Week实际上是一个类
	//大括号里的是元素
	private enum Week{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//allof(): EnumSet里的静态方法，用来将这个方法参数里所指向的全部内容设置到集合中
		//在本例中，allof的参数为Week.class.也就是将枚举类型Week所包含的全部取值作为wSet的元素
		EnumSet<Week> wSet = EnumSet.allOf(Week.class);
		//迭代器（iterator）有时也称为游标（cursor），类似于C的指针，遍历集合中的元素
		Iterator<Week> iter = wSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		
		//noneof():EnumSet里的静态方法，表示参数所代表的集合中的元素一个也不取，换句话说，就是设置一个空集合
		EnumSet<Week> noneSet = EnumSet.noneOf(Week.class);
		Iterator<Week> noneiter = noneSet.iterator();
		while (noneiter.hasNext()) {
			System.out.println(noneiter.next());
			
		}
	}

}


