import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        
        if(A+B >= X || B+C >= X || A+C >= X){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        
    }
}
