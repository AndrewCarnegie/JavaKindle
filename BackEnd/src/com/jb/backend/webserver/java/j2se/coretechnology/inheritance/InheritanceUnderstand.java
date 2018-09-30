package com.jb.backend.webserver.java.j2se.coretechnology.inheritance;
/**
*@author Andy YE
*@date 2018��9��4������10:02:08
*
*	ʵ�ַ�ʽ��ͨ��extends�ؼ��֣�Java�̳�ֻ��ֱ�Ӽ̳и���Ĺ������Ժ͹��з������������ؼ̳���˽������
*			Java���������ؼ̳�
*	���壺��ԭ����Ļ�����ͨ����չ��Ա���齨һ������
*	���ã�ִ���������壬�������ã����븴�ã�ͨ���̳У���һ����չ�����ԣ���Ӧ������
*	�ŵ㣺��������ظ���ӷ��
*	ȱ�㣺
*	ʹ�ó������Ƿ���ǰ�������ǻ�ͼֽ��ͼֽ�滮�ã�������ܶ�����ӡ�����ͼֽҲ����ͨ����չ�����µ����ԣ������ص����ķ���
*	ǰ��Ҫ�㣺a.����is-a��ϵ����A����Bֻ�о���is-a��ϵ�����Ǹ�����Ĺ�ϵ
*		   b.ͨ������£����̳в���������
*		   c.���ڸ����˽�����Զ����಻����ʽ�ɼ��ģ����Ա���ͨ������setter��getter��������Ӳ���
*		   d.��������ʵ�������̣��ȵ��ø��๹�췽�����ٵ������๹�췽��
*		   e.������һ���������ʱ�����û����ʽ���ȴ������������ô����Ҳ��Ĭ���ں�̨���ȴ���һ���������
*		   f.ʹ��final���ε����޷����̳�
*		   g.�����Ҫ��ʽ���ø���Ĺ��췽������ʹ��super(param1,param2,...),��������д�����๹�캯���ĵ�һ��
*			 ʵ���ϣ�ÿ������Ĺ��췽������ʽ�ص�����super()�޲ι���;
*		   h.�����������Ի��߷�����private,��������ʹ��super��setter��getter�������û���ͨ��������Ĺ��췽���е��ø���Ĺ��췽���������������Ի��߷������������η�����ô�������п���ֱ����super����this����
*/

public class InheritanceUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDerived id = new InheritanceDerived();
		//�˶���û��ֱ��ӵ�г�Ա����inheritancebase������ͨ���̳е��������������в�û�����������ԣ��̳еļ�ֵ�������ڴ�
		id.setInheritancebase("I'm the base attribute.");
		System.out.println(id.getInheritancebase());
		id.setInheritanceDerived("I'm the derived attribute.");
		System.out.println(id.getInheritanceDerived());
	}

}

class InheritanceBase{
	private String inheritancebase;

	public String getInheritancebase() {
		return inheritancebase;
	}

	public void setInheritancebase(String inheritancebase) {
		this.inheritancebase = inheritancebase;
	}

	
}

class InheritanceDerived extends InheritanceBase{
	private String inheritanceDerived;

	public String getInheritanceDerived() {
		return inheritanceDerived;
	}

	public void setInheritanceDerived(String inheritanceDerived) {
		this.inheritanceDerived = inheritanceDerived;
	}
	
	
}

