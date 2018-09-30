package com.jb.backend.webserver.java.j2se.fundamental;



/**
匿名类组成：
		1. new操作符
		2. Runnable：接口名称。这里还可以填写抽象类、普通类的名称。
		3. ()：这个括号表示构造函数的参数列表。由于Runnable是一个接口，没有构造函数，所以这里填一个空的括号表示没有参数。
		4. {...}：大括号中间的代码表示这个类内部的一些结构。在这里可以定义变量名称、方法。跟普通的类一样
	
	匿名类访问权限：
		1. 访问外层Class里面的字段。
		2. 不能访问外层方法中的本地变量。除非变量是final。
		3. 如果内部类的名称和外面能访问的名称相同，则会把名称覆盖掉
	匿名类不可做：
		1. 不能定义静态初始化代码块（Static Initializer）。
		2. 不能在匿名类里面定义接口
		3. 不能在匿名类中定义构造函数
	匿名类中可以包含的东西有：
		1. 字段
		2. 方法
		3. 实例初始化代码
		4. 本地类
	匿名类的好处：
		1. 内部类方法可以访问该类定义所在的作用域中的数据，包括私有的数据；
		2. 内部类可以对同一个包中的其他类隐藏起来；
		3. 使用匿名内部类定义回调函数，节省代码；
 */


public class AnonymousCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("AnonymousClass");
			}
		};
		r.run();
		
	}

}
