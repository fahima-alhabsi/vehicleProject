
public class Truck extends Vehicle {

	private Integer numberOfAxles;
	private Integer capacityInTons;
	
	
	public Integer getNumberOfAxles() {
		return numberOfAxles;
	}


	public void setNumberOfAxles(Integer numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}


	public Integer getCapacityInTons() {
		return capacityInTons;
	}


	public void setCapacityInTons(Integer capacityInTons) {
		this.capacityInTons = capacityInTons;
	}


	 void laod(Integer weightOfTheLoad ) {
		System.out.println("Loaded "+ weightOfTheLoad+ " tons ");
	
	}
	
	
}
