
public class Vehicle extends Engine implements Honkable {
	private Integer year;
	private String color;
	private Integer numberOfWheels;
	private Integer weight;
	private Integer make;
	private String model;

	public Integer getMake() {
		return make;
	}

	public void setMake(Integer make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	
	 void start() {
		System.out.println("Vehicle started.");
	};

	 void stop() {
		System.out.println("Vehicle stopped.");
	};

	 void drive(Integer numberOfMilesDriven) {
		System.out.println("Vehicle driven " + numberOfMilesDriven + " miles.");
	};

	public void honk() {
		System.out.println("Honk Honk!");
	};

}
