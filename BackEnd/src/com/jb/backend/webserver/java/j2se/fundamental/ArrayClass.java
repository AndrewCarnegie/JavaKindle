package com.jb.backend.webserver.java.j2se.fundamental;
/**
*@author Andy YE
*@date 2018��9��1������4:39:08
*���飺
*	ʵ�ַ�ʽ��ʹ�÷���reflect�Լ�native���������ⲿ�����������ʵ�ַ�ʽ������java����C
*	���壺ʹ��[]�������ı���
*	���ã������ݽ�����ɾ��ģ�����
*	�ŵ㣺
*		a.��Ϊ�����������洢�ģ������ڴ��ַҲ�������ģ��������ݼ���Ч�ʸ�
*		b.
*	ȱ�㣺
*		a.�ڱ������ͱ���ȷ������Ĵ�С������������ռ��С�޷��ı䣻
*		b.���ݽϴ�ʱ���׳�������Խ�磻���ݽ�Сʱ�������˷ѿռ�
*		c.�ڸı������Сʱ����ɾ�Ĳ�Ч�ʵ���
*	ʹ�ó�����
*		a.��������С
*		b.�����������ǰ���ŷ�������Ԫ�أ�
*		c.���ݸ�����ʵ�֣��κ����Զ�֧��
*		d.���������Ա�Ƚ��ȶ�
*/

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array statement;
			//handle
			final int [] arraydemo;
			//initialization
			arraydemo = new int[10];
			//check the heap memory
			for (int i = 0; i < arraydemo.length; i++) {
				System.out.println(arraydemo[i]);
			}
		//array usage
			//add
			for (int i = 0; i < arraydemo.length; i++) {
				arraydemo[i]=i;
			}
			//clone
			final int [] arrayclone = arraydemo.clone();
			//equals
			if (arraydemo.equals(arrayclone)) {
				System.out.println("arraydemo and arrayclone point to the same object");
			}
			
	}

}


