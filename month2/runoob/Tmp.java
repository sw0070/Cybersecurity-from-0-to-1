
//�̳�


/*
public class Animal
{
	private String name;
	private int id;

	public Animal(String myName, int myid){
		name = myName;
		id = myid;
	}
	public void eat(){
		System.out.println(name + "��");
	}
	public void sleep(){
		System.out.println(name + "˯");
	}
	public void introduction(){
		System.out.println("��Һã�����" + id + "��" +name+ ".");
	}

}

public class Penguin extends Animal  //public?
{
	public Penguin(String myName, int myid){
		super(myName, myid);
	}
}

public class Mouse extends Animal
{
	public Mouse(String myName, int myid){
		super(myName, myid);
	}
}
/*
/*����ӵ�и����private ���Ժͷ���
��չ--
��д--

*/

//extends  implements   ---�ӿ�
//super  this 

//final ���ܼ̳е�
//������

/*

public class Tmp
{
	public static void main(String[] args){
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eatTest();
	}
}

class Animal
{
	void eat(){
		System.out.println("animal: eat");
	}
}

class Dog extends Animal
{
	void eat(){
		System.out.println("dog: eat");
	}
	void eatTest(){
		this.eat();
		super.eat(); //���ø���
	}
}

*/

public class Tmp
{
	public static void main(String[] args){
		SubClass sc1 = new SubClass();
		SubClass sc2 = new SubClass(100);

		SubClass2 sc3 = new SubClass2();
		SubClass2 sc4 = new SubClass2(200);
		

	}
}

class SuperClass
{
	private int n;
	SuperClass(){
		System.out.println("SuperClass()");
	}
	SuperClass(int n){
		System.out.println("SuperClass(int n)");
		this.n = n;
	}
}

class SubClass extends SuperClass
{
	private int n;
	SubClass(){
		System.out.println("SubClass");
	}
	public SubClass(int n){
		super(300);
		System.out.println("SubClass(int n):" + n);
		this.n = n;
	}
}

class SubClass2 extends SuperClass
{
	private int n;
	SubClass2(){
		super(300);
		System.out.println("SubClass2");
	}
	public SubClass2(int n){
		System.out.println("SubClass2(int n):" + n);
		this.n = n;
	}
}













































