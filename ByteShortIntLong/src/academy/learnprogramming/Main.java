package academy.learnprogramming;

import java.net.SocketOption;

public class Main {

    public static void main(String[] args) {

        int myValue=10000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Int Min Value= "+myMinIntValue+"Int Max Value= "+myMaxIntValue);


        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte Min Value= "+myMinByteValue);
        System.out.println("Byte Max Value= "+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short Min Value= "+myMinShortValue);
        System.out.println("Short Max Value= "+myMaxShortValue);
        
        long myLongValue= 100;

        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long Min Value= "+myMinLongValue);
        System.out.println("Long Max Value= "+myMaxLongValue);

        long bigLongLiteralValue=2147483647284L;

        short bigShortLiteralValue=32767;

        int myTotal= (myMinIntValue/2);

        byte myNewByteValue=(byte)(myMinByteValue/2);

        short myNewShortale=(short)(myMinShortValue/2);

    }
}
