import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int bill_price = sc.nextInt();
        
        int percentage = (int)(0.10 * bill_price);
        int discount = 100;
         
        int max_discount = Math.max(percentage, discount);
        
        
        System.out.println(bill_price - max_discount);
        
        sc.close();
        
    }
}
