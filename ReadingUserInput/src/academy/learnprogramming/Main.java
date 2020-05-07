package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

       /* if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character czyli enter
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else{
            System.out.println("Invalid year of birth");

        }*/

       boolean hasNextInt;
       do {
           System.out.println("Enter your year of birth: ");
           hasNextInt = scanner.hasNextInt(); // sprawdza czy kolejna wpisana wartość to Int
           if (hasNextInt) {
               int yearOfBirth = scanner.nextInt();
               scanner.nextLine(); //handle next line character czyli enter
               System.out.println("Enter your name: ");
               String name = scanner.nextLine();
               int age = 2020 - yearOfBirth;

               if (age >= 0 && age <= 100) {
                   System.out.println("Your name is " + name);
                   System.out.println("Your age is " + age);
               } else {
                   System.out.println("Invalid year of birth");
               }

           } else {
               System.out.println("Invalid number");
           }
           scanner.nextLine();

       }while(!hasNextInt);
        scanner.close(); //zamkniecie skanera
    }
}

