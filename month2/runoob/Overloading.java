



/*��д
public class Over
{
	public static void main(String[] args){
		Animal a = new Animal(); //Animal����
		Dog b = new Dog(); //Dog����
 
		a.move();
		b.move();
		b.bark();
	}
}

class Animal
{
	public void move(){
		System.out.println("��������ƶ�");
	}
}

class Dog extends Animal
{
	public void move(){
		System.out.println("�������ܺ���");
	}
	public void bark(){
		System.out.println("�����Էͽ�");
	}
}
*/

public class Overloading  //����
{
	public int test(){
		System.out.println("test1");
		return 1;
	}
	public void test(int a){
		System.out.println("test2");
	}
	public String test(int a, String s){
		System.out.println("test3");
		return "returntest3";
	}
	public String test(String s, int a){
		System.out.println("test4");
		return "returntest4";
	}
	public static void main(String[] args){
		Overloading o = new Overloading();
		System.out.println(o.test());
		o.test(1);
		System.out.println(o.test(1, "test3"));
		System.out.println(o.test("test4", 1));
	}
}
























