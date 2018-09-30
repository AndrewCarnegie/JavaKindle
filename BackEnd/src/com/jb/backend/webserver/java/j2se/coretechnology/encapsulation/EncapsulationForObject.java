package com.jb.backend.webserver.java.j2se.coretechnology.encapsulation;

import java.util.ArrayList;

/**
*@author Andy YE
*@date 2018��9��4������2:26:02
*
*	���ݷ�װ�У��Ի����������͵ķ�װʹ�÷������η���setter����˽�л������췽��һ���Գ�ʼ���Ϳ��ԴﵽĿ��
*	���Ƕ��������������͵ķ�װ�����ر�С�ģ�����������ƻ���װ����
*	
*	�������ͷ�װ�취���������ֵ���������ͣ�����ʽ���������ݵĸ�����Ȼ�󷵻ظø����������Ϳ��Ա��ⴥ��������ԭ��
*/

public class EncapsulationForObject {

	public static void main(String[] args) {
		
		TestReturn tr = new TestReturn();
		//�õ���˽�����ݣ����Ǹ������������á����õĺ������ڣ�ͨ����ֱ���ҵ��������������ڴ��е�ԭʼλ�ã������ڸ�����ⲿ��������޸ľͻ�Ӱ�쵽������ڲ�״̬
		//�����������ֵ�Ƕ����ݵ����ã������������ʽ�ش��������ݵĸ�����Ȼ���ڷ��ظø���������������ԭ��
		ArrayList<Integer> intArray = tr.getIntArray();
		
		System.out.println(intArray.size());
		
		ArrayList<Integer> intArray2 = tr.getIntArray();
		intArray2.add(4);
		//����ע�͵Ĳ��־��ǿ�¡һ�����󸱱�����������ԭ���Ķ���
//		ArrayList<Integer> intArray2 = (ArrayList<Integer>) tr.getIntArray().clone();
//		intArray2.add(4);
		
		System.out.println("���ⲿ�޸���˽�б����Ժ��䳤�ȱ�Ϊ��" + intArray2.size());
		System.out.println(tr.getIntArray().size());
		
		//�ж���������ĵ�ַ�Ƿ����
		if (intArray == intArray2) {
			System.out.println("intArray �� intArray2 ���");
		}else {
			System.out.println("intArray �� intArray2 �����");
		}
		//�ж���������������Ƿ����
		if (intArray.equals(intArray2)) {
			System.out.println("intArray �� intArray2 ��ͬһ������");
		} else {
			System.out.println("intArray �� intArray2 ����ͬһ������");
		}
	}

}


class TestReturn{
	
	private ArrayList<Integer> intArray = new ArrayList<Integer>();
	
	TestReturn(){
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
	}
	
	ArrayList<Integer> getIntArray(){
		return intArray;
	}
}

