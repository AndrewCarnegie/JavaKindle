package com.jb.backend.webserver.java.j2se.fundamental.enumeration;

import java.util.Scanner;

/**
*@author Andy YE
*@date 2018年9月3日上午10:37:55
*
*枚举：
*	实现方式：枚举未引用外部语言，而是抽象类自实现，并作为基类使用
*	定义：快速归类的常量集合
*	作用：将有限数量的静态常量归类
*	优点：/
*	缺点：/
*	使用场景：星期、季节、颜色、城市的定义
*	使用要点：a.枚举类型不能用public和protected修饰符修饰构造方法。构造方法的权限只能是private和friendly（默认无修饰状态）。
*			 故此，枚举对象是无法在程序中通过直接调用构造方法来初始化的
*		   b.定义枚举类型时，如果是简单类型，最后一个枚举值后可以不用分号；如果枚举包含方法，那么最后一个枚举值后面必须使用分号
*		   c.在枚举内部可以定义一个或者多个抽象方法，但为什么不能使用abstract修饰枚举呢？Java规定枚举类不可被继承，而抽象方法必须使用继承类来实现
*/
public class EnumClass {
	//statement and initialization
	private enum Week{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumClass ec = new EnumClass();
		Scanner input = new Scanner(System.in);
		String instr = input.nextLine();
		try {
			Week whichDayWeek = Week.valueOf(instr);
			ec.PrintWeek(whichDayWeek);
			input.close();
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("You have entered one illegal value");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null value is not allowed");
		}		
	}
	
	public void PrintWeek(Week week) {
		switch (week) {
		case Monday:
			System.out.println("星期一");
			break;
		case Tuesday:
			System.out.println("星期二");
			break;
		case Wednesday:
			System.out.println("星期三");
			break;
		case Thursday:
			System.out.println("星期四");
			break;
		case Friday:
			System.out.println("星期五");
			break;
		case Saturday:
			System.out.println("星期六");
			break;
		default:
			System.out.println("星期天");
			break;
		}		
	}
}


