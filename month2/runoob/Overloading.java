



/*重写
public class Over
{
	public static void main(String[] args){
		Animal a = new Animal(); //Animal对象
		Dog b = new Dog(); //Dog对象
 
		a.move();
		b.move();
		b.bark();
	}
}

class Animal
{
	public void move(){
		System.out.println("动物可以移动");
	}
}

class Dog extends Animal
{
	public void move(){
		System.out.println("狗可以跑和走");
	}
	public void bark(){
		System.out.println("狗可以吠叫");
	}
}
*/

public class Overloading  //重载
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
























