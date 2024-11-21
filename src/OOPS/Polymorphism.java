package OOPS;

class Vehicle{
    void run(){
        System.out.println("Vehicle running");
    }
}

class Car extends Vehicle{
    @Override
    void run() {
        System.out.println("Car Running");
    }
}

class Bike extends Vehicle{
    @Override
    void run() {
        super.run();
        System.out.println("Bike Running");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        Bike bike = new Bike();
        bike.run();
    }
}
