package com.jb.backend.webserver.java.j2se.fundamental.enumeration;

import java.util.EnumSet;
import java.util.Iterator;

/**
*@author Andy YE
*@date 2018��9��3������4:05:01
*
*EnumSet��
*	ʵ�ַ�ʽ������Set�ӿڵĳ������࣬û���ṩ�κι��췽����������乹�췽����˽�л��ˣ����жԴ��෽���Ĳ��������ھ�̬����
*	���壺
*	���ã�ר�����ڴ���ö�٣�enum�����͵�Set�༯
*	�ŵ㣺
*	ȱ�㣺
*	ʹ�ó�����
*/


public class EnumSetClass {
	//Weekʵ������һ����
	//�����������Ԫ��
	private enum Week{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//allof(): EnumSet��ľ�̬���������������������������ָ���ȫ���������õ�������
		//�ڱ����У�allof�Ĳ���ΪWeek.class.Ҳ���ǽ�ö������Week��������ȫ��ȡֵ��ΪwSet��Ԫ��
		EnumSet<Week> wSet = EnumSet.allOf(Week.class);
		//��������iterator����ʱҲ��Ϊ�α꣨cursor����������C��ָ�룬���������е�Ԫ��
		Iterator<Week> iter = wSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		
		//noneof():EnumSet��ľ�̬��������ʾ�����������ļ����е�Ԫ��һ��Ҳ��ȡ�����仰˵����������һ���ռ���
		EnumSet<Week> noneSet = EnumSet.noneOf(Week.class);
		Iterator<Week> noneiter = noneSet.iterator();
		while (noneiter.hasNext()) {
			System.out.println(noneiter.next());
			
		}
	}

}

