// Package the Car class
package dealership;

// Define the Car class
public class Car{
    public String make;
    public String model;
    public int year;
    public Car(String _make, String _model, int _year) {
        this.make = _make;
        this.model = _model;
        this.year = _year;
    }
    public String info() {
        return "{" + make + ", " + model + ", " + year + "}";
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}
