package lab_11;

public class UsedCar extends Car {

	private double mileage;

	public UsedCar() {
		super();

	}

	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);

	}

	public UsedCar(double mileage) {
		super();
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("(Used) %-15s", getMileage());
	}

}
