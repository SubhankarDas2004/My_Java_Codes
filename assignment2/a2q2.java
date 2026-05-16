public class a2q2 {
    public static int CheckPassword(char str[], int n) {
        if (n < 4) {
            return 0;
        }
        
        if (str[0] >= '0' && str[0] <= '9') {
            return 0;
        }
        
        boolean hasDigit = false;
        boolean hasUpper = false;
        
        for (int i = 0; i < n; i++) {
            char ch = str[i];
            
            if (ch == ' ' || ch == '/') {
                return 0;
            }
            
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
        }
        
         if (hasDigit && hasUpper) 
            {
                return 1;
            } 
        else 
            {
                return 0;
            }
    }
    
    public static void main(String[] args) {
        char[] s1 = {'a', 'A', '1', '_', '6', '7'};
        System.out.println(CheckPassword(s1, s1.length)); // 1
        
        char[] s2 = {'a', '9', '8', '7', ' ', 'a', 'b', 'C', '0', '1', '2'};
        System.out.println(CheckPassword(s2, s2.length)); // 0
    }
}