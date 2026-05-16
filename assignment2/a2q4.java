public class a2q4 {
    public static void main(String[] args) {
        String str = "XYZ";
        char[] arr = str.toCharArray();
        int n = arr.length;
        int[] indexes = new int[n];
        
        // print first permutation
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);
        }
        System.out.println();
        
        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                // swap based on even/odd
                if (i % 2 == 0) {
                    char temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;
                } else {
                    char temp = arr[indexes[i]];
                    arr[indexes[i]] = arr[i];
                    arr[i] = temp;
                }
                
                // print current permutation
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
                
                indexes[i]++;
                i = 0;
            } else {
                indexes[i] = 0;
                i++;
            }
        }
    }
}