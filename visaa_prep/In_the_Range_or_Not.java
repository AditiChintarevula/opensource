import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] X = new int[T];
        
        for(int i=0;i<T;i++){
            X[i]=sc.nextInt();
        }
        
        for(int i=0;i<T;i++){
            if(X[i]>=67 && X[i]<=45000){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        
    }
}
