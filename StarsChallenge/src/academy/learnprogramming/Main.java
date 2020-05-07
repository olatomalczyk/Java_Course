package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printSquareStar(8);
	// write your code here
    }

    public static void printSquareStar(int number){
        if(number<5){ System.out.println("Invalid Value");}
        else{

            for(int x=1;x<=number;x++){
                for(int y=1;y<=number;y++){`    `
                    if((x==1&&y!=1&&y!=number)||(x==number&&y!=1&&y!=number)){
                        System.out.print("*");
                    }

                    else if(y==1||y==number){
                        System.out.print("*");

                    }

                    else if(x==y&&x!=1&&x!=number){
                        System.out.print("*");
                    }

                    else if(y==number-x+1&&x!=1&&x!=number){
                        System.out.print("*");
                    }

                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();

            }

        }
    }
}
