import java.util.Scanner;

public class a2q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > 0) {
              
                String firstLetter = word.substring(0, 1).toUpperCase();

                String restOfWord = word.substring(1).toLowerCase();

                result = result + firstLetter + restOfWord + " ";
            }
        }
        result = result.trim();

        System.out.println("Title Case: " + result);


    }
}