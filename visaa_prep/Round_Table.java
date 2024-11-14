import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int no_of_ways = 1;
        
        for(int i=1;i<=X;i++){
            no_of_ways *= i;        }
    
        
        
    System.out.println(no_of_ways);
    }
    
}
