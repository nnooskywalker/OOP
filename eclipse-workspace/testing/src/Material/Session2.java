package Material;

import java.util.Scanner;

public class Session2 {
	public static void main(String[] args) {
//======================================STRING=================================================
		
		Scanner sc = new Scanner(System.in);
		
		//Wrapper Class
		String s = "Hello"; // cara 1
		String s2 = new String("Hello"); // cara 2
		String s3 = String.valueOf("hai"); // cara 3
		
		Integer x = 12; // cara 1
		Integer y = Integer.valueOf(15); // cara 2
		Integer z = new Integer (18); // cara 3
		
		
		x = 120;
		System.out.println(x + 2);
		
		//Parse (type cast) string-->angka
		Integer x2 = Integer.parseInt("20");
		
		//toString (angka --> string)
		String num = Integer.toString(15);
		
		
		String name = "PPTI24   ";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.trim());
		System.out.println(name.indexOf("2"));
		System.out.println(name.replace("PPTI", "PPBP"));
		// try catch
		try {
			int a;
			a = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//		try {
		//			
		//		}catch(Exception e) {
		//			
		//		}
		
		do {
			System.out.println("Name : ");
			name = sc.nextLine();
		} while (name.length() < 5 || name.length() > 20);
		
//====================================ARRAY===================================================
		String[] nameList = new String[5];
		
		nameList[0] = "Friska";
		System.out.println(nameList[0]);
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr.length);
		
		int[][] matrix = new int[2][3];
		int [][] matrix2 = {{1,2,3},{4,5,6}};
		
		matrix[0][1] = 2;
		
		String[] list2 = nameList.clone();
		list2[0] = "Kenshin";
		
		
			
		
	}
	
}
