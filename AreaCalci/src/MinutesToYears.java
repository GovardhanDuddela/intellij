public class MinutesToYears {
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes){
        long years,days;
        if(minutes<0){
            System.out.println("invalid value");
        }
        else{
            long hours=minutes/60;
            days=hours/24;
            years=days/365;
            long d=days%365;
            System.out.println(minutes+" min "+" = "+years+" y "+" and "+d+" d");
        }
    }
}
