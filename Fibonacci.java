import java.util.Arrays;

public class Fibonacci {
    private static final int LENGTH = 7;

    public static void main(String[] args) {
        int[] fib = new int[LENGTH];
        fib[0] = fib[1] = 1; // First 2 Fibonacci numbers
        for (int i = 2; i < LENGTH; i++) fib[i] = fib[i - 2] + fib[i - 1];
        System.out.println(Arrays.asList(fib));
    }
}