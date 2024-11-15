import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n>=1 && n<=15){
            
        System.out.println(factorial(n));
        
        }
        else if(n==0){
            System.out.println(1);
        }
        sc.close();
    }
    
    public static long factorial(int n){
        long result = 1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }
}
