package com.jb.backend.webserver.java.j2se.coretechnology.overrideandoverload;
/**
*@author Andy YE
*@date 2018年9月4日下午4:52:44
*
*	实现方式：
*	定义：
*		override:覆写,父子类中的方法，其名字，参数个数，参数类型，返回值类型都一样，这时我们称子类的该方法覆写了父类的方法
*		overload:重载，同一个类中，方法的名字相同，但是参数个数，参数类型，返回值类型不一定相同
*	作用：
*	优点：
*	缺点：
*	使用场景：
*		a.override: 子类继承父类的方法，但是改写了方法体的实现内容
*		b.overload: 构造方法，普通方法
*   前提要点：
*   	a.如果父类的方法是private，子类的同名方法即使是用public修饰，子类的方法也是一个独立的全新方法，不是继承来的，不存在覆写，因为子类看不见父类中的私有方法
*   	b.只存在方法重载和覆写，不存在属性的重载和覆写；因为属性只有名字和修饰符，没有参数（这个结论有待研究确认）
*/

public class OverrideAndOverload extends overridedemo{
	
	private String override;
	private String overload;
	
	//constructor overload
	public OverrideAndOverload() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor overload
	public OverrideAndOverload(String override, String overload) {
		super();
		this.override = override;
		this.overload = overload;
		System.out.println("initializied in overloaded constructor with "+this.overload + " and " + this.override);
	}
	
	// this is the override method based on the method in super class
	@Override 
	public void printbase() {
		// TODO Auto-generated method stub
		super.printbase();
		System.out.println("This is the extension based on printbase method in super class");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideAndOverload oao = new OverrideAndOverload("orverride", "overload");
		oao.printbase();
	}
	
	
	

}

class overridedemo{
	
	private String overridebase;

	public String getOverridebase() {
		return overridebase;
	}

	public void setOverridebase(String overridebase) {
		this.overridebase = overridebase;
	}
	
	public void printbase() {
		System.out.println("This is printbase coming from override class");
	}
	
}


