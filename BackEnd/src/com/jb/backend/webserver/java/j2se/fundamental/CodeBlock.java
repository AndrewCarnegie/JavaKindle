package com.jb.backend.webserver.java.j2se.fundamental;
/**
*@author Andy YE
*@date 2018��8��31������2:41:26
*@description
*����飺
*	1.��ͨ����飺
*		���壺�����û�����֣����η��������Ľ���ʹ�ô����Ű����Ĵ��벿�ֳ�Ϊ��ͨ�����
*		���ã��޶��ֲ������Ѿ�������������
*	2.��������
*		���壺���û�����֣����η��������Ľ���ʹ�ô����Ű����Ĵ��벿�ֳ�Ϊ��������
*		���ã���Ϊ��ǰ�����������й��췽���Ĺ��в��֣����������еĳ�ʼ��ʱһ���������й��췽�����еĽ�������
*		ʹ�ó�������ĳ����Ĺ��췽������Ҫʹ��Ĭ��ֵ����ʼ�����еĳ�Ա����ʱ��ʹ�ù���������Խ�ʡ�ܶ����ռ�
*		˼����Ϊ��û�н�name���ڹ����������أ���Ϊ�������췽�����name�ĳ�ʼ��������ͬ��ǰ�߲���Ĭ��ֵ��ʼ�������߲�����������ʼ��
*	3.��̬�����
*		���壺���У�û�����֣��������������η�������static����Ƿ������η��ʹ������������Ĵ��벿��
*		���ã��༶����벿�֣������ڴ�������ͨ���������������еĳ�Ա���Ż��������ܣ���̬������ִ�������ڹ��췽������̬���main����ִ�л��磬��ִ�м������
*		ʹ�ó�����
*
*/

public class CodeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p1��ʼ \n" + new Person());
		System.out.println("p2��ʼ \n" + new Person("Zhang"));
	}

}

class Person{
	//��������
	{
		System.out.println("��������");
		x = 100;
	}//�������飬������췽�����x��ʼ���������� һ���ģ�name�������ù������������ٴ����������Ӵ���ĸ��ö�
	
	static {
		System.out.println("��̬����Ʈ��");
	}
	
	Person(){
		System.out.println("���췽��ִ��");
		name = "wumingshi";
		show();
	}
	
	Person(String name){
		System.out.println("���췽��ִ��");
		this.name = name;
		show();
	}
	
	void show() {
		System.out.println("Welcome " + name + "\nx=" + x);
	}
	
	private String name;
	private int x;
	
}


