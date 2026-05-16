import java.util.Scanner;

public class prog14 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int o = num;
        int r = 0;

        while (num > 0) {
            int digit = num % 10;       
            r = r * 10 + digit; 
            num = num / 10;             
        }

        if (o==r) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
    
