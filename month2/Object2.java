

/*���췽��
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


//��������ͬ��������ͬ--��������
//����ֵ������ͬ--void 
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


//����

/*�̳�-extends ����̳��˸����һЩ����-ʵ�ִ��븴��

public class Tmp
{
	public static void main(String[] args){
		


	}
}
//�����޷����ʸ����private�ֶκ�private����--protected


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

//super--�������ø�����ֶ�-super.fieldName

//����ת��-����ת��-
//ǿ������ת��(Student)



//��̬

//��дOverride-- Overload
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
	@Override //��д-����͸���ķ���ǩ��-run
	
	public void run(String s){

	}  //��������
	public void run(){
		System.out.println("Student.run");
	}
	public int run(){
	
	} //����ֵ������
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

��̬
Java��ʵ�����������ǻ�������ʱ��ʵ�����͵Ķ�̬���ã����Ǳ������������͡�
����ǳ���Ҫ������������������г�֮Ϊ��̬��


class Person
{
	public void run(){
		System.out.println("Person.run");
	}
}
class Student extends Person
{
	@Override //��д
	public void run(){
		System.out.println("Student.run");
	}
	//public int run() ���Ǹ�д
	//public void run(String s) -����


	//����ǩ��--��������ֵ-��������
}
*/

/*��̬����һ���ǳ�ǿ��Ĺ��ܣ�����������Ӹ������͵�
����ʵ�ֹ�����չ��ȴ����Ҫ�޸Ļ��ڸ���Ĵ��롣*/

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


/*����super.����-����ķ���

/*final����-����public final String hello()---���ܱ���д
������  final class Person---���ܱ��̳�
�����ֶ�(����) public final String name = "Unamed" ���ܱ��޸�



//������-abstract

/*����
���췽��public Person(string name, int age)
��������void hello   void hello(String name) 
�̳�extends super()
��̬ //��д@Override
�ӿ�interface
������abstract

*/






























