package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    //musimy storzyć lokalne zmienne, lokalne dla main
        Car porsche = new Car(); // stworztlismy obiekt Porshe oparty na szablonie Car
        Car holden = new Car();
        //porsche.model = "Carrera"; // jeden ze sposobow dostepu do danych ale musi byc w klasie public (niepraktyczne)
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel()); //uknown bo nie carrera co uwzglednilismy w klasie Car

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        holden.setModel("Commodore");
        System.out.println("Model is " + holden.getModel());
        System.out.println("Model is " + porsche.getModel());

    }
}
