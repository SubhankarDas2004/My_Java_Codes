public class a2q1 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i)!= c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    
    public static void main(String[] args) {
        a2q1 sol = new a2q1();
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "race", "car"};
        
        System.out.println(sol.longestCommonPrefix(strs1)); // fl
        System.out.println(sol.longestCommonPrefix(strs2)); // ""
    }
}
