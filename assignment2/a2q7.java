import java.util.Scanner;

public class a2q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int flag = 0;
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = 1;
                }
            }
        }
        
        if (flag == 0) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("String contains duplicate characters.");
        }
    }
}