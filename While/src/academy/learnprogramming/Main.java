package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(5));

      /*  int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 1;
    while(true){
        if(count==5){
            break;
        }
        System.out.println("");
    }
    count=1;
    do{
        System.out.println("Count value was"+count);
        count++;
    }while(count !=6);

       */
        int count = 0;
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count == 5) {
                break;
            }
        }
        System.out.println("Count: " + count);
    }

    public static boolean isEvenNumber(int number){

    if(number%2==0){
        return true;
    }

    else{
            return false;
        }
        }
}
