public class SumChallange {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
                count++;
                System.out.println(i);
            }
                if (count == 5) {
                break;
            }

        }
        System.out.println("the first "+count+ " sum value is:"+sum);
        System.out.println("the total count value is:"+count);

        System.out.println(sum);
    }

}