// Print the first 100 numbers in the Fibonacci sequence.

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        // First two numbers of the sequence are 0 and 1.
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        System.out.println(a);
        System.out.println(b);
        // Calculate and print the next 98 numbers in the sequence.
        for (int count = 0; count < 98; count++) {
            BigInteger sum = a.add(b);
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
