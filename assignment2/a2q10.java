import java.util.Scanner;

public class a2q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter URL: ");
        String url = sc.nextLine();

    
        String domain = url;
        if (domain.startsWith("http://")) {
            domain = domain.substring(7); 
        } else if (domain.startsWith("https://")) {
            domain = domain.substring(8);
        }

        if (domain.startsWith("www.")) {
            domain = domain.substring(4); 
        }

        
        int rmv = domain.indexOf("/");
        if (rmv != -1) {
            domain = domain.substring(0, rmv);
        }

        System.out.println("Domain: " + domain);

    }
}