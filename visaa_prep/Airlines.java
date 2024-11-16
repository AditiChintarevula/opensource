import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        
        int planes_needed = (int)Math.ceil(N/100.0);
        
        int extra_req = Math.max(0,planes_needed - X);
        
            System.out.println(extra_req);
       
            }
}
