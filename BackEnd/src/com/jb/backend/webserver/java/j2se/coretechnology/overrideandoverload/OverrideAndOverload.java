package com.jb.backend.webserver.java.j2se.coretechnology.overrideandoverload;
/**
*@author Andy YE
*@date 2018��9��4������4:52:44
*
*	ʵ�ַ�ʽ��
*	���壺
*		override:��д,�������еķ����������֣������������������ͣ�����ֵ���Ͷ�һ������ʱ���ǳ�����ĸ÷�����д�˸���ķ���
*		overload:���أ�ͬһ�����У�������������ͬ�����ǲ����������������ͣ�����ֵ���Ͳ�һ����ͬ
*	���ã�
*	�ŵ㣺
*	ȱ�㣺
*	ʹ�ó�����
*		a.override: ����̳и���ķ��������Ǹ�д�˷������ʵ������
*		b.overload: ���췽������ͨ����
*   ǰ��Ҫ�㣺
*   	a.�������ķ�����private�������ͬ��������ʹ����public���Σ�����ķ���Ҳ��һ��������ȫ�·��������Ǽ̳����ģ������ڸ�д����Ϊ���࿴���������е�˽�з���
*   	b.ֻ���ڷ������غ͸�д�����������Ե����غ͸�д����Ϊ����ֻ�����ֺ����η���û�в�������������д��о�ȷ�ϣ�
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

