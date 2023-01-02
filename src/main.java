import static java.lang.Math.round;

public class main {
    public static void main(String[] args) {
      double miles= SpeedConvertor.toMilesPerHour(10.5);
        System.out.println("Miles="+miles);
        System.out.println(round(1.609));
        System.out.println(round(10.5/1.609));
    }
}
