// Write your Car class here.
public class Car{

    public String make;
    public String model;
    public  int year;

    public Car(String Make, String Model, int Year){
        this.make = Make;
        this.model = Model;
        this.year = Year;
    }
    public String info(){
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
    public boolean is_new(){
        return year >= 2025;
    }

}
