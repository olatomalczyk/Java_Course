package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double average = 0.0000;
            int sum = 0;
            int i = 0;
            boolean hasNextInt;
            while (true) {
                hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    i++;
                    sum += number;
                    average =(double) sum / i;
                    System.out.println(" AVG = " +average);

                } else {
                    System.out.println("SUM = " + sum + " AVG = " +Math.round(average));
                    break;
                }


            }
            scanner.close();
        }
    }

