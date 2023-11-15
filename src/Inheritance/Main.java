package Inheritance;

public class Main {
    public static void main(String[] args){

        //constructor
            //default constructor //no parameters
        Car car = new Car();
        car.setMake("Hyundai");
        car.describeCar();

        //constructor
        Car paramCar = new Car("Honda", "Accord");

        Car oneCar = new Car("one");
        Car secondCar = new Car("second");
        oneCar.printName(); // second
        secondCar.printName(); //second

        //static methods
        Car.printSumOfWheels(2, 4);

    }
}
