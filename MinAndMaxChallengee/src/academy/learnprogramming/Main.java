package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner= new Scanner(System.in);

        boolean hasNextInt;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE; // = '0'

        while(true){
            System.out.println("Enter number: ");
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {

                int number = scanner.nextInt();
                scanner.nextLine();


                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            }else {  System.out.println("Invalid number");
                System.out.println("Max is equal to " + max + ". Min is equal to " + min);
                break;}

        }

        scanner.close();
    }
}
