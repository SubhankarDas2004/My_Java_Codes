import java.util.Scanner;

public class prog7 
{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int evenNum = 2; // for 2,4,6,8,...
        int fact = 1;    // factorial
        int f = 1;       // counter for factorial

        System.out.println("Sequence:");

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                // Odd position → even numbers
                System.out.print(evenNum + ", ");
                evenNum += 2;

            } else {
                // Even position → factorial
                fact = fact * f;
                System.out.print(fact + ", ");
                f++;
            }
        }
    }
}
    
