import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int reversed = 0;
        
        while(N!=0){
            int digit = N % 10;
            N/=10;
            
            if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)){
                System.out.println(0);
                return;
            }
            if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)){
                System.out.println(0);
                return;
            }
            reversed = reversed * 10 +digit;
            
        }
        System.out.println(reversed);
        
    }
}
