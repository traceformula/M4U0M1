package lesson5.lecture.factorypatternexample;

public class VehicleFactory {
	
	// getting object using Enum
	public Vehicle getVehicle( VehicleType vehicleType){
		return vehicleType.getVehicle();
	}
	
	// getting object using switch
	public Vehicle getVehicleIns(String vehicleType){
		String type = vehicleType.toUpperCase();
		switch(type) {
		case "CAR":
			return new Car();
		case "ELECTRICAR": 
			return new ElectricCar();
		case "TRUCK":
			return new Truck();
		}
		return null;
	}
	}

