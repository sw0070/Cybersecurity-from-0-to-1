


/*����������
class Person{}
Person ming = new Person()
class Book{}
Book book1 = new Book()

class Book
{
	public String name;
	public String author;
	public String isbn;
	public double price;
}

//Person ming = new Person();
//Book book1 = new Book();
//book1.name = "����";
//book1.author = "����";

public class Object
{
	public static void main(String[] args){
		Book book1 = new Book();
		book1.name = "����";
		book1.author = "����";
		System.out.println(book1.name);


	}
}

public class Tmp{
	public static void main(String[] args){
		Person ming = new Person();
		ming.setName("xiao ming");
		ming.setAge(18);
		System.out.println(ming.getName() + "," + ming.getAge());
	}
}

class Person{
	private String name;
	private int age;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name == null || name.isBlank()){
			throw new IllegalArgumentException("Invalid age value");
		}
		this.name = name.strip(); //ȥ����β�ո�
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		if(age<0 || age>200){
			throw new IllegalArgumentException("Invalid age value");
		}
		this.age = age;
	}

}
*/

//��ζ��巽��

//�������

/*��-ʵ��
���� -public or private

*/

public class Tmp{
	public static void main(String[] args){
		Group g = new Group();
		g.setNames("xiao ming", "xiao hong", "xiao jun");

	}
}

class Person
{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}	

}
//this���� this.field���ʵ�ǰʵ�����ֶ�

/*��������*/
//�ɱ����
class Group
{
	private String[] names;

	public void setNames(String... names){
		this.names = names;
	}

}

//�����Ĳ�����--�ݲ����



























