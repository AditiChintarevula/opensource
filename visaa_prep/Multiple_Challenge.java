import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        long div_3 = N / 3;
        long div_5 = N / 5;
        long div_3n5 = N /15;       
        System.out.println(div_3 + div_5 - div_3n5);
    }
}
