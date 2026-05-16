public class a2q5
{
    public static void checkAnagram(String s, String t) {
        // Check if lengths are same
        if (s.length()!= t.length()) {
            System.out.println("false");
            return;
        }

        // Array to count letters a to z
        int[] count = new int[26];

        // Count letters from first word
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a'] = count[ch - 'a'] + 1;
        }

        // Subtract letters using second word
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            count[ch - 'a'] = count[ch - 'a'] - 1;
        }

        // Check if all are zero
        for (int i = 0; i < 26; i++) {
            if (count[i]!= 0) {
                System.out.println("false");
                return; 
            }
        }

        System.out.println("true");
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.print("s = " + s1 + ", t = " + t1 + "\n");
        checkAnagram(s1, t1); 
        String s2 = "rat";
        String t2 = "car";
        System.out.print("s = " + s2 + ", t = " + t2 + "\n");
        checkAnagram(s2, t2); 
    }
}
