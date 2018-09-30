package com.jb.backend.webserver.java.j2se.coretechnology.encapsulation;
/**
*@author Andy YE
*@date 2018年9月4日上午9:41:13
*
*	实现方式：通过访问修饰符（主要使用private）来控制权限，从而实现封装效果
*	定义：将描述某类食物的数据与处理这些数据的函数封装在一起所形成的有机体，称为类
*	作用：a.类中的私有数据在类的外部不能直接使用，外部只能通过类的公共接口方法来处理类中的数据
*		b.封装的目的是增强安全性和简化编程，使得类的用户只需了解类接口（方法）的用途并通过访问修饰来合理使用接口，
*		   而无需了解类接口（方法）以及类的内部实现
*		c.象形比喻：一个对象可被看做鸡蛋的三重构造：
*				属性（attribute）好比蛋黄，它隐藏最深，不能直接接触，表示对象状态
*				行为（behavior）好比蛋白，它可经由接口与外界交互来改变内部属性，并把这种改变通过接口呈现出来
*				接口（interface）好比蛋壳，它可与外部接触，外部只能通过公开接口方法来改变对象内部属性
*	优点：
*		a.提高代码的模块化程度
*		b.防止对象间不良互影响
*		c.让程序能强内聚（许多功能尽量在类的内部完成，不让外面干预），弱耦合（提供给外面尽量少的方法调用）
*	缺点：/
*	使用场景：/
*	前提要点：a.成员属性为什么要封装起来？如果成员属性不做封装，那就意味着外界可以随意变更属性值，
*			换句话说，成员属性不能独立自主；例如，动物的体重被赋予成一个负数，后果会很严重。
*			这就如同一个产品，加工的原料本身有问题，那么最终加工出来的所有产品肯定都是不合格的
*			造成这个问题的根本原因就是程序在原料的入口处没有检验
*		   b.如何对属性做必要的基本检验？通过在setter方法里实施合理的检查
*		   c.访问权限控制符是对类外而言的，在同一个类中，所有的类成员属性及方法都是相互可见的
*		   d.如果类中的某些数据在初始化后不想再被外界修改，则可以使用构造方法配合私有化的setter
*			 来实现该数据的封装。
*		   e.实现封装的目的就是让类中数据的可见性可控，常用的方法 
*			 i.使用访问修饰符private，设置setter和getter
*			 ii.将setter设置成private，使用构造方法初始化（此方法一般用于的情形为：属性初始化过后不再允许改变）
*		   f.假如要封装的数据是对象，该如何？参考EncapsulationForObject类里的说明
*/

public class EncapsulationUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en = new Encapsulation("Attrute2 has been encapsulated by modifier and setter method");
		en.setAttribute1("attribute1");
		System.out.println(en.getAttribute1());
		System.out.println(en.getAttribute2());
	}

}


class Encapsulation{
	//此成员属性被声明私有，类对象无法直接调用此属性，必须通过getter接口方法类调用
	private String attribute1;
	private String attribute2;
	


	public Encapsulation(String attribute2) {
		setAttribute2(attribute2);
	}


	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	
	public String getAttribute2() {
		return attribute2;
	}

	//setter for Attribute2 has been encapsulated by private modifier
	private void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	
}


