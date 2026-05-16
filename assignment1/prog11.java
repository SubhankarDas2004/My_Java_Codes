import java.util.Scanner;

public class prog11 
{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println("Result = " + result);
    }
}
    
