import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] N = new int[T];
        int[] M = new int[T];
        
        for(int i = 0 ; i < T;i++){
            N[i] = sc.nextInt();
            M[i] = sc.nextInt();
        }
        int[] result = new int[T];
        for(int i=0;i<T;i++){
            result[i] =N[i]-M[i];
            if(result[i] < 0){
                System.out.println(0);
            }else
            {
                System.out.println(Math.abs(result[i]));
            }
        }
    }
}
