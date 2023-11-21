package Polymorphism.Composition.ComputerFactory;

//use composition is preferred over inheritance
//Composition is flexible
public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2002", "Dell");
        Monitor monitor = new Monitor("23 inch", "Acer");
        Motherboard motherboard = new Motherboard("34-DC", "Asus");
        PersonalComputer personalComputer = new PersonalComputer("1", "dell", computerCase, monitor, motherboard);

        personalComputer.powerUp();
    }
}
