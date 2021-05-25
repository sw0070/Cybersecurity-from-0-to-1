

//2021/5/15 p176-p180
/*
java面向对象的学习的三条主线
1.Java类及类的成员。属性，方法，构造器，代码块，内部类
2.三大特征；封装性，继承性，多态性（抽象性）
3.其他关键字：this, super...

面向对象思想

面向过程-对象
人把大象抬进冰箱
1.面向过程
	把冰箱门打开
	抬起大象

2.面向对象
	人(){
		打开(冰箱){

		}
		抬起(大象){
		}
	}

	大象(){
		进入冰箱()
	}

	冰箱(){
		打开()
		关闭()
	}

代码量非常大时--面向对象的优势

4.2基本要素-类和对象
class
object
类的设计-类的成员设计

属性 = 成员变量 =field = 域，字段
方法 = 成员方法 = 函数 = Method

创建类的对象 = 类的实例化 = 实例化类

个人简历
属性-个人信息
方法-行为做了什么

*/

class Person{
	//属性
	String name; //null
	int age = 1;
	boolean isMale;

	//方法
	public void eat(){
		System.out.println("人可以吃.");
	}
	public void sleep(){
		System.out.println("人可以碎觉.");
	}
	public void talk(String language){
		System.out.println("人可以说话,使用的是: " + language);
	}

}


public class OOPTest
{
	public static void main(String[] args){
		Person p1 = new Person(); //实例
		//Scanner scanner = new Scanner(System.in);

		//调用属性,方法 
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);

		p1.eat();
		p1.sleep();
		p1.talk("Chinese");

		Person p2 = new Person(); 
		System.out.println(p2.name); //null
		System.out.println(p2.isMale); 

		Person p3 = p1;
		System.out.println(p3.name);
		p3.age = 10;
		System.out.println(p1.age); //10
		//数组-地址    



	}
}


//内存解析

//类中属性的作用
/*属性（成员变量） vs 局部变量
1.相同点:
	1.1定义变量的格式 数据类型 变量名 = 变量值
	1.2先声明，后使用
	1.3变量都有器对应的作用域
2.不同点
	2.1在类中声明的位置不同
	属性
	局部变量

	2.2权限修饰符 
	private public protected 缺省--->封装性


//类中方法的定义
public void hello{}
public void hello(String name){}
public int hello(String name){}
权限修饰符 返回值类型 方法名（形参列表）
static   final abstract之后再将

权限修饰符private public protected 缺省

return this.name

















