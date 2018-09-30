package com.jb.backend.webserver.java.j2se.fundamental;

/**
�������ģʽ(Singleton Design Pattern)��
	���ù��췽����˽�л����������η�private����ʹ��һ����ֻ��ʵ����һ������,ֱ��������ڲ�ʵ�������Լ�

����Ŀ�꣺
	1.��Ҫ��Ϊ�˱���ϵͳ�ڴ���Դ���˷ѣ����ұ�֤ϵͳ
	
Ӧ�ó�����
	a. ����ϵͳֻ��Ҫһ��ȫ�ֶ�����Э��ϵͳ������Ϊ��
	b. Linux�����������У�������������Ϣ�����һ�������ļ���õ�������ͳһ���������������������������ͨ���������������������ȡ���ã�
	c. Windowsϵͳ�л���վҲ��һ���������������߼��̶������������վ
 *
 */
public class SingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("explaination of singleton design pattern");
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}

}


class Singleton {
    private Singleton(){
    }
    private static volatile Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
