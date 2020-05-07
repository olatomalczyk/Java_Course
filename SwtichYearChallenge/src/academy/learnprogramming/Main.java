package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int month=2;
        int year=2020;
        System.out.println(isLeapYear(year));
        System.out.println(getDaysInMonth(month,year));
    }
   public static boolean isLeapYear(int year){

        if(year<1 || year>9999){
            return false;
        }

        else{

            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    else { return false;}
                }
                else {return true;}
            }
            else{ return false;}

        }

    }

    public static int getDaysInMonth(int month, int year){
            boolean state=isLeapYear(year);
            if(month<1 || month>12 || year<1 || year>9999){ return -1;}

            else{
                if (state == true) {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;

                        case 2:

                            return 29;

                        default:
                            return 30;

                    }
                } else if (state == false) {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;

                        case 2:
                            return 28;

                        default:
                            return 30;

                    }
                }

            return -1;
            }
        }

}

