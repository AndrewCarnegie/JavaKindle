package com.jb.backend.webserver.java.j2se.fundamental;

/**
�ݹ飺
	�������ֱ�ӻ��߼�ӵ����Լ�
	���ã�a.ʵ������ѭ���ļ������;b.�򻯴���
	���ԣ�a.���趨��������
	ʹ�ó���������ѭ���ĵط�������ʹ�õݹ�
 *
 */
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		System.out.println(r.addRecursion(10));
		System.out.println(r.addNonRecursion(10));
	}
	
	public int addRecursion(int n) {
		if(n<1) return n; //�������������Ҵ�����������ڵݹ�ǰ��
		return n + addRecursion(n-1);
	}
	
	public int addNonRecursion(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
