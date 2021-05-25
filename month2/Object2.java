

/*构造方法
public class Object2
{
	public static void main(String[] args){
		Person p1 = new Person("xiao", 19);
		Person p2 = new Person();
	}
}

class Person
{
	private String name;
	private int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(){
	}

	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}*/


//方法名相同，参数不同--方法重载
//返回值类型相同--void 
/*
class Hello
{
	public void hello(){
		System.out.println("Hello, World!");
	}
	public void hello(String name){
		System.out.println("Hello, " + name + "!");
	}
	public void hello(String name, int age){
		if(age<18){
			System.out.println("Hi, " + name + "!");
		} else {
			System.out.println("Hello, " + name + "!");
		}
	}
}*/


//超类

/*继承-extends 子类继承了父类的一些方法-实现代码复用

public class Tmp
{
	public static void main(String[] args){
		


	}
}
//子类无法访问父类的private字段和private方法--protected


class Person
{
	private String name;
	private int age;

	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
}

class Student extends Person
{
	private int score;
	
	public int getScore(){
	
	}
	public void setScore(int score){
	
	}
}
*/

//protected

//super--子类引用父类的字段-super.fieldName

//向上转型-向下转型-
//强制类型转换(Student)



//多态

//覆写Override-- Overload
/*
public class Tmp
{
	public static void main(String[] args){
		Student ming = new Student();
		ming.run();
	}
}

class Person
{
	public void run(){
		System.out.println("Person.run");
	}
}

class Student extends Person
{
	@Override //覆写-子类和父类的方法签名-run
	
	public void run(String s){

	}  //方法参数
	public void run(){
		System.out.println("Student.run");
	}
	public int run(){
	
	} //返回值的类型
}
*/
/*
public class Object2
{
	public static void main(String[] args){
		Person p = new Student();  //
		p.run();

	}
}

多态
Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
这个非常重要的特性在面向对象编程中称之为多态。


class Person
{
	public void run(){
		System.out.println("Person.run");
	}
}
class Student extends Person
{
	@Override //覆写
	public void run(){
		System.out.println("Student.run");
	}
	//public int run() 不是覆写
	//public void run(String s) -参数


	//方法签名--方法返回值-方法参数
}
*/

/*多态具有一个非常强大的功能，就是允许添加更多类型的
子类实现功能扩展，却不需要修改基于父类的代码。*/

class Income
{
	protected double income;
	public Income(double income){
		this.income = income;
	}

	public double getTax(){
		return income*0.1;
	}
}

class Salary extends Income
{
	public Salary(double income){
		super(income);
	}

	@Override
	public double getTax(){
		if(income <= 5000){
			return 0;
		}
		return (income-5000)*0.2;
	}
}

class StateCouncilSpecialAllowance extends Income{
	Public StateCouncilSpecialAllowance(double income){
		super(income);
	}
	@Override
	public double getTax(){
		return 0;
	}
}


public class Object2
{
	public static void main(String[] args){
		Income incomes = new Incomes[] {
			new Income(3000),
			new Salary(7500),
			new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;

	}
}


/*调用super.方法-父类的方法

/*final修饰-方法public final String hello()---不能被覆写
修饰类  final class Person---不能被继承
修饰字段(属性) public final String name = "Unamed" 不能被修改



//抽象类-abstract

/*方法
构造方法public Person(string name, int age)
方法重载void hello   void hello(String name) 
继承extends super()
多态 //覆写@Override
接口interface
抽象类abstract

*/






























