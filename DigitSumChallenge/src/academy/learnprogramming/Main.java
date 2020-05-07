package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigit(125));
        System.out.println(11211%100);
    }

 /*   public static int sumDigit(int number){
        if(number>=10){
            int sum;
            int s=number/100;
            int d=(number - s*100)/10;
            int j=number%10;
            sum=s+d+j;
            return sum;
        }
         return -1;
    }*/

    public static int sumDigit(int number){
        if(number<10) {
            return -1;
        }
        int sum=0;
        while(number>0){
            System.out.println("number: " + number);
            int digit=number%10; //12 i 5 reszty -->// 1 i 2 reszty --> // 0 i 1 reszty
            System.out.println("digit: " + digit);
            sum+=digit; // 0 + 5 --> // 5 + 2 --> // 7 + 1
            number/=10; //125/10=12 --> // 1

        }
        return sum;
    }
}
