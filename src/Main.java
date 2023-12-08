
public class Main {
    public static void main(String[] args) {

        double[] numbers = {12.9, 8.32, 89.6, 56.2, 76.5, 99.3, -41.89, -23.6, 4.9, -13.7, 49.7, 10.4, 81.4, 99.5, -95.46};
        boolean negative = false;
        double sum = 0;
        int count = 0;

        for (double i : numbers) {
            if (negative && i > 0) {
                sum += i;
                count++;
            }
            if (i < 0) {
                negative = true;
            }
        }

        double avg = sum / count;
        System.out.println("Average arithmetic " + avg);
    }
}