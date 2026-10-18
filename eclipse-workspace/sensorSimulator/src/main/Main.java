package main;
import sensor.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
	static void menu() {
		System.out.println("Main Menu");
		System.out.println("1. Register New Sensor");
		System.out.println("2. Collect Data from All Sensors");
		System.out.println("3. Show Sensor History");
		System.out.println("4. Delete Sensor");
		System.out.println("5. Exit");
		System.out.print("Choose: ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Sensor> sensorr = new ArrayList<>();
		int choose = 0;
		Random rand = new Random();
		
		while(choose != 5) {
			menu();
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				String name = null, type = null;
				int thres = 0;
				
				System.out.print("Nama: ");
				name = sc.nextLine();
				System.out.print("Tipe: ");
				type = sc.nextLine();
				if (type.equalsIgnoreCase("air quality")) {
					System.out.print("Threshold: ");
					thres = sc.nextInt();
					sc.nextLine();
					sensorr.add(new AirQuality(name, type, thres));
					System.out.println("Sensor installed!");
					break;
				}
				else if (type.equalsIgnoreCase("humidity")) {
					System.out.print("Threshold: ");
					thres = sc.nextInt();
					sc.nextLine();
					sensorr.add(new Humidity(name, type, thres));
					System.out.println("Sensor installed!");
					break;
				}
				
				sensorr.add(new Temperature(name, type));
				System.out.println("Sensor installed!");
				
				break;
			case 2:
				System.out.println("Collecting data...");
				for (Sensor s : sensorr) {
					if (s instanceof Threshold t) {
						// air quality
						if (s.getType().equals("air quality")) {
							int random = rand.nextInt(500);
							
							System.out.printf("%s -> %d AQI ",s.getName(), random);
							if (random > t.getThreshold()) {
								System.out.printf("(threshold %d, Anomali)\n",t.getThreshold());
							}
							else {
								System.out.printf("(threshold %d)\n",t.getThreshold());
							}
							s.addData(random);
						}
						//Humidity
						else if (s.getType().equalsIgnoreCase("humidity")) {
							int random = rand.nextInt(100-10+1) + 10;
							
							System.out.printf("%s -> %d%% ",s.getName(), random);
							if (random > t.getThreshold()) {
								System.out.printf("(threshold %d, anomali)\n", t.getThreshold());
							}
							else {
								System.out.printf("(threshold %d)\n",t.getThreshold());
							}
							s.addData(random);
						}
					}
					else {
						int random = rand.nextInt(60 - 10 + 1) + 10;
						System.out.printf("%s -> %dC\n",s.getName(),random);
						s.addData(random);
					}
				}
				break;
			case 3:
				System.out.println("History: ");
				for(Sensor s : sensorr) {
					System.out.print(s.getName() + " -> [");
					
					for(int h : s.getHistory()) {
						//temperature
						if (s.getType().equalsIgnoreCase("temperature")) {
							System.out.printf("%dC, ",h);
						}
						else {
							if (s instanceof Threshold t) {
								//air quality
								if (s.getType().equalsIgnoreCase("air quality")) {
									if (h > t.getThreshold()) {
										System.out.printf("%d AQI*, ",h);
									}
									else {
										System.out.printf("%d AQI, ",h);
									}
								}
								//humidity
								else if (s.getType().equalsIgnoreCase("humidity")) {
									if (h > t.getThreshold()) {
										System.out.printf("%d%%*, ",h);
									}
									else {
										System.out.printf("%d%%, ",h);
									}
								}
							}
						}
					}
					System.out.println("]");
					
				}
				break;
			case 4:
				if (sensorr.isEmpty()) {
					System.out.println("List is Empty");
				}
				else {
					int idx = 1;
					System.out.println("Available Sensor: ");
					for(Sensor s : sensorr) {
						System.out.printf("%d. %s (%s)\n",idx++, s.getName(), s.getType());
					}
					System.out.print("Choose: ");
					int del = sc.nextInt();
					sc.nextLine();
					String sensorDel = sensorr.get(del-1).getName();
					sensorr.remove(del-1);
					System.out.println("Sensor " + sensorDel + " deleted successfully");
				}
				break;
			case 5:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Input not valid");
				break;
			}
		}

	}

}
