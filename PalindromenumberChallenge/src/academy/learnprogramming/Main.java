package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        System.out.println(isPalindrome(12021));

    }


    public static boolean isPalindrome(int number){
        int reverse=0;

        if(number<0){
        number=number*(-1);
        }

        int num=number;
        int remainder=0;

        while(number>0){
            System.out.println("number " + number);

            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number/= 10;



        System.out.println("reverse " + reverse);
        System.out.println("----------------");
        }
        if(num==reverse){
            return true;}

        return false;
    }
}

