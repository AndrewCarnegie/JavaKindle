package com.jb.backend.webserver.java.j2se.fundamental;

/**
单例设计模式(Singleton Design Pattern)：
	利用构造方法的私有化（访问修饰符private），使得一个类只能实例化一个对象,直接在类的内部实例化它自己

单例目标：
	1.主要是为了避免系统内存资源的浪费，并且保证系统
	
应用场景：
	a. 整个系统只需要一个全局对象，来协调系统整体行为；
	b. Linux服务器程序中，服务器配置信息存放在一个配置文件里，让单例对象统一管理，服务器程序进程中其他对象通过访问这个单例对象来获取配置；
	c. Windows系统中回收站也是一个单例对象，所有逻辑盘都共享这个回收站
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
