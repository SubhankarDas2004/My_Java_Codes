public class prog2 
{
      public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 1000:");

        for (int num = 1; num <= 1000; num++) {
            int count = 0;

            // check if num is prime
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            // prime numbers have exactly 2 factors
            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}
    
