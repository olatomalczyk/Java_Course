package academy.learnprogramming;

public class Main {

    //CONST
    private static final String INVALID_VALUE_MESSAGE="Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,60));
        System.out.println(getDurationString(-1));

    }

    public static String getDurationString(long minutes, long seconds){
        if(minutes<0 || seconds<0 || seconds>59){
           return INVALID_VALUE_MESSAGE;
        }
        else{

             long hour=minutes/60;
             minutes=minutes%60;

             String hoursString=hour+"h ";
             if(hour<10){
                 hoursString="0"+hoursString;
             }
            String minutesString=minutes+"m ";
            if(minutes<10){
                minutesString="0"+minutesString;
            }
            String secondsString=seconds+"s";
            if(seconds<10){
                secondsString="0"+secondsString;
            }


            return hoursString+minutesString+ secondsString;

        }
    }
    public static String getDurationString(long seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        else{
            long minutes=seconds/60;
            seconds=seconds%60;
            return getDurationString(minutes,seconds);
        }
    }

}
