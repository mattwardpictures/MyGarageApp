package lab_11;

import java.util.Scanner;

public class MyGarageApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("==========================");
		System.out.println("Welcome to GARAGE LIST APP");
		System.out.println("==========================");

		int arrayLength;
		System.out.println("\nHow many cars would you like to enter?");
		arrayLength = scan.nextInt();

		Car[] carLot = new Car[arrayLength];

		System.out.println("\nPlease enter car info.:\n");

		for (int i = 0; i < carLot.length; i++) {
			System.out.println("Please enter Car #" + (i + 1) + "'s MAKE: ");
			String carMake = scan.next();
			System.out.println("Please enter Car #" + (i + 1) + "'s MODEL: ");
			String carModel = scan.next();
			System.out.println("Please enter Car #" + (i + 1) + "'s YEAR: ");
			int carYear = scan.nextInt();
			System.out.println("Please enter Car #" + (i + 1) + "'s PRICE: ");
			double carPrice = scan.nextDouble();
			carLot[i] = new Car(carMake, carModel, carYear, carPrice);
		}
		System.out.println("\nGARAGE INVENTORY");
		System.out.println("=======================================================");
		for (Car car : carLot) {
			System.out.println(car.toString());
		}

		scan.close();
	}

}
