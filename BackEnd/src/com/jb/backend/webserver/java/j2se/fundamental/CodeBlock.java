package com.jb.backend.webserver.java.j2se.fundamental;
/**
*@author Andy YE
*@date 2018年8月31日下午2:41:26
*@description
*代码块：
*	1.普通代码块：
*		定义：方法里，没有名字，修饰符，参数的仅仅使用大括号包含的代码部分称为普通代码块
*		作用：限定局部变量已经方法的作用域
*	2.构造代码块
*		定义：类里，没有名字，修饰符，参数的仅仅使用大括号包含的代码部分称为构造代码块
*		作用：作为当前类里所有自有构造方法的共有部分；构造代码块中的初始化时一个类中所有构造方法共有的交集部分
*		使用场景：当某个类的构造方法都需要使用默认值来初始化类中的成员变量时，使用构造代码块可以节省很多代码空间
*		思考：为何没有将name放在构造代码块里呢？因为两个构造方法里对name的初始化方法不同；前者采用默认值初始化；后者采用外界输入初始化
*	3.静态代码块
*		定义：类中，没有名字，参数，访问修饰符，仅用static这个非访问修饰符和大括号所包含的代码部分
*		作用：类级别代码部分；编译期创建，可通过类名来调用其中的成员；优化程序性能；静态代码块的执行优先于构造方法；静态块比main方法执行还早，其执行级别最高
*		使用场景：
*
*/

public class CodeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p1开始 \n" + new Person());
		System.out.println("p2开始 \n" + new Person("Zhang"));
	}

}

class Person{
	//构造代码块
	{
		System.out.println("构造代码块");
		x = 100;
	}//构造代码块，如果构造方法里给x初始化的内容是 一样的，name可以利用构造代码块来减少代码量，增加代码的复用度
	
	static {
		System.out.println("静态方法飘过");
	}
	
	Person(){
		System.out.println("构造方法执行");
		name = "wumingshi";
		show();
	}
	
	Person(String name){
		System.out.println("构造方法执行");
		this.name = name;
		show();
	}
	
	void show() {
		System.out.println("Welcome " + name + "\nx=" + x);
	}
	
	private String name;
	private int x;
	
}


