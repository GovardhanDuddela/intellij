public class PlayingDog {
    public static void main(String[] args) {
        System.out.println(isDogPlaying(true, 10));
        System.out.println(isDogPlaying(false, 36));
        System.out.println(isDogPlaying(false, 35));
    }

    public static boolean isDogPlaying(boolean summer, int tempetarure) {
        if (summer) {
            if (tempetarure >= 25 && tempetarure <= 45) {
                return true;
            } else {
                return false;
            }
        }
        if(tempetarure>=25 && tempetarure<=35){
            return true;
        }else {
            return false;
        }
    }
}
