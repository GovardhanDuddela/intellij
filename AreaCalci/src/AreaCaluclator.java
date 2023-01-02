import static java.lang.Math.PI;

public class AreaCaluclator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println( area(5.0,4.0));
    }
    public static double area(double radius){
        double areaOfCircle;
        if(radius<0){
            return -1;
        }
        else{
           return areaOfCircle=radius*radius*PI;
        }
    }
    public static double area(double x,double y){
        double areaOfRectangle;
        if(x<0 && y<0){
            System.out.println("invalid value");
            return -1;
        }
        else{
             return areaOfRectangle=x*y;
        }
    }
}
