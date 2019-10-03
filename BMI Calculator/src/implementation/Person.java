package implementation;

public class Person {

	public String NAME;
	public double WEIGHT;
	public double HEIGHT;

	public Person(String name) {
		this.NAME = name;
	}

	public void setWeight(double weight) {
		if (weight <= 0) {
			throw new IllegalArgumentException();
		}
		this.WEIGHT = weight;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			throw new IllegalArgumentException();
		}
		this.HEIGHT = height;
	}

	public String getName() {
		return NAME;
	}

	public double getWeight() {
		return WEIGHT;
	}

	public double getHeight() {
		return HEIGHT;
	}

	public double getBMI() {
		double k = WEIGHT;
		double m = HEIGHT;
		double m2 = m * m;
		double result = k / m2;
		double result2 = Math.round(result * 10);
		double resultfinal = result2 / 10;
		return resultfinal;
	}

	public String getInterpretationOfBMI() {
		String result = "";
		if (this.getBMI() < 18.5) {
			result = "underweight";
		}
		if (this.getBMI() >= 18.5 && this.getBMI() < 25.0) {
			result = "normal";
		}
		if (this.getBMI() >= 25.0 && this.getBMI() < 30.0) {
			result = "overweight";
		}
		if (this.getBMI() >= 30.0) {
			result = "obese";
		}
		return result;
	}

}
