import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();    
        }
        shiftArray1(arr,N);
        
    }
    
    public static void shiftArray1(int[] arr,int N){
        int temp[] = new int[N];
        for(int i=1;i<N;i++){
            temp[i-1]=arr[i];
        }
        temp[N-1] = arr[0];
        for(int i=0;i<N;i++){
            System.out.print(temp[i] + " ");
        }
    }  
}
