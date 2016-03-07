package lesson5.lecture.factorypatternexample;

public class App {
	public static void main(String args[]){
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();
		
		Vehicle truck = vehicleFactory.getVehicleIns("truck");
		truck.startEngine();
		
	}
}
