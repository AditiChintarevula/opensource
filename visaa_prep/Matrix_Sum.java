import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[][] matrix = new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int[] row_sum = new int[N];
        int[] col_sum = new int[N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                row_sum[i] += matrix[i][j];
                col_sum[j] += matrix[i][j];
            }
        }
        
        int[] result = new int[N];
        for(int i=0;i<N;i++){
            result[i] = row_sum[i] + col_sum[i];
        }
        for(int i=0;i<N;i++){
            System.out.print(result[i] + " ");
        }
        
    }
}
