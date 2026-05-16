import java.util.Scanner;

public class prog13 
{
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {

            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                return; // stop after first pair
            }
        }

        System.out.println("Not possible");
    }

    // simple prime check
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
    