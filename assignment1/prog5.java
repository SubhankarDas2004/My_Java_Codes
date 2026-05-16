import java.util.Scanner;

public class prog5 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int a = 0, b = 1; // Fibonacci
        int neg = -1;     // negative series
        int pos = 4;      // positive special values start

        System.out.println("Sequence:");

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                // Fibonacci (odd positions)
                System.out.print(a + ", ");
                int next = a + b;
                a = b;
                b = next;

            } else {
                // Even positions
                if (i == 2) {
                    System.out.print(-1 + ", ");
                } 
                else if (i == 4) {
                    System.out.print(4 + ", ");
                } 
                else if (i == 12) {
                    System.out.print(16 + ", ");
                } 
                else {
                    System.out.print(neg + ", ");
                    neg -= 3;
                }
            }
        }
    }
}   

