// Import the Car, RV, and Trailer classes from the dealership package.
import dealership.Car;
import dealership.RV;
import dealership.Trailer;
public class Main {
    public static void main(String[] args) throws Exception {
        // Test your code here.
        // Create a Car, RV, and Trailer objects.
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2022);
        System.out.println("Car: " + car.make + " " + car.model + " " + car.year);

        // Create an RV object
        RV rv = new RV("Winnebago", 2021, 32.5f);
        System.out.println("RV: " + rv.make + " " + rv.year + " " + rv.size + " feet");

        // Create a Trailer object
        Trailer trailer = new Trailer("Airstream", 28.0f, 5000.0f);
        System.out.println("Trailer: " + trailer.make + " " + trailer.size + " feet, " + trailer.weight_capacity + " lbs capacity");
    }
}
