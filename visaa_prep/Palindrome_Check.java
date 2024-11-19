import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        System.out.println(palindrome(0,S));
        
    }
    
    public static String palindrome(int i,String S){
        
        if(i>=S.length()/2) {
            return "TRUE";
        }
        if(S.charAt(i)!= S.charAt(S.length()-i-1)){
            return "FALSE";
        }
        return palindrome(i+1,S);
        
    }
}
