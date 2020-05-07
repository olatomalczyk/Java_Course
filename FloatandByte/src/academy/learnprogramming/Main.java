package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    //INT FLOAT i DOUBLE
        int myIntValue=5/3; //zaokragla do 2
        float myFloatValue=5f/3f;
        double myDoubleValue=5.0/3.0;
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFValue= "+myFloatValue);
        System.out.println("MyDValue= "+myDoubleValue);
        // WNIOSKI : Podstawowy jest double a nie float i ogolnie jest lepszy wiec lepiej go uzywac
        //challenge 1
        double pound=200d;
        double kilo=pound*0.45359237d;
        System.out.println(pound + " pounds= "+kilo+" kg ");

     //CHAR i STRING
         char myChar= 'D';
         char myUnicodeChar= '\u0044'; // unicode-table.com '\u...' sugeruje javie ze to unicode
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
         char myCopyright= '\u00A9';   // dzieki unicode mozemy uzywac znakow nieznajdujących sie na klawiaturze
        System.out.println(myCopyright);
     // BOOLEAN w javie = tylko true/false
        boolean myTrueB= true;
        boolean myFalseB= false;

        boolean isCustomerOver21= true;




    }

}
