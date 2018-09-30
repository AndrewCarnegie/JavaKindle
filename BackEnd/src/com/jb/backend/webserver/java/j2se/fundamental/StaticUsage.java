package com.jb.backend.webserver.java.j2se.fundamental;

/**
*Static:静态
*
*static可以修饰类的成员方法、成员变量；可编写static代码块来优化程序性能
*
*
*一、Static method 静态方法	
*	1.static方法就是没有this的方法
*	2.在static方法内部不能调用非静态方法，反过来是可以的
*	3.static 方法可以通过类名直接调用；--> 静态方法的主要用途：方便在没有创建对象的情况下调用
*
*
*二、Static variable 静态变量
*	1.静态变量被所有的对象所共享，在内存中只有一个副本；
*	2.静态变量当且仅当在类初次加载时会被初始化
*	3.非静态变量是对象所拥有的，在创建对象的时候被初始化；
*	4.非静态变量在内存中存在多个副本，各个对象拥有的副本互不影响
*
*三、Static block 静态代码块
*	1.static块可以置于类中的任何地方,但是不能出现在方法的内部
*	2.类中可以有多个static块
*	3.在类初次被加载的时候，会按照static块的顺序来执行每个static块，并且只会执行一次
*	4.主要作用：优化程序性能；这个主要表现在：
*  	将只需要进行一次的初始化操作都放在static代码块中进行；
*
*四、关键问题：
*	1.static关键字不会改变类成员的访问权限，访问权限修饰只有：public、protected、private
*	2.是否能通过this访问静态成员变量？可以
*	3.Java语法规定，static是不能修饰局部变量的
*
*/
public class StaticUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("explaination of static");
	}

}
