package com.jb.backend.webserver.java.j2se.fundamental;

/**
普通代码块
就是在方法后面使用"{}"括起来的代码片段,不能单独执行,必须调下其方法名才可以执行.

静态代码块
在类中使用static修饰,并使用"{}"括起来的代码片段,用于静态变量的初始化或对象创建前的环境初始化.


同步代码块
使用synchronize关键字修饰,并使用"{}"括起来的代码片段.它表示在同一时间只能有
一个线程进入到该方法快中,是一种多线程保护机制

构造代码块
在类中没与任何的前缀或后缀,并使用"{}"括起来的代码片段.


下面的代码包含：构造代码块,无参构造,有参构造
public class Client {
    {//构造代码块
        System.out.println("执行构造代码块");
    }

    public Client() {//无参构造
        System.out.println("执行无参构造函数");
    }

    public Client(String string) {//有参构造
        System.out.println("执行有参构造函数");
    }
}

构造代码块的执行：编译器会把构造代码块插入到每个构造函数的最前端；
               即相当于对象创建时总是会首先执行构造代码块


构造代码块的用途：
 1.初始化实例变量
    如果每个构造函数都需要初始化变量,即可通过构造代码块来实现.
    从而取代在每个构造函数调用初始化实例变量的方法
 2.初始化实例环境
    一个对象必须在适当的场景下才能存在,如果没有适当的场景,
    则就需要在创建对象的时候创建此场景
 *
 */
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("explaination of constructor");
	}

}
