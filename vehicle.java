public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void startEngine() {
        System.out.println("Starting vehicle engine...");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting car engine...");
    }
}

class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    public void setCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }

    @Override
    public void startEngine() {
        System.out.println("No engine to start. Pedal to go!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2023, 4);
        Vehicle bike = new Bike("Trek", "Marlin", 2022, true);

        System.out.println("Car Information:");
        car.displayInfo();
        car.startEngine();

        System.out.println("\nBike Information:");
        bike.displayInfo();
        bike.startEngine();

        Vehicle myCar = new Car("Honda", "Civic", 2021, 4);
        Vehicle myBike = new Bike("Specialized", "Stumpjumper", 2020, false);

        displayVehicleInfo(myCar);
        displayVehicleInfo(myBike);
    }

    public static void displayVehicleInfo(Vehicle vehicle) {
        vehicle.displayInfo();
        vehicle.startEngine();
    }
}
