/**
����һ�������ļ�
*/

/*���Զ���*/

/*
public class HelloChina
{
	public static void main(String[] args) 
	{

		int n = 100;
		System.out.println("n = " + n);
		int x = n;
		System.out.println("x = " + x);
		x += 100;
		System.out.println("x = " + x);

	}
}
*/

/*
������������
���� ������ �ַ� ����

���� ��c���Բ�ͬ���� L f 
bollean b1 = true;
bollean b2 = false;
�ַ� char a = 'A';
char x = '��';
String s = "hello";

�����ṹ
��������������
��������   ��������
int short long byte
float double 
string 
����
boolean true false


int x=5;
float  y=0.01f;
double z = 0.09;
long t = 183284;
boolean d = true;
char s = 'a';
char i = 'u';
char g = '��';

����
final double PI = 3.14;
final float x = 3.14;
double r = 5.0;
double area = PI * r*r;
String l = "hello";

StringBuilder sb = new StringBuilder();
var sb = StringBuilder();
var pi = 3.14;
//��Щ������ var
*/

/*
public class HelloChina    //�������ļ�����ͬ��?
{
	public static void main(String[] args){
		//System.out.println("������liusiwei");
		//System.out.println("�Ա�:��");
		System.out.println("\t*\t\t\t*\n*\t*\t\t*\t*\n");
	}
}

*/

//1.�������� * /  %  ͬc

/*
public class Main{
	public static void main(String[] args){
	int i = (100+200) * (99-88);
	int n = 7 * (5 + (i-9));
	System.out.println(i);
	System.out.println(n);
	}
}
*/

//2.���--ԭ�� �����ڼ�����еĴ洢��ʽ--����
//long

//3.�����Լ�++ --

//4.��λ����

//int x = 7; 4���ֽ�
//00000000 00000000 00000000 00000111
//int a = n << 1; ���� *2
//int b = n >> 1; ���� /2
//int c = n << 28;
//int d = n >> 28;

//>>>�޷��ŵ�����
/*
public class Main{
	public static void main(String[] args){
		int x = 7;
		int a = x << 1;
		int b = x >> 1;
		int c = x << 2;
		int d = x >> 2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
*/

//5.λ���� �� �� �� ���
// & | ~ ^
/*
public class Main{
	public static void main(String[] args){
		int a = 1 & 1;
		int b = 1 | 0;
		int c = ~1;
		int d = 1 ^ 0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
*/

//6.�������ȼ�
//7.ǿ������ת��
/*
public class Main{
	public static void main(String[] args){
		short s = 1234; //2���ֽ�
		int i = 123456; //4���ֽ�
		int x = s + i;
		short y = (short) i; //��Ϊ������ 4���ֽ� �� 2 ���ֽ�

		//short y = s + i;  �������
		System.out.println(x);
		//System.out.println(y);
	}
}
*/

/*��ϰ
public class Main{
	public static void main(String[] args){
		final int n = 100; //���� final ����c�е�#define PI 3.14
		int i = 1;
		int sum = 0;
		while(i <= n){
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.print(sum == 5050 ? "����ͨ��" : "����ʧ��"); 
		//? :��Ԫ����� 
	}
}*/

//���������� ������λ����

//�������ı�ʾ--������--���
//��������
//��� NaN Infinity -Infinity
//ǿ������ת�� ��������(int) (num + 0.5)

/*
public class Main{
	public static void main(String[] args){

		double x = 1.0 / 10;
		double y = 1 - 9.0 / 10;
		//System.out.println(x);
		//System.out.println(y);
		double r = Math.abs(x - y); //Math
		if (r < 0.00001){
			System.out.println("���");
		}
		else{
			System.out.println("�����");
		}

	}
}
*/

//�������� boolean true false
//&& || ! > >= < <= ==
//��·����
//��Ԫ�����
/*
public class Main{
	public static void main(String[] args){
		int n = -100;
		int x = n >= 0 ? n : -n; //�����ֵ Math.abs()
		System.out.println(x);

	}
}
*/
//�ַ����ַ���
/*char -- Unicode�ַ� Unicode����
char c1 = 'A';
char c2 = '��';
int n1 = 'A';
int n2 = '��';
char c3 = '\u0041';
char c4 = '\u4e2d';
*/

//�ַ�������-��������

/*String s = "";
String s1 = "A";
String s2 = "ABC";
String s3 = "���� ABC";
ת��� \
String s = "abc\"xyz";
\u4e2d�� \u6587�� Unicode�ַ�
*/

//�ַ�������
/*
public class Main
{
	public static void main(String[] args){
		
		String s1 = "Hello";
		String s2 = "world";
		String s = s1 + " " + s2 + "!";
		System.out.println(s);
		
		int age = 25;
		String s = "age is " + age; //�Զ�ת��,����python��str
		System.out.println(s);
		
		String s = "hello";
		String t = s;
		s = "world";
		System.out.println(t); //t��ָ��δ��
	}
}
*/

//�����ַ��� """ ...""" Java13��

//���ɱ�����--ָ�����

//��ֵnull ---String s = null;


/*����-ͬ����
public class Main
{
	public static void main(String[] args){
		int[] ns = new int[5]; //����-��ʼ��
		//ns������
		ns[0] = 68;  //����
		ns[1] = 79;
		ns[2] = 91;
		ns[3] = 85;
		ns[4] = 63;
		//ns.length��ȡ���� --

		//int[] ns = new int[5] {68, 79, 91, 85, 64};

		//int[] ns = {68, 79, 91, 85, 64};
		//final int n = 5;����������Χ
		//System.out.println(ns[n]);
	}
}

public class Main{
	public static void main(String[] args){
		int[] ns;
		ns = new int[] {56, 78, 89, 90, 70};
		System.out.println(ns.length);
		ns = new int[] {3, 4, 6};
		System.out.println(ns.length);
		//ns ��ָ�����
	}
}
*/

//�ַ�������
//String[] n = {"name", "age"}; n[0] = "shape";

public class Main
{
	public static void main(String[] args){
		String[] names = {"ABC", "abc", "xyz"};
		String s = names[1];
		names[1] = "car";
		System.out.println(s);  //s��names[1]��ָ�����
	}
}



































