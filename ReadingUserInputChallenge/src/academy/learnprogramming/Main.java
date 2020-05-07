package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int i=1;
        while(i<=10) {
            System.out.println("Enter number #" + i);
            boolean hasNextInt= scanner.hasNextInt();
            if (hasNextInt) {
            int number = scanner.nextInt();
            sum += number;
            i++;

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("sum: " + sum);
    }

}
