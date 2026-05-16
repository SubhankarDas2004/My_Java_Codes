public class prog3 
{
    public static void main(String[] args) {

        int a = 0, b = 1;
        int count = 0; // to count prime Fibonacci numbers

        System.out.println("Fibonacci sequence with first 8 prime numbers:");

        while (count < 8) {
            int next = a + b;

            // check if 'next' is prime
            if (isPrime(next)) {
                System.out.print(next + " ");
                count++;
            }

            a = b;
            b = next;
        }
    }

    // function to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) 
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    

