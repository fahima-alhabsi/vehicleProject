



public class ElectricVehicle {

	
	private Integer batteryCapacity;
	private Integer chargeLevel;
	public Integer getBatteryCapacity() {
	return batteryCapacity;
	}
	public void setBatteryCapacity(Integer batteryCapacity) {
	this.batteryCapacity = batteryCapacity;
	}
	public Integer getChargeLevel() {
	return chargeLevel;
	}
	public void setChargeLevel(Integer chargeLevel) {
	this.chargeLevel = chargeLevel;
	}
	void charge() {
	Integer newChargeLevel= getBatteryCapacity();
	newChargeLevel++;
	setBatteryCapacity(newChargeLevel);
	}
	 void drive(Integer numberOfMilesDriven) {
	System.out.println("Electric Vehicle driven " + numberOfMilesDriven + " miles.");
	};
	
}
