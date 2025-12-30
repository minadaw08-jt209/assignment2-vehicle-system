public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Aruzhan", "DL123");
        Driver d2 = new Driver("Bauyrzhan", "DL456");

        Vehicle car = new Car("Toyota", 2022, 4, "Petrol");
        Vehicle bike = new Motorcycle("Yamaha", 2021, false);
        Vehicle truck = new Truck("Volvo", 2020, 15.5, 4);

        car.setDriver(d1);
        bike.setDriver(d1);
        truck.setDriver(d2);

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            if (v.driver != null) {
                v.driver.displayDriverInfo();
            }
            v.stopEngine();
            System.out.println();
        }
    }
}