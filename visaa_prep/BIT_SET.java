import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        int k = sc.nextInt();
        
        if((N & (1L << (k-1))) !=0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
