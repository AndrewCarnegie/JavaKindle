package com.jb.backend.webserver.java.j2se.coretechnology.inheritance;
/**
*@author Andy YE
*@date 2018年9月4日上午10:02:08
*
*	实现方式：通过extends关键字，Java继承只能直接继承父类的公有属性和公有方法，而隐含地继承了私有属性
*			Java不允许多重继承
*	定义：在原有类的基础上通过扩展成员来组建一个新类
*	作用：执行拿来主义，软件复用，代码复用，通过继承，进一步扩展新特性，适应新需求。
*	优点：避免代码重复且臃肿
*	缺点：
*	使用场景：盖房子前，首先是画图纸；图纸规划好，可以造很多个房子。基本图纸也可以通过扩展增加新的特性，建造特点各异的房子
*	前提要点：a.重视is-a关系，类A和类B只有具有is-a关系，才是父子类的关系
*		   b.通常情况下，多层继承不超过三层
*		   c.由于父类的私有属性对子类不是显式可见的，所以必须通过设置setter和getter方法来间接操作
*		   d.子类对象的实例化过程，先调用父类构造方法，再调用子类构造方法
*		   e.当创建一个子类对象时，如果没有显式优先创建父类对象，那么程序也会默认在后台优先创建一个父类对象
*		   f.使用final修饰的类无法被继承
*		   g.如果需要显式调用父类的构造方法，请使用super(param1,param2,...),且它必须写在子类构造函数的第一行
*			 实际上，每个子类的构造方法都隐式地调用了super()无参构造;
*		   h.如果父类的属性或者方法是private,在子类中使用super加setter和getter方法调用或者通过在子类的构造方法中调用父类的构造方法；如果父类的属性或者方法是其他修饰符，那么在子类中可以直接用super或者this调用
*/

public class InheritanceUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDerived id = new InheritanceDerived();
		//此对象并没有直接拥有成员属性inheritancebase，而是通过继承得来，而且子类中并没有申明此属性，继承的价值体现在于此
		id.setInheritancebase("I'm the base attribute.");
		System.out.println(id.getInheritancebase());
		id.setInheritanceDerived("I'm the derived attribute.");
		System.out.println(id.getInheritanceDerived());
	}

}

class InheritanceBase{
	private String inheritancebase;

	public String getInheritancebase() {
		return inheritancebase;
	}

	public void setInheritancebase(String inheritancebase) {
		this.inheritancebase = inheritancebase;
	}

	
}

class InheritanceDerived extends InheritanceBase{
	private String inheritanceDerived;

	public String getInheritanceDerived() {
		return inheritanceDerived;
	}

	public void setInheritanceDerived(String inheritanceDerived) {
		this.inheritanceDerived = inheritanceDerived;
	}
	
	
}


