public class Dealership {
    public static void main(String[] args) throws Exception {
        // Test your code here.
        // Create multiple Car objects and call the is_new() method.
        Car car1 = new Car("Civic", "Honda", 2025);
        System.out.println("Car1 Year: " + car1.getYear());
        System.out.println("Car1 " + car1.info());
        System.out.println("Status: " + car1.is_new());
    }
}

// Write your Car class in the Car.java file
