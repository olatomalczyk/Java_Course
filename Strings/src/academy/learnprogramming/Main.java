package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //byte - bardzo rzadko ma strasznie mala pojemnosc -127 do 128
        //short  - rzadko, ma mala pojemnosc
        //int  - najczesciej uzywane
        //long
        //float
        //double  - najczesciej uzywane, podstawowy, najlepiej go uzywac zamiast float! "5.25d"
        //char
        //boolean  - najczesciej uzywane w javie przyjmuje wartosic tylko true/false
        //string - to w sumie klasa a nie primitive type
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ",and this is more."; //mozna dodawac tekst :3
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        System.out.println(myString.length());

        String lastString="10";
        int myInt= 50;
        lastString=lastString+myInt; // zamienie sie na string wiec bedzie 1050
        System.out.println(lastString);


    }


}