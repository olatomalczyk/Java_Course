package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year=1924;
        boolean odpowiedz=isLeapYear(year);
        System.out.println(odpowiedz);
    }


        public static boolean isLeapYear(int year) {

            if (year < 1 || year > 9999) {
                return false;
            } else {

                if (year % 4 == 0) {
                    System.out.println("%4");
                    if (year % 100 == 0) {
                        System.out.println("%100");
                        if (year % 400 == 0) {
                            System.out.println("%400");
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }

                } else {
                    return false;
                }

            }
        }


}
