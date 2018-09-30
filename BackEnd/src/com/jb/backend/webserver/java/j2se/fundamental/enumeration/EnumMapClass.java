package com.jb.backend.webserver.java.j2se.fundamental.enumeration;

import java.util.EnumMap;
import java.util.Map;

/**
*@author Andy YE
*@date 2018��9��3������4:04:20
*
*ö��ӳ��
*	ʵ�ַ�ʽ��ʹ������ʵ�֣��̳���Map�����Map�еķ���������ʹ�ã�
*	���壺ö�ٵı��֣�����һ��û�ܴ洢�����ض�ֵ�ļ�ֵ��ӳ��
*	���ã�
*	�ŵ㣺��Ч����
*	ȱ�㣺/
*	ʹ�ó�����
*/

public class EnumMapClass {
	
	private enum Week{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���.class�����EnumMap�ṩ���й�ö�ٵ�Ԫ��Ϣ��meta information������Щ��Ϣ��Ҫ����ö��ֵ������
		//����ΪEnumMap��������������洢��Щö��ֵ��׼��
		EnumMap<Week, String> wMap = new EnumMap<Week,String>(Week.class);
		//put��������ӳ������Ӽ�ֵ��
		wMap.put(Week.Monday, "����һ");
		wMap.put(Week.Tuesday, "���ڶ�");
		wMap.put(Week.Wednesday, "������");
		wMap.put(Week.Thursday, "������");
		wMap.put(Week.Friday, "������");
		wMap.put(Week.Saturday, "������");
		wMap.put(Week.Sunday, "������");
		for (Map.Entry<Week, String> week: wMap.entrySet()) {
			//entrySet()�Ƕ�����Map���е�һ����������������ӳ��ʵ����entry���ļ���
			System.out.println(week.getKey() + " ��Ӧ��ֵΪ�� "+ week.getValue());
		}
	}

}


