import java.util.*;
public class a2q3 
{
    static String[] k={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void lcomb(String digits, int index, String ans)
    {
        if (index==digits.length())
        {
            System.out.println(ans);
            return;
        }
        char currDigit=digits.charAt(index);
        String m=k[currDigit - '0'];

        for(int i=0;i<m.length();i++)
        {
            char currChar=m.charAt(i);
            lcomb(digits, index+1, ans+currChar);
        }
    }
    public static void main(String args[])
    {
        String digits="79";
        lcomb(digits,0,"");
    }
}
