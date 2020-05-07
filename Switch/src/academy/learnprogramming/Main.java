package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
////////////ZA POMOCĄ IF
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");

        }
///////////// ZA POMOCA SWITCH
        int switchValue = 4; //String tez mozna w ""
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:    // taki else
                System.out.println("Was not 1 or 2");
                break;
        }
//////////////CHALLENGe
        char charVariable='G';
    switch(charVariable){
        case 'A':
            System.out.println("It was A");
            break;
        case 'B':
            System.out.println("It was B");
            break;
        case 'C':
            System.out.println("It was C");
            break;
        case 'D':  case 'E':
            System.out.println("It was "+charVariable);
            break;
        default:
            System.out.println("Not found");
            break;
    }

    String month="JaNuary";
    switch(month.toLowerCase()){ // konwertuje wielkosci liter w month // można .toUpperCase()
                                //wtedy zmieniamy na duże litery
        case "january": //trzeba zmienic na male literki ( we are testing lowercase!!!)
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
            break;
    }
    }
}
