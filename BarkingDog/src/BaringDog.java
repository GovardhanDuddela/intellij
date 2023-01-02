public class BaringDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if (hourOfDay <0 || hourOfDay >23){
            System.out.println();
            return false;
        }

        if (barking == true && hourOfDay <8 || hourOfDay >22){
            return true;
        }else{
            return false;
        }
    }
}



