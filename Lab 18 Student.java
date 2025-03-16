// Package the Student class
package school;
// Define the Student class
public class Student{
    public String name;
    public String email;
    public static int school_id;
    public Student(String _name, String _email){
        this.name = _name;
        this.email = _email;
    }
    public void studentInfo(){
        System.out.println("{ " + name + ", " + email + ", " + school_id + " }");
    }
}
