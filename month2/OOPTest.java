

//2021/5/15 p176-p180
/*
java��������ѧϰ����������
1.Java�༰��ĳ�Ա�����ԣ�������������������飬�ڲ���
2.������������װ�ԣ��̳��ԣ���̬�ԣ������ԣ�
3.�����ؼ��֣�this, super...

�������˼��

�������-����
�˰Ѵ���̧������
1.�������
	�ѱ����Ŵ�
	̧�����

2.�������
	��(){
		��(����){

		}
		̧��(����){
		}
	}

	����(){
		�������()
	}

	����(){
		��()
		�ر�()
	}

�������ǳ���ʱ--������������

4.2����Ҫ��-��Ͷ���
class
object
������-��ĳ�Ա���

���� = ��Ա���� =field = ���ֶ�
���� = ��Ա���� = ���� = Method

������Ķ��� = ���ʵ���� = ʵ������

���˼���
����-������Ϣ
����-��Ϊ����ʲô

*/

class Person{
	//����
	String name; //null
	int age = 1;
	boolean isMale;

	//����
	public void eat(){
		System.out.println("�˿��Գ�.");
	}
	public void sleep(){
		System.out.println("�˿������.");
	}
	public void talk(String language){
		System.out.println("�˿���˵��,ʹ�õ���: " + language);
	}

}


public class OOPTest
{
	public static void main(String[] args){
		Person p1 = new Person(); //ʵ��
		//Scanner scanner = new Scanner(System.in);

		//��������,���� 
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
		//����-��ַ    



	}
}


//�ڴ����

//�������Ե�����
/*���ԣ���Ա������ vs �ֲ�����
1.��ͬ��:
	1.1��������ĸ�ʽ �������� ������ = ����ֵ
	1.2����������ʹ��
	1.3������������Ӧ��������
2.��ͬ��
	2.1������������λ�ò�ͬ
	����
	�ֲ�����

	2.2Ȩ�����η� 
	private public protected ȱʡ--->��װ��


//���з����Ķ���
public void hello{}
public void hello(String name){}
public int hello(String name){}
Ȩ�����η� ����ֵ���� ���������β��б�
static   final abstract֮���ٽ�

Ȩ�����η�private public protected ȱʡ

return this.name

















