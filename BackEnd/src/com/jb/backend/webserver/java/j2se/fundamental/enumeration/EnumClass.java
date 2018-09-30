package com.jb.backend.webserver.java.j2se.fundamental.enumeration;

import java.util.Scanner;

/**
*@author Andy YE
*@date 2018��9��3������10:37:55
*
*ö�٣�
*	ʵ�ַ�ʽ��ö��δ�����ⲿ���ԣ����ǳ�������ʵ�֣�����Ϊ����ʹ��
*	���壺���ٹ���ĳ�������
*	���ã������������ľ�̬��������
*	�ŵ㣺/
*	ȱ�㣺/
*	ʹ�ó��������ڡ����ڡ���ɫ�����еĶ���
*	ʹ��Ҫ�㣺a.ö�����Ͳ�����public��protected���η����ι��췽�������췽����Ȩ��ֻ����private��friendly��Ĭ��������״̬����
*			 �ʴˣ�ö�ٶ������޷��ڳ�����ͨ��ֱ�ӵ��ù��췽������ʼ����
*		   b.����ö������ʱ������Ǽ����ͣ����һ��ö��ֵ����Բ��÷ֺţ����ö�ٰ�����������ô���һ��ö��ֵ�������ʹ�÷ֺ�
*		   c.��ö���ڲ����Զ���һ�����߶�����󷽷�����Ϊʲô����ʹ��abstract����ö���أ�Java�涨ö���಻�ɱ��̳У������󷽷�����ʹ�ü̳�����ʵ��
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
			System.out.println("����һ");
			break;
		case Tuesday:
			System.out.println("���ڶ�");
			break;
		case Wednesday:
			System.out.println("������");
			break;
		case Thursday:
			System.out.println("������");
			break;
		case Friday:
			System.out.println("������");
			break;
		case Saturday:
			System.out.println("������");
			break;
		default:
			System.out.println("������");
			break;
		}		
	}
}


