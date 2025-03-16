// Package the RV class
package dealership;

// Define the RV class
public class RV{
    public String make;
    public int year;
    public float size;
    public RV(String _make, int _year, float _size) {
        this.make = _make;
        this.year = _year;
        this.size = _size;
    }
    public String info() {
        return "{" + make + ", " + year + ", " + size + "}";
    }
    public String getMake() {
        return make;
    }
    public int getYear() {
        return year;
    }
    public float size() {
        return size;
    }
}
