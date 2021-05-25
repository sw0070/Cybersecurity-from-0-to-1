//java封装


/*
public class Person
{
	private String name;
	private int age;

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//this的作用
}

*/


public class EncapTest
{
	private String name;
	private String idNum;
	private int age;
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getIdNum(){
		return idNum;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setIdNum(String newId){
		idNum = newId;
	}
}































