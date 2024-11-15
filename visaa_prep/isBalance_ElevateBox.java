import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] A = new int[N];
        
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        int totalSum =0;
        for(int i=0;i<N;i++){
            totalSum += A[i];
        }
        
        int[] B = new int[N];
        int left_weight = 0;
        
        for(int i=0;i<N;i++){
            int right_weight = totalSum - left_weight - A[i];
            B[i] = Math.abs(left_weight - right_weight);
            
            left_weight += A[i];
        }
        
        for(int i=0;i<N;i++){
            System.out.print(B[i] + " ");
        }
        
        
        
    }
}
