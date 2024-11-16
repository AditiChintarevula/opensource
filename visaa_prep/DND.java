import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int sum_div = 0;
        int sum_nondiv = 0;
        for(int i=0;i<N;i++){
            if(arr[i] % m == 0){
                sum_div += arr[i];
            }
            else{
                sum_nondiv += arr[i];
            }
        }
        
        System.out.println(sum_div - sum_nondiv);
    }
}
