package com.jb.backend.webserver.java.j2se.coretechnology.abstractclassandinterface;
/**
*@author Andy YE
*@date 2018��9��10������10:27:53
*
*	ʵ�ַ�ʽ��ʹ��abstract�ؼ��ֵ���
*	���壺���г��󷽷�����
*		a.����ʹ�ùؼ���abstract����
*		b.�����಻��ֱ��ʵ������Ҳ���ǲ���ʹ��new�ؼ���ֱ�Ӳ�������
*		c.�������еĳ��󷽷�ֻ������������ʵ��
*		d.���г��󷽷������������Ϊ�����࣬����������าд���г��󷽷�����ܱ�ʵ������
*		�������ϣ��ʵ�ֳ��󷽷�������Ϊʱ�����Խ���ʹ�ô����ž��Ǵ������󷽷���ʵ��
*		e.�������̳г��������Ȼ�г��󷽷�����ô������ȻΪ������
*	���ã���Ϊ���࣬��Ϊģ��
*	�ŵ㣺����ʵ�����з���
*	ȱ�㣺ֻ��֧�ֵ��̳�
*	ʹ�ó�����
*	ǰ��Ҫ�㣺
*		a.�ڳ������п�����ʽ�������췽������ˣ�������Ҳ������ʽ���ø��๹�췽��
*		b.�����಻��ʹ��final������
*		c.�ⲿ�����಻��ʹ��static���Σ����ڲ��������ʹ��static���Σ���ʱ�þ�̬�ڲ���ʵ���ϱ�ʾһ���ⲿ��
*
*	���⣺�������Ƿ������Ϊ�������ľ��������
*/

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book.CD cd = new JavaCD();//ʵ������������������������󣬾�̬�ڲ��������������������
		cd.get();
	}

}

abstract class Book{
	public abstract void print();
	
	static abstract class CD{
		public abstract void get();
	}
}

//�̳о�̬�ڲ������࣬���൱�ڼ̳��ⲿ��
class JavaCD extends Book.CD{
	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("learning Java");
	}
}