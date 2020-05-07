package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getLargestPrime(45);
    }
    public static int getLargestPrime(int number){
        if(number<=1){return -1;}
        int largestPrime=1;
        int dzialanie=0;
        int pierwsza=0;
        int count=0;
        int liczbapierwsza=0;
        for(int i=2; i<=number; i++){
            if(number%i==0){
                System.out.println("Sprawdzana liczba:  " + i);
                count=0;
                pierwsza=0;
                for(int j=2;j<= Math.sqrt(i);j++){
                    count++;
                    pierwsza++;
                    System.out.println("i: " + i + "/j:  " + j + "= " + (double) i/j);
                    System.out.println("count:  " + count);
                    if(i%j==0){ count--;
                    }
                    System.out.println("countpierwsza:  " + pierwsza);

                }
                if(pierwsza==count){liczbapierwsza=i;

                    System.out.println("liczba pierwsza:  " + liczbapierwsza);
                }



            }

            largestPrime=liczbapierwsza;

        }
        return largestPrime;

    }
}
