import java.util.Scanner;

public class prog1 
{
    public static void main(String[] args) {
        int n = 10; // number of terms
        int a=0, b=1;
        int sum=0;
        System.out.println("Fibonacci Sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a+ " ");
            sum = sum + a;

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\nSum of Fibonacci numbers = " + sum);
    }
}
