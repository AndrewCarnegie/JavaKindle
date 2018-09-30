package com.jb.backend.webserver.java.j2se.fundamental.enumeration;

import java.util.EnumMap;
import java.util.Map;

/**
*@author Andy YE
*@date 2018年9月3日下午4:04:20
*
*枚举映射
*	实现方式：使用数组实现，继承自Map（因而Map中的方法都可以使用）
*	定义：枚举的变种，就是一个没能存储有限特定值的键值对映射
*	作用：
*	优点：高效紧凑
*	缺点：/
*	使用场景：
*/

public class EnumMapClass {
	
	private enum Week{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这个.class对象给EnumMap提供了有关枚举的元信息（meta information），这些信息主要包括枚举值得数量
		//这是为EnumMap创建内置数组类存储这些枚举值做准备
		EnumMap<Week, String> wMap = new EnumMap<Week,String>(Week.class);
		//put方法是向映射中添加键值对
		wMap.put(Week.Monday, "星期一");
		wMap.put(Week.Tuesday, "星期二");
		wMap.put(Week.Wednesday, "星期三");
		wMap.put(Week.Thursday, "星期四");
		wMap.put(Week.Friday, "星期五");
		wMap.put(Week.Saturday, "星期六");
		wMap.put(Week.Sunday, "星期天");
		for (Map.Entry<Week, String> week: wMap.entrySet()) {
			//entrySet()是定义在Map类中的一个方法，返回整个映射实例（entry）的集合
			System.out.println(week.getKey() + " 对应的值为： "+ week.getValue());
		}
	}

}


