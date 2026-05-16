import java.util.Scanner;

public class prog4 
{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int a = 0, b = 1; // Fibonacci
        int power = 2;    // Powers of 2

        System.out.println("Sequence:");

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                // print Fibonacci
                System.out.print(a + ", ");

                int next = a + b;
                a = b;
                b = next;

            } else {
                // print power of 2
                System.out.print(power + ", ");
                power = power * 2;
            }
        }
    }
}