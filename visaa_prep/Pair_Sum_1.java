import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        
        boolean found = false;
        for(int i=0;i<N;i++){
            for(int j=i+1;j< N;j++){
                if(arr[i]+arr[j] == k){
                    found = true;
                    break;
                }
            }
            if(found) break;
            
        }
        if(found){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
