package academy.learnprogramming;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear+ " gear.");
        this.currentGear = currentGear;
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity():Velocity "+speed+" direction "+direction);
        super.move(speed,direction);
    }


}
