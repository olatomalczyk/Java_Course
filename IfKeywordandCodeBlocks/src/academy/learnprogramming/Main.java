package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
/*
	if(score==4000)
        System.out.println("Your score was 5000");
	else
	System.out.println("This was executed");}
    */

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		boolean newGame = true;
		int newScore = 10000;
		int newLevelCompleted = 8;
		int newbonus = 200;

		if (newGame) {
			int secondScore = newScore + (newLevelCompleted * newbonus);
			System.out.println("Your final score was " + secondScore);
		}
	}
}
