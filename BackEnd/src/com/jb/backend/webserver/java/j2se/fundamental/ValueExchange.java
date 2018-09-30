package com.jb.backend.webserver.java.j2se.fundamental;

/**
值交换

一、分为以下两种：
值传递：
    方法调用时，实际参数把它的值传递给对应的形式参数，
    方法执行中形式参数值的改变不影响实际参数的值。

引用传递：
    也称为传地址。方法调用时，实际参数的引用(地址，而不是参数的值)被传递给方法中相对应的形式参数，
    在方法执行中，对形式参数的操作实际上就是对实际参数的操作，方法执行中形式参数值的改变将会影响实际参数的值

二、表现方式：
    1.基本数据

        结果：交换失败
            交换前：a = 10; b = 20;
            交换后：a = 10; b = 20;
        原因分析：
        主函数运行时在栈内存中开辟属于自己的空间，当change函数运行的时候，也在
        栈内存中开辟属于change函数中实参变量自己的空间，但是由于传进change里的实参的
        作用域仅仅是在chang方法里，而且chang方法没有返回值，所以方法一旦执行完毕，实参的
        生命周期就结束了
        public class Test {
            public static void main(String[] args)  {
                int a=10;
                int b=20;
                System.out.println("交换值之前：a="+a+" "+" b="+b);
                change(a, b);
                System.out.println("交换值之后：a="+a+" "+" b="+b);
            }
            public static void change(int a,int b){
                int temp=a;
                a=b;
                b=temp;
            }
        }

    2.数组
        结果：
            交换前：[1,2,3,4,5]
            交换后：[1,4,3,2,5]
        原因分析：
            数组引用arr是生存在栈内存中的，数组是在堆内存中生成的，change方法是通过引用操作堆内存里的这个对象
        public class Test {
            public static void main(String[] args)  {
                int [] arr={1,2,3,4,5};
                System.out.println("交换值之前："+Arrays.toString(arr));
                change(arr, 1,3);
                System.out.println("交换值之后："+Arrays.toString(arr));
            }
            public static void change(int []arr,int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    3.实例对象
        结果：
            交换前：1
            交换后：4
        原因分析：
            对象引用test是生存在栈内存中的，test对象是在堆内存中生成的；
            通过引用修改了堆内存中的成员属性


        class Te{
            int x=10;
            public Te(int x) {
                this.x = x;
            }
        }
        public class Test {
            public static void main(String[] args)  {
                Te test=new Te(1);
                System.out.println("交换值之前："+test.x);
                change(test, 4);
                System.out.println("交换值之后："+test.x);
            }
            public static void change(Te test,int x){
                test.x=x;
            }
        }
    4.String交换
        结果：
            交换前：12345
            交换后：12345
        原因分析：
            String是基本数据类型，生存在栈内存中；
            main里的str和change里的str其实别不是同一个食物；
            main里的str是局部变量，作用域归属于main；
            change里的str属于形参，实参，作用域归属于change；
            change在执行完操作后，实参生命周期结束


        public class Test {
            public static void main(String[] args)  {
                String str="12345";
                System.out.println("交换值之前："+str);
                change(str, "abcdef");
                System.out.println("交换值之后："+str);
            }
            public static void change(String src,String target){
                src=target;
            }
        }
 *
 */
public class ValueExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("explaination of value exchange");
	}

}
