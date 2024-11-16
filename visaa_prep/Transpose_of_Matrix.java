import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
       // int[][] result=new int[N][N];
        for(int i=0;i<N;i++)
        {   
            for(int j=0;j<N;j++){
                //result[i][j]=arr[j][i];
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }            
        
        
    }
}
