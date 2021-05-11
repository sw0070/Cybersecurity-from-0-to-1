
/*
class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
*/

/*注释 单行多行 文档
public class HelloWorld
{
	public static void main(String[] args){
		final int n = 100;
		int i = 1;
		int sum = 0;
		while(i <= n){
			sum += i;
			i++;
		}
		System.out.println(sum == 5050 ? "测试成功" : "测试失败");
	}
}
*/

/*基本数据类型
byte int short long  占用字节数--溢出
float double 范围
char String
boolean true false

\u4e2d Unicode编码

类名 类 
方法 参数名 参数类型

定义变量并初始化
常量 final float PI = 3.24;
var pi = 3.14; var忽略变量类型

转义符\t \n

整数运算-溢出
++ --
>> << >>>移位-二进制
位运算-与 或 非 异或
& | ~ ^
优先级
强制类型转换(int) 

*/

//数组类型

public class HelloWorld
{
	public static void main(String[] args){
		/*
		int[] ns = new int[5];
		int[] ns = new int[5];
		double[] ns1 = new int[6];
		float[] ns2 = new int[7];
		char[] ns3 = new int[8]; */
		int[] ns = new int[5];
		System.out.println(ns.length);

	}
}

//比较 c语言 int a[5];    int a[NUM];   char b[5];  double c[6];
//int[] ns = new int[5] 

//长度ns.length     c语言中-


//注释 

/*多行注释*/

/**
文档注释
*/

public class HelloWorld //类 类名
{
	public static void main(String[] args){ //方法 
		System.out.println("Hello");  //字符串
	}
}
//程序的结构

//面向对象编程--类 对象 继承多态   
/*基本数据类型
整型 字符 字符串 数组 浮点型 布尔型
定义 使用 同c
int x = 5;
char a = 'a';
double f = 4.5;
boolean t = true;
int[] ns = new int[5];
数组  int[]
强制类型转换 (int) (float)
*/




