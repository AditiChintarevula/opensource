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
        
        int count = 0;
        int max = 0;
        for(int i=0;i<N;i++){
            if(A[i]==0){
                count++;
            }
            else{
                count =0;
            }
            max= Math.max(count,max);
        }   
    System.out.print(max);
    }
    
}
