import java.util.Scanner;
public class prog9 
{
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            int denominator = 10 * i + 1;
            sum = sum + (1.0 / denominator);
        }

        System.out.println("Sum of series = " + sum);
    }
}