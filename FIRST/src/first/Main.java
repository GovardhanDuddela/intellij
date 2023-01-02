package first;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int counter=1;
        int sum=0;

        while (counter<=5){
            System.out.println("enter number"+counter+":");
            String nextNumber=scanner.nextLine();
            counter++;
        }
    }

}
