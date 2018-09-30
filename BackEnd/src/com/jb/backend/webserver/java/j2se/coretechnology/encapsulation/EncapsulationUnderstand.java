package com.jb.backend.webserver.java.j2se.coretechnology.encapsulation;
/**
*@author Andy YE
*@date 2018��9��4������9:41:13
*
*	ʵ�ַ�ʽ��ͨ���������η�����Ҫʹ��private��������Ȩ�ޣ��Ӷ�ʵ�ַ�װЧ��
*	���壺������ĳ��ʳ��������봦����Щ���ݵĺ�����װ��һ�����γɵ��л��壬��Ϊ��
*	���ã�a.���е�˽������������ⲿ����ֱ��ʹ�ã��ⲿֻ��ͨ����Ĺ����ӿڷ������������е�����
*		b.��װ��Ŀ������ǿ��ȫ�Ժͼ򻯱�̣�ʹ������û�ֻ���˽���ӿڣ�����������;��ͨ����������������ʹ�ýӿڣ�
*		   �������˽���ӿڣ��������Լ�����ڲ�ʵ��
*		c.���α�����һ������ɱ��������������ع��죺
*				���ԣ�attribute���ñȵ��ƣ��������������ֱ�ӽӴ�����ʾ����״̬
*				��Ϊ��behavior���ñȵ��ף����ɾ��ɽӿ�����罻�����ı��ڲ����ԣ��������ָı�ͨ���ӿڳ��ֳ���
*				�ӿڣ�interface���ñȵ��ǣ��������ⲿ�Ӵ����ⲿֻ��ͨ�������ӿڷ������ı�����ڲ�����
*	�ŵ㣺
*		a.��ߴ����ģ�黯�̶�
*		b.��ֹ����䲻����Ӱ��
*		c.�ó�����ǿ�ھۣ���๦�ܾ���������ڲ���ɣ����������Ԥ��������ϣ��ṩ�����澡���ٵķ������ã�
*	ȱ�㣺/
*	ʹ�ó�����/
*	ǰ��Ҫ�㣺a.��Ա����ΪʲôҪ��װ�����������Ա���Բ�����װ���Ǿ���ζ������������������ֵ��
*			���仰˵����Ա���Բ��ܶ������������磬��������ر������һ�����������������ء�
*			�����ͬһ����Ʒ���ӹ���ԭ�ϱ��������⣬��ô���ռӹ����������в�Ʒ�϶����ǲ��ϸ��
*			����������ĸ���ԭ����ǳ�����ԭ�ϵ���ڴ�û�м���
*		   b.��ζ���������Ҫ�Ļ������飿ͨ����setter������ʵʩ����ļ��
*		   c.����Ȩ�޿��Ʒ��Ƕ�������Եģ���ͬһ�����У����е����Ա���Լ����������໥�ɼ���
*		   d.������е�ĳЩ�����ڳ�ʼ�������ٱ�����޸ģ������ʹ�ù��췽�����˽�л���setter
*			 ��ʵ�ָ����ݵķ�װ��
*		   e.ʵ�ַ�װ��Ŀ�ľ������������ݵĿɼ��Կɿأ����õķ��� 
*			 i.ʹ�÷������η�private������setter��getter
*			 ii.��setter���ó�private��ʹ�ù��췽����ʼ�����˷���һ�����ڵ�����Ϊ�����Գ�ʼ������������ı䣩
*		   f.����Ҫ��װ�������Ƕ��󣬸���Σ��ο�EncapsulationForObject�����˵��
*/

public class EncapsulationUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en = new Encapsulation("Attrute2 has been encapsulated by modifier and setter method");
		en.setAttribute1("attribute1");
		System.out.println(en.getAttribute1());
		System.out.println(en.getAttribute2());
	}

}


class Encapsulation{
	//�˳�Ա���Ա�����˽�У�������޷�ֱ�ӵ��ô����ԣ�����ͨ��getter�ӿڷ��������
	private String attribute1;
	private String attribute2;
	


	public Encapsulation(String attribute2) {
		setAttribute2(attribute2);
	}


	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	
	public String getAttribute2() {
		return attribute2;
	}

	//setter for Attribute2 has been encapsulated by private modifier
	private void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	
}


