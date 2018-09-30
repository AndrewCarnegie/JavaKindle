package com.jb.backend.webserver.java.j2se.coretechnology.polymorphism;
/**
*@author Andy YE
*@date 2018年9月4日上午10:26:55
*
*	实现方式：
*	定义：一种类型表现出多种形态
*		在Java中，多态分两类：
*			a.方法多态性，体现在方法重载和覆盖上，属于静态多态，即同一个接口，不同的实现；这种多态实在代码编译期确定的
*			     方法重载：同一个方法，方法名相同，参数的类型，个数，顺序不同；方法体也不同。在重载关系中，返回值类型可以不同，语法上没有错误，但实际应用中，建议返回值类型相同
*			    方法重写（覆写）：同一个方法，在不同的子类中有不同的方法体实现，从而完成不同的功能实现
*			b.对象多态性，体现在父子对象的转型上，属于动态多态，这种方式也称为动态联编，晚期联编（late bingding）；这种多态只能在运行期体现
*			  允许将父对象设置成与一个或者多个子对象相对的技术；通过赋值，父对象可根据所赋值的不同子对象，
*			 以子对象的特性加以运作。多态意味着相同的（父类）信息发送给不同的子对象，每个子对象会表现出不同的形态
*			父子对象转型有两种形式：
*			上溯造型（Upcast）：父类句柄 = 子类对象实例； 这种造型是安全的，体现了is-a的安全协议
*			下塑造型（Downcast）：子类句柄 = 父类对象实例；这种造型不安全，现实中很少使用	
*			对象多态性是指父类使用被子类覆盖的同名方法；在子类的方法是全新的，而父类不存在同名方法的情况下，父类也不能使用子类所独有的个性化方法	
*	作用：
*	优点：
*	缺点：
*	使用场景：
*   前提要点：
*   	a.多态的核心概念：子类对象可以视作为父类对象
*		b.对象多态的关键思想：父类对象句柄（控制器、遥控器）发送同样的消息（接口）给不同的子类对象（接收器），产生多种形态的结果
*		c.隐藏：在某些场景里，父类的方法不希望被子类覆盖，这时就需要使用static来修饰父类方法形成静态方法，达到不被子类方法覆盖的目的；换句话，就是父类静态方法隐藏了子类同名静态方法
*			    例如：FatherClass fc = new SunClass(); fc.hidedemoprint();如果方法hidedemoprint是静态的，并且父子类都实现了这个静态方法，那么fc.hidedemoprint()将会执行父类方法
*			  实际应用中，隐藏的概念应用并不广泛
*		d.final: 可修饰类、方法、变量
*				final类不可有子类（俗称太监类）
*				final方法不可被覆写；实际应用中，将方法设置成fianl并不多见，但是在系统架构上会出现比较多
*				final变量就是常量
*/

public class PolymorphismUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//同一个类型句柄Animals操作多个子类对象接口，动态多态
		//父类对象由子类实例化
		Animals fish = new Fish();
		Animals bird = new Bird();
		Animals horse = new Horse();
		fish.move();
		bird.move();
		horse.move();
	}

}

abstract class Animals{
	abstract void move();
}


class Fish extends Animals{
	@Override
	void move() {
		System.out.println("I'm a fish,I move in the water");
	}
}

class Bird extends Animals{
	@Override
	void move() {
		System.out.println("I'm a bird,I fly in the sky");
	}
}

class Horse extends Animals{
	@Override
	void move() {
		System.out.println("I'm a horse,I run on the road");
	}
}
