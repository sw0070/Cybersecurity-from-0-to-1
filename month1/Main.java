/**
这是一个测试文件
*/

/*测试而已*/

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
基本数据类型
整数 浮点数 字符 布尔

整型 与c语言不同的是 L f 
bollean b1 = true;
bollean b2 = false;
字符 char a = 'A';
char x = '中';
String s = "hello";

基本结构
变量和数据类型
基本类型   引用类型
int short long byte
float double 
string 
数组
boolean true false


int x=5;
float  y=0.01f;
double z = 0.09;
long t = 183284;
boolean d = true;
char s = 'a';
char i = 'u';
char g = '过';

常量
final double PI = 3.14;
final float x = 3.14;
double r = 5.0;
double area = PI * r*r;
String l = "hello";

StringBuilder sb = new StringBuilder();
var sb = StringBuilder();
var pi = 3.14;
//少些变量名 var
*/

/*
public class HelloChina    //必须与文件名相同吗?
{
	public static void main(String[] args){
		//System.out.println("姓名：liusiwei");
		//System.out.println("性别:男");
		System.out.println("\t*\t\t\t*\n*\t*\t\t*\t*\n");
	}
}

*/

//1.整数运算 * /  %  同c

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

//2.溢出--原因 数字在计算机中的存储方式--负数
//long

//3.自增自减++ --

//4.移位运算

//int x = 7; 4个字节
//00000000 00000000 00000000 00000111
//int a = n << 1; 左移 *2
//int b = n >> 1; 右移 /2
//int c = n << 28;
//int d = n >> 28;

//>>>无符号的右移
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

//5.位运算 与 或 非 异或
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

//6.运算优先级
//7.强制类型转换
/*
public class Main{
	public static void main(String[] args){
		short s = 1234; //2个字节
		int i = 123456; //4个字节
		int x = s + i;
		short y = (short) i; //变为二进制 4个字节 和 2 个字节

		//short y = s + i;  编译错误
		System.out.println(x);
		//System.out.println(y);
	}
}
*/

/*练习
public class Main{
	public static void main(String[] args){
		final int n = 100; //常量 final 类似c中的#define PI 3.14
		int i = 1;
		int sum = 0;
		while(i <= n){
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.print(sum == 5050 ? "测试通过" : "测试失败"); 
		//? :三元运算符 
	}
}*/

//浮点数运算 不能移位运算

//浮点数的表示--二进制--误差
//类型提升
//溢出 NaN Infinity -Infinity
//强制类型转换 四舍五入(int) (num + 0.5)

/*
public class Main{
	public static void main(String[] args){

		double x = 1.0 / 10;
		double y = 1 - 9.0 / 10;
		//System.out.println(x);
		//System.out.println(y);
		double r = Math.abs(x - y); //Math
		if (r < 0.00001){
			System.out.println("相等");
		}
		else{
			System.out.println("不相等");
		}

	}
}
*/

//布尔运算 boolean true false
//&& || ! > >= < <= ==
//短路特性
//三元运算符
/*
public class Main{
	public static void main(String[] args){
		int n = -100;
		int x = n >= 0 ? n : -n; //求绝对值 Math.abs()
		System.out.println(x);

	}
}
*/
//字符和字符串
/*char -- Unicode字符 Unicode编码
char c1 = 'A';
char c2 = '中';
int n1 = 'A';
int n2 = '中';
char c3 = '\u0041';
char c4 = '\u4e2d';
*/

//字符串类型-引用类型

/*String s = "";
String s1 = "A";
String s2 = "ABC";
String s3 = "中文 ABC";
转义符 \
String s = "abc\"xyz";
\u4e2d中 \u6587文 Unicode字符
*/

//字符串连接
/*
public class Main
{
	public static void main(String[] args){
		
		String s1 = "Hello";
		String s2 = "world";
		String s = s1 + " " + s2 + "!";
		System.out.println(s);
		
		int age = 25;
		String s = "age is " + age; //自动转换,不像python中str
		System.out.println(s);
		
		String s = "hello";
		String t = s;
		s = "world";
		System.out.println(t); //t的指向未变
	}
}
*/

//多行字符串 """ ...""" Java13后

//不可变特性--指向变了

//空值null ---String s = null;


/*数组-同类型
public class Main
{
	public static void main(String[] args){
		int[] ns = new int[5]; //创建-初始化
		//ns数组名
		ns[0] = 68;  //索引
		ns[1] = 79;
		ns[2] = 91;
		ns[3] = 85;
		ns[4] = 63;
		//ns.length获取长度 --

		//int[] ns = new int[5] {68, 79, 91, 85, 64};

		//int[] ns = {68, 79, 91, 85, 64};
		//final int n = 5;索引超出范围
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
		//ns 的指向变了
	}
}
*/

//字符串数组
//String[] n = {"name", "age"}; n[0] = "shape";

public class Main
{
	public static void main(String[] args){
		String[] names = {"ABC", "abc", "xyz"};
		String s = names[1];
		names[1] = "car";
		System.out.println(s);  //s的names[1]的指向变了
	}
}



































