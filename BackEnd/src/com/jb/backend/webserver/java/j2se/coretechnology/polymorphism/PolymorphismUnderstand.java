package com.jb.backend.webserver.java.j2se.coretechnology.polymorphism;
/**
*@author Andy YE
*@date 2018��9��4������10:26:55
*
*	ʵ�ַ�ʽ��
*	���壺һ�����ͱ��ֳ�������̬
*		��Java�У���̬�����ࣺ
*			a.������̬�ԣ������ڷ������غ͸����ϣ����ھ�̬��̬����ͬһ���ӿڣ���ͬ��ʵ�֣����ֶ�̬ʵ�ڴ��������ȷ����
*			     �������أ�ͬһ����������������ͬ�����������ͣ�������˳��ͬ��������Ҳ��ͬ�������ع�ϵ�У�����ֵ���Ϳ��Բ�ͬ���﷨��û�д��󣬵�ʵ��Ӧ���У����鷵��ֵ������ͬ
*			    ������д����д����ͬһ���������ڲ�ͬ���������в�ͬ�ķ�����ʵ�֣��Ӷ���ɲ�ͬ�Ĺ���ʵ��
*			b.�����̬�ԣ������ڸ��Ӷ����ת���ϣ����ڶ�̬��̬�����ַ�ʽҲ��Ϊ��̬���࣬�������ࣨlate bingding�������ֶ�ֻ̬��������������
*			  ���������������ó���һ�����߶���Ӷ�����Եļ�����ͨ����ֵ��������ɸ�������ֵ�Ĳ�ͬ�Ӷ���
*			 ���Ӷ�������Լ�����������̬��ζ����ͬ�ģ����ࣩ��Ϣ���͸���ͬ���Ӷ���ÿ���Ӷ������ֳ���ͬ����̬
*			���Ӷ���ת����������ʽ��
*			�������ͣ�Upcast���������� = �������ʵ���� ���������ǰ�ȫ�ģ�������is-a�İ�ȫЭ��
*			�������ͣ�Downcast���������� = �������ʵ�����������Ͳ���ȫ����ʵ�к���ʹ��	
*			�����̬����ָ����ʹ�ñ����า�ǵ�ͬ��������������ķ�����ȫ�µģ������಻����ͬ������������£�����Ҳ����ʹ�����������еĸ��Ի�����	
*	���ã�
*	�ŵ㣺
*	ȱ�㣺
*	ʹ�ó�����
*   ǰ��Ҫ�㣺
*   	a.��̬�ĺ��ĸ����������������Ϊ�������
*		b.�����̬�Ĺؼ�˼�룺�������������������ң����������ͬ������Ϣ���ӿڣ�����ͬ��������󣨽�������������������̬�Ľ��
*		c.���أ���ĳЩ���������ķ�����ϣ�������า�ǣ���ʱ����Ҫʹ��static�����θ��෽���γɾ�̬�������ﵽ�������෽�����ǵ�Ŀ�ģ����仰�����Ǹ��ྲ̬��������������ͬ����̬����
*			    ���磺FatherClass fc = new SunClass(); fc.hidedemoprint();�������hidedemoprint�Ǿ�̬�ģ����Ҹ����඼ʵ���������̬��������ôfc.hidedemoprint()����ִ�и��෽��
*			  ʵ��Ӧ���У����صĸ���Ӧ�ò����㷺
*		d.final: �������ࡢ����������
*				final�಻�������ࣨ�׳�̫���ࣩ
*				final�������ɱ���д��ʵ��Ӧ���У����������ó�fianl���������������ϵͳ�ܹ��ϻ���ֱȽ϶�
*				final�������ǳ���
*/

public class PolymorphismUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͬһ�����;��Animals��������������ӿڣ���̬��̬
		//�������������ʵ����
		Animals fish = new Fish();
		Animals bird = new Bird();
		Animals horse = new Horse();
		fish.move();
		bird.move();
		horse.move();
	}

}

abstract class Animals{
	abstract void move();
}


class Fish extends Animals{
	@Override
	void move() {
		System.out.println("I'm a fish,I move in the water");
	}
}

class Bird extends Animals{
	@Override
	void move() {
		System.out.println("I'm a bird,I fly in the sky");
	}
}

class Horse extends Animals{
	@Override
	void move() {
		System.out.println("I'm a horse,I run on the road");
	}
}