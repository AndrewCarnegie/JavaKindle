package com.jb.backend.webserver.java.j2se.coretechnology.abstractclassandinterface;

/**
 * @author Andy YE
 * @date 2018��9��5������11:02:57
 *
 *       ʵ�ַ�ʽ�� ���壺ʹ��abstract���ε��� 
 *       ���ã���Ϊ������ֻ����Ϊ����ʹ�ã��׳�ģ�� 
 *      	 �ŵ㣺
 *        	 ȱ�㣺 
 *        ʹ�ó����� 
 *        ǰ��Ҫ�㣺
 *       a.������ͳ��󷽷�����ʹ��abstract���� 
 *       b.�����಻��ֱ��ͨ��newʵ���� 
 *       c.���󷽷�ֻ��������ʵ�֣�����û��{}�����Ų���
 *       d.���г��󷽷�������뱻����Ϊ�����࣬���������ʵ�ֳ���������г��󷽷��������ܱ�ʵ����
 *       	���仰˵����������л���δʵ�ֵĳ��󷽷�����ô��������Ȼ�ǳ����� 
 *       e.���������ӵ�й��췽����������Щ���췽�������������б�����
 */

public class AbstractclassAndInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Andy", 20, "student", "grade three");
		System.out.println(s.talk());
	}

}

/**
 * ������Personӵ�У� ���ԣ����֣����䣬ְҵ 
 * 				  ������˵��
 *
 */
abstract class Person {
	private String name;
	private int age;
	private String occupation;

	public Person(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public abstract String talk();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}

class Student extends Person {

	private String grade;

	public Student(String name, int age, String occupation) {
		super(name, age, occupation);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String occupation, String grade) {
		super(name, age, occupation);
		this.grade = grade;
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Student--> \n name:" + this.getName() + "\n age:" + this.getAge() + "\n occupation:"
				+ this.getOccupation() + "\n grade:" + this.getGrade();
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}