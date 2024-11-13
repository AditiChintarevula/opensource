import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        int[] X = new int[T];
        int[] N = new int[T];
        
        for(int i = 0; i < T; i++){
            X[i] = sc.nextInt();
            N[i] = sc.nextInt();
        }
        int[] points = new int[T];
        for(int i = 0; i < T; i++){
           // if(X[i]/10 == 0){
               points[i] = X[i]/10 * N[i];
                System.out.println(points[i]);
                
            //}
        }
    }
}
