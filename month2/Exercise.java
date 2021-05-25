


public class Exercise
{
	public static void main(String[] args){
		Person p = new Person("小明", 12);
		Student s = new Student("小红", 20, 99);
		Student ps = new PrimaryStudent("小军", 9, 100, 5);
		//向上转型
		System.out.println(ps.getScore());
		//ps--方法
	}
}

class Person
{
	protected String name;
	protected int age;
	//构造方法
    public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}

class Student extends Person
{
	protected int score;
	public Student(String name, int age, int score){
		super(name, age);  //调用父类的构造方法
		this.score = score;
	}
	public int getScore(){
		return score;
	}

}

class PrimaryStudent extends Student
{
	protected int grade;
	public PrimaryStudent(String name, int age, int score, int grade){
		super(name, age, score);
		this.grade = grade;
	}
}





























