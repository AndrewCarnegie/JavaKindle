package com.jb.backend.webserver.java.j2se.fundamental;

/**
ֵ����

һ����Ϊ�������֣�
ֵ���ݣ�
    ��������ʱ��ʵ�ʲ���������ֵ���ݸ���Ӧ����ʽ������
    ����ִ������ʽ����ֵ�ĸı䲻Ӱ��ʵ�ʲ�����ֵ��

���ô��ݣ�
    Ҳ��Ϊ����ַ����������ʱ��ʵ�ʲ���������(��ַ�������ǲ�����ֵ)�����ݸ����������Ӧ����ʽ������
    �ڷ���ִ���У�����ʽ�����Ĳ���ʵ���Ͼ��Ƕ�ʵ�ʲ����Ĳ���������ִ������ʽ����ֵ�ĸı佫��Ӱ��ʵ�ʲ�����ֵ

�������ַ�ʽ��
    1.��������

        ���������ʧ��
            ����ǰ��a = 10; b = 20;
            ������a = 10; b = 20;
        ԭ�������
        ����������ʱ��ջ�ڴ��п��������Լ��Ŀռ䣬��change�������е�ʱ��Ҳ��
        ջ�ڴ��п�������change������ʵ�α����Լ��Ŀռ䣬�������ڴ���change���ʵ�ε�
        �������������chang���������chang����û�з���ֵ�����Է���һ��ִ����ϣ�ʵ�ε�
        �������ھͽ�����
        public class Test {
            public static void main(String[] args)  {
                int a=10;
                int b=20;
                System.out.println("����ֵ֮ǰ��a="+a+" "+" b="+b);
                change(a, b);
                System.out.println("����ֵ֮��a="+a+" "+" b="+b);
            }
            public static void change(int a,int b){
                int temp=a;
                a=b;
                b=temp;
            }
        }

    2.����
        �����
            ����ǰ��[1,2,3,4,5]
            ������[1,4,3,2,5]
        ԭ�������
            ��������arr��������ջ�ڴ��еģ��������ڶ��ڴ������ɵģ�change������ͨ�����ò������ڴ�����������
        public class Test {
            public static void main(String[] args)  {
                int [] arr={1,2,3,4,5};
                System.out.println("����ֵ֮ǰ��"+Arrays.toString(arr));
                change(arr, 1,3);
                System.out.println("����ֵ֮��"+Arrays.toString(arr));
            }
            public static void change(int []arr,int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    3.ʵ������
        �����
            ����ǰ��1
            ������4
        ԭ�������
            ��������test��������ջ�ڴ��еģ�test�������ڶ��ڴ������ɵģ�
            ͨ�������޸��˶��ڴ��еĳ�Ա����


        class Te{
            int x=10;
            public Te(int x) {
                this.x = x;
            }
        }
        public class Test {
            public static void main(String[] args)  {
                Te test=new Te(1);
                System.out.println("����ֵ֮ǰ��"+test.x);
                change(test, 4);
                System.out.println("����ֵ֮��"+test.x);
            }
            public static void change(Te test,int x){
                test.x=x;
            }
        }
    4.String����
        �����
            ����ǰ��12345
            ������12345
        ԭ�������
            String�ǻ����������ͣ�������ջ�ڴ��У�
            main���str��change���str��ʵ����ͬһ��ʳ�
            main���str�Ǿֲ������������������main��
            change���str�����βΣ�ʵ�Σ������������change��
            change��ִ���������ʵ���������ڽ���


        public class Test {
            public static void main(String[] args)  {
                String str="12345";
                System.out.println("����ֵ֮ǰ��"+str);
                change(str, "abcdef");
                System.out.println("����ֵ֮��"+str);
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
