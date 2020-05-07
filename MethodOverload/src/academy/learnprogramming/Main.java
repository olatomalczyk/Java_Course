package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
     calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);
    }


    ///////// TRZEBA ZMIENIC ILOSC PARAMETROW ZEBY UZYWAC TEJ SAMEJ NAZWY METODY
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }


    public static int calculateScore(int score){
        System.out.println("Unnamed player "+score+" points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No player name,no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || inches<0 || inches>12){
            return -1;
        }
        else{
            double centimetersfromfeet=(feet*12)*2.54;
            centimetersfromfeet+= inches*2.54;
            System.out.println( feet + "feet,"+inches+"inches = " + centimetersfromfeet + " cm");

            return centimetersfromfeet;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        else {
            double feet =(int) inches / 12;
            double remainingInches=(int)inches%12;
            System.out.println(inches + " inches = " + feet + "feet and" + remainingInches+" inches" );
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
    }


}
