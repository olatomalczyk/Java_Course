package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("Kanapka", position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Szynka", position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Parówka", position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Muffinka", position);

        score = 1000;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Dupa", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
/*
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

//POPRAWIONY ZAPIS ZEBY NIE POWIELAC SPRAWDZANIA WARUNKU

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        }
            return 4;
    }

 */

// jeszcze czytelniejszy

    public static int calculateHighScorePosition(int score) {
        int position=4;
        if (score >= 1000) {
            position= 1;
        } else if (score >= 500 ) {
            position=  2;
        } else if (score >= 100 ) {
            position=  3;
        }
        return position;
    }
}
