public class prog15 
{
     public static void main(String[] args) {

        System.out.println("5 Random Numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = (int)(Math.random() * 100) + 1;
            System.out.print(num + " ");
        }
    }
}
    
