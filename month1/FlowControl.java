//���̿���


/*��������
println("");
print();
printf();��ʽ�����


public class Tmp
{
	public static void main(String[] args){
		System.out.print("A,");
		System.out.print("B.");
		System.out.println("\nEND");
		final double pi = 3.141593; //final���÷�
		System.out.printf("%.3f", pi);
		//�����������
		int n = 12345000;
		System.out.printf("\nn=%d, hex=%08x", n, n);
	}
}

public class FlowControl{
	public static void main(String[] args){
		
		System.out.print("A,");       //������print
		System.out.print("B,");      //����println
		System.out.println("C");
		System.out.println("world");
		double d = 12900000;
		System.out.println(d);
		double d = 3.1415926;
		System.out.printf("%.2f\n", d); //printf��ʽ��--������
		System.out.printf("%.4f\n", d);
		int n = 12345000;
		System.out.printf("n=%d, hex=%08x", n, n);
	}
}

//%d %f %e %x %s %% c������ͬ

*/
/*����
import java.util.Scanner;

public class Tmp
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); //����Scanner����
		System.out.print("Input your name: ");
		String name = scanner.nextLine();     //��ȡһ�����벢��ȡ�ַ���
		System.out.print("Input your age: ");
		int age = scanner.nextInt();          //��ȡһ�����벢��ȡ����
		System.out.printf("Hi, %s, you are %d\n", name, age);

	}
}
*/
/*Math.abs()
public class Tmp
{
	public static void main(String[] args){
		double x = 1 - 9.0/10;
		if(Math.abs(x-0.1) < 0.00001){
			System.out.println("x is 0.1");
		}else{
			System.out.println("x is not 0.1");
		}
	}
}
*/

/*�ж����������Ƿ����equals-ֵ����==

public class Tmp
{
	public static void main(String[] args){
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase(); //Сд
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2)){
			System.out.println("s1==s2");
		}else{
			System.out.println("s1!=s2");
		}
	}
}
public class Tmp
{
	public static void main(String[] args){
		String s1 = null;
		if(s1 != null && s1.equals("hello")){
			System.out.println("hello");
		}
	}
}
*/



/*��ϰ--δ�ɹ�
import java.util.Scanner;

public class Tmp
{
	public static void main(String[] args){
		//����BMIֵ

		System.out.println("�������������(kg): ");
		float weight = scanner.nextFloat();
		System.out.println("������������(m): ");
		float height = scanner.nextFloat();
		float bmi = weight / height;
		if(bmi>0&&bmi<18.5){
			System.out.println("����");
		}else if (bmi>18.5&&bmi<=25)
		{
			System.out.println("����");
		}else if (bmi>25&&bmi<=28)
		{
			System.out.println("����");
		}else if (bmi>28&&bmi<=32)
		{
			System.out.println("����");
		}else{
			System.out.println("�ǳ�����");
		}
	}
}
*/

//switch    case break default

/*����break��ʽ
public class Tmp
{
	public static void main(String[] args){
		String fruit = "apple";
		switch(fruit){
			case "apple" -> System.out.println("Selected apple");
			case "orange" -> System.out.println("Selected orange");
			case "mango" -> {
				System.out.println("Selected mango");
				System.out.println("Good choice");
			}
			default -> System.out.println("No fruit selected");
		}
	}
}

public class Tmp
{
	public static void main(String[] args){
		
		int opt;
		String fruit = "orange";
		switch(fruit){
			case "apple" : opt = 1; break;
			case "mango" : opt = 2; break;
			case "orange" : opt = 3; break;
			default : opt = 0; break;
		}
		String fruit = "orange";
		int opt = switch(fruit){
			case "apple" -> 1;
			case "mango" -> 2;
			case "orange" -> 3;
			default -> 0;

		}; //�ֺ�
		System.out.println(opt);
	}
}

*/

/*yield���
public class Tmp
{
	public static void main(String[] args){
		String fruit = "orange";
		int opt = switch(fruit){
			case "apple" -> 1;
			case "pear", "mango" -> 2;
			default -> {
				int code = fruit.hashCode();
				yield code;
			}

		};
		System.out.println(opt);
	}
}*/


//while  do-while for

/*
public class Tmp
{
	public static void main(String[] args){
		int[] ns = {1,4,9,16,25};
		
		int sum = 0;
		for(int i=0; i<ns.length; i++){
			sum += ns[i];

		}
		System.out.println(sum);
		
		for(int n : ns){  //��ns��ȡ�� for each�﷨
			system.out.println(n);
		}
	}
}
*/



//break continue















































