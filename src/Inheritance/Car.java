package Inheritance;


//Access modifiers for the class
    //public: Any other class in any package can access this class
    //      : When omitted. Package private access

//Access modifiers for class members
    //public: any other class in package can access this class
    //protected: allows classes in the same package & subclasses in other packages to have access to the member
    //        : omitted. package access. only classes in the same package can access
    //private: no other class can access this member
        //(go always with this) (encapsulation)
public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + color +  make+  model + convertible);
    }
}
