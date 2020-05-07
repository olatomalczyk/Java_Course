package academy.learnprogramming;

public class Vehicle {
private String size;
private String name;

private int  currentVelocity;
private int currentDirection;

    public Vehicle(String name, String size) {
        this.size = size;
        this.name = name;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }


    public int getCurrentVelocity() {
        return currentVelocity;
    }


    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");

    }
    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " direction " + currentDirection);

    }

    public void stop(){
        this.currentVelocity = 0;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
