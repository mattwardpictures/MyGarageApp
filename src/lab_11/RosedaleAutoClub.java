package lab_11;

import java.util.ArrayList;
import java.util.Scanner;

public class RosedaleAutoClub {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Car g70 = new Car();
		g70.setMake("Hyundai");
		g70.setModel("G70");
		g70.setPrice(32000);
		g70.setYear(2018);

		Car mirai = new Car();
		mirai.setMake("Toyota");
		mirai.setModel("Mirai");
		mirai.setPrice(59285);
		mirai.setYear(2019);

		Car model3 = new Car();
		model3.setMake("Tesla");
		model3.setModel("Model 3");
		model3.setPrice(50200);
		model3.setYear(2019);

		UsedCar a6 = new UsedCar();
		a6.setMake("Audi");
		a6.setModel("A6 4.2");
		a6.setPrice(6995);
		a6.setYear(2007);
		a6.setMileage(145144);

		UsedCar m3 = new UsedCar();
		m3.setMake("BMW");
		m3.setModel("E90 M3");
		m3.setPrice(18999);
		m3.setYear(2008);
		m3.setMileage(100396);

		UsedCar panamera = new UsedCar();
		panamera.setMake("Porsche");
		panamera.setModel("Panamera 4S");
		panamera.setPrice(24790);
		panamera.setYear(2010);
		panamera.setMileage(141256);

		ArrayList<Car> usedCarLot = new ArrayList<>();
		usedCarLot.add(g70);
		usedCarLot.add(mirai);
		usedCarLot.add(model3);
		usedCarLot.add(a6);
		usedCarLot.add(m3);
		usedCarLot.add(panamera);

		System.out.println("==================");
		System.out.println("    Welcome to    ");
		System.out.println("ROSEDALE AUTO CLUB");
		System.out.println("==================");
		System.out.println("");

		System.out.printf("%-15s %-15s %-10s %-15s %-15s %n", "MAKE", "MODEL", "YEAR", "PRICE", "MILEAGE");
		System.out.println("=========================================================================");

		for (Car car : usedCarLot) {
			System.out.println(car);
		}

		scan.close();
	}

}
