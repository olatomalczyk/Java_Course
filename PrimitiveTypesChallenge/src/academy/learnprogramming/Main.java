package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByte=1;
        short myShort=20;
        int myInt=50;
        long myLong=50000+10*(myByte+myInt+myShort);
        System.out.println("Total:"+myLong);

        short shortTotal=(short)(1000+10*(myByte+myInt+myShort));
    }
}
