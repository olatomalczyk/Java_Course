package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        /*System.out.println("10,000 at 2% interest= " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest= " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest= " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest= " + calculateInterest(10000.0, 5.0));
*/
        System.out.println("*********zliczanie w góre******************");
        for (int i = 2; i < 9; i++) {     ///sting.format przyblizylo wynik do 2 cyfr po przecinku
            System.out.println("10,000 at " + i + "% interest= " + String.format("%.2f", calculateInterest(10000.0, i)));

        }
        System.out.println("*********zliczaniew dół******************");

        for (int i = 8; i > 1; i--) {     ///string.format przyblizylo wynik do 2 cyfr po przecinku
            System.out.println("10,000 at " + i + "% interest= " + String.format("%.2f", calculateInterest(10000.0, i)));

        }

        System.out.println("************is number Prime?***************");
        int j=0;
        for(int i=10; i<50;i++){
            if(isPrime(i)){
                System.out.println("Number "+i+" is a prime number");
                j++;
                if(j==3) break;
            }

        }
    }


        public static boolean isPrime(int n){

            if(n==1){
                return false;
            }
            for(int i=2; i<= (long) Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }



    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
}
