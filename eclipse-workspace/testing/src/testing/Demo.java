package testing;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Demo{
	private static final String Scanner = null;

	public static void main (String[] args) {
		int age = 21;
		String name = "Hello PPTI 24 " + "Week 1";
		String json = """
		{
		   'name' : 'Jason';
		   'class' : 'kelazzz'; 
				}""";
		
		char c = 'A';

//		//output
//		System.out.println(age);
//		System.out.println(name);
//		System.out.printf("Age : %d, Name : %s\n", age, name);
//		System.out.println(json);
		int num1, num2;
		
		
		//Extension
		try {
//			System.out.println("Input Usia : ");
//			age = sc.nextInt();
//			sc.nextline();
			System.out.println(12/0);
			
		}catch(Exception e) {
			System.out.println("Input harus angka");
			age = 0;
		}
		
		//Input
		//1. Buat objek Scanner + import lib nya
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		
		//2. Bisa input pakai method Scanner
		System.out.print("Input nama: ");
		name = scan.nextLine();
		System.out.print("Input Usia: ");
		age = scan.nextInt();
		scan.nextLine();
		
		
		//switch statement
		String grade = "A";
		
		
		int score = switch(grade) {
		case "A" -> 90;
		case "B" -> 80;
		case "C" -> 70;
		default -> {
			System.out.println("Unknown grade");
			yield 0;
		}
		
		};
		
		System.out.println(score);
		
		System.out.println(Math.floor(3.5));
		System.out.println(Math.random()*10);
		
		//Class random
		Random rand = new Random();
		
		System.out.println(50 + rand.nextInt(50+1));

		//2.5 --> 3 (round)
		//2.5 --> 2 (rint)
		
		
		
		
		
		
		
}

}