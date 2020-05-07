package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString= "2018";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("numberInt= " + number);

        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("numberDouble= " + numberDouble);

        numberAsString+=1;
        number+=1;
        System.out.println("number= " + number);
        System.out.println("numberAsString= " + numberAsString);


    }
}
