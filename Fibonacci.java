// Print the first 100 numbers in the Fibonacci sequence.

public class Fibonacci {

    public static void main(String[] args) {

        double a = 0, b = 1;
        System.out.println(a + "\n" + b);
        // 0 and 1 are the first two numbers in the sequence, 98 more need to be generated.
        for (int count = 0; count < 98; count++) {
            double sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
