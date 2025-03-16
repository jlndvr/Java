// Package the Trailer class
package dealership;

// Define the Trailer class
public class Trailer{
    public String make;
    public float size;
    public float weight_capacity;
    public Trailer(String _make, float _size, float wc){
        this.make = _make;
        this.size = _size;
        this.weight_capacity = wc;
    }
    public String info() {
        return "{" + make + ", " + size + ", " + weight_capacity + "}";
    }
    public String getMake() {
        return make;
    }
    public float getSize() {
        return size;
    }
    public float weight_capacity() {
        return weight_capacity;
    }
}
