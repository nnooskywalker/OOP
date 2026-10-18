package Tugas;

import java.util.Scanner;

public class Tugas1_ReyhanNinoPPTI24 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, k = 0;
		int max = -999999;
		String name;
		String temp = null;
		String[] saveEmail = new String[100];
		String[] saveNama = new String[100];

	while(num != 3) {
		System.out.println("1. Insert employee data");
		System.out.println("2. View all employees");
		System.out.println("3. Exit");
		num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
				System.out.print("Enter employee (name;email): ");
				name = sc.nextLine();
				
				if (!name.contains(";")) {
					System.out.println("Invalid Format!");
					continue;
				}
				
				String[] data = name.split(";");
				String email = data[1];
				String nama = data[0];
				
				if (!email.contains("@")) {
					System.out.println("Invalid email! Must contain '@'.");
					continue;
				}
				else {
					saveEmail[k] = email;
					saveNama[k] = nama;
					if (nama.length() > max) {
						max = nama.length();
						temp = nama;
					}
					
					k++;
					System.out.println("Data Saved.");
				}
				
			break;
		case 2:
			if (k == 0) {
				System.out.println("Empty");
				continue;
			}
			else {
				for(int i = 0; i < k; i++) {
					System.out.println((i+1) + ". " + saveNama[i] + "-" + saveEmail[i]);
				}
			}
			
			System.out.println("Total Employees : " + k);
			System.out.printf("Longest Name : %s (%d characters)\n",temp.toUpperCase(),max);
			
			break;
		case 3:
			System.out.println("Exiting....");
			break;
			
		}
	}
		
		
	}
}
