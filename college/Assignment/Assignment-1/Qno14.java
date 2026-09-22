public class Qno14 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum = sum + i;
            i++;
        }

        double average = sum / 100.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
