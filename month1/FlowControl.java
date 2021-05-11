//流程控制


/*输入和输出
println("");
print();
printf();格式化输出


public class Tmp
{
	public static void main(String[] args){
		System.out.print("A,");
		System.out.print("B.");
		System.out.println("\nEND");
		final double pi = 3.141593; //final的用法
		System.out.printf("%.3f", pi);
		//两个输出参数
		int n = 12345000;
		System.out.printf("\nn=%d, hex=%08x", n, n);
	}
}

public class FlowControl{
	public static void main(String[] args){
		
		System.out.print("A,");       //不换行print
		System.out.print("B,");      //换行println
		System.out.println("C");
		System.out.println("world");
		double d = 12900000;
		System.out.println(d);
		double d = 3.1415926;
		System.out.printf("%.2f\n", d); //printf格式化--不换行
		System.out.printf("%.4f\n", d);
		int n = 12345000;
		System.out.printf("n=%d, hex=%08x", n, n);
	}
}

//%d %f %e %x %s %% c语言中同

*/
/*输入
import java.util.Scanner;

public class Tmp
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); //创建Scanner对象
		System.out.print("Input your name: ");
		String name = scanner.nextLine();     //读取一行输入并获取字符串
		System.out.print("Input your age: ");
		int age = scanner.nextInt();          //读取一行输入并获取整数
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

/*判断引用类型是否相等equals-值类型==

public class Tmp
{
	public static void main(String[] args){
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase(); //小写
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



/*练习--未成功
import java.util.Scanner;

public class Tmp
{
	public static void main(String[] args){
		//计算BMI值

		System.out.println("请输入你的体重(kg): ");
		float weight = scanner.nextFloat();
		System.out.println("请输入你的身高(m): ");
		float height = scanner.nextFloat();
		float bmi = weight / height;
		if(bmi>0&&bmi<18.5){
			System.out.println("过轻");
		}else if (bmi>18.5&&bmi<=25)
		{
			System.out.println("正常");
		}else if (bmi>25&&bmi<=28)
		{
			System.out.println("过重");
		}else if (bmi>28&&bmi<=32)
		{
			System.out.println("肥胖");
		}else{
			System.out.println("非常肥胖");
		}
	}
}
*/

//switch    case break default

/*不用break方式
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

		}; //分号
		System.out.println(opt);
	}
}

*/

/*yield语句
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
		
		for(int n : ns){  //从ns中取出 for each语法
			system.out.println(n);
		}
	}
}
*/



//break continue















































