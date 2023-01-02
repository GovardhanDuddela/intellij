public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Caluclator calculator = new Caluclator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Caluclator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}