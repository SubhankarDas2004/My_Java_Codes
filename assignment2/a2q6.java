import java.util.Scanner;

public class a2q6 {

    public static void filterText(String text, String[] badWords) {
        String result = text;

       
        for (int i = 0; i < badWords.length; i++) {
            String badWord = badWords[i];

            
            while (result.contains(badWord)) {
                result = result.replace(badWord, "***");
            }
        }

        System.out.println("Filtered text: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] badWords = {"bad", "ugly", "stupid"};

        System.out.print("Enter text: ");
        String inputText = sc.nextLine();

        
        filterText(inputText, badWords);

        sc.close();
    }
}