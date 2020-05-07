package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // operator: = i + ; operand: 1 i 2 ;expression: 1+2
        System.out.println("1+2= "+ result);

        result=result*10; //3*10=3-
        System.out.println(result);

        result=result/5; //30/5=6
        System.out.println(result);

        result=result%5; //the remainder of (6%5)=1;
        System.out.println(result);

        //result = result+-1
        result++;
        result--;

        // result=result+2;
        result+=2; // 1 + 2 = 3
        System.out.println(result);

        result*= 10; // 3*10 = 30

        result/= 3; // 30/3=10


        boolean isAlien=false;
        if(isAlien==true) {
            System.out.println("It is not an alien!");
        }

        int topScore=80;
        int secondtopScore=60;
        if((topScore>secondtopScore) && (topScore<100)){
            System.out.println("Greater than 2nd and less than 100!");
        }

        if((topScore>90)||(secondtopScore<=90) ){
            System.out.println("bla");
        }

        int newValue = 50;
        if(newValue==50){
            System.out.println("This is an error");
        }

        boolean isCar=false;
        if(isCar==true){
            System.out.println("This is not supposed to happen");
        }
        //inny zapis
        if(isCar){
            System.out.println("This is not supposed to happen :)");
        }
        if(isCar==false){
            System.out.println("False ");
        }
        //inny zapis
        if(!isCar){
            System.out.println("False !");
        }

        //TERNARY OPERATOR
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        //boolean wasCar= isCar==false ? true : false;
        boolean wasCar=  !isCar ? true : false;
        // Czy isCar jest rowny false? Jeśli tak, ustawi naszą zmienną wasCar na true, w przeciwnym razie ustawi na false
        // ...= Argument, który powinien zostać oceniony jako wszystkie warunki na prawda lub fałsz
        // ?  wartość, którą można przypisać do wasCar, jeśli pierwszy warunek był spełniony
        // :  co przypisać do wasCar, jesli pierwszy warunek nie byl spelniony
        if(wasCar){
            System.out.println("wasCar is true bo isCar jest false");
        }

        int ageOfClient=20;
        boolean isEighteenorOver=(ageOfClient>19) ? true : false;
        if(isEighteenorOver==true){
            System.out.println("Age of client is " + ageOfClient);
        }

        double first=20.00d;
        double second=80.00d;
        double add=(first+second) *100;
        System.out.println(add);
        double reminder=add%40.00d;
        System.out.println(reminder);

        boolean zero=(reminder==0) ? true :false;
        if(!zero) {
            System.out.println("Got some remainder");
        }


    }
}
