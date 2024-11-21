import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int Y[] = new int[T];
        int X[] = new int[T];
        
        for(int i=0;i<T;i++){
            Y[i] = sc.nextInt();
            X[i] = sc.nextInt();
        }
        
        for(int i=0;i<T;i++){
            System.out.println(Y[i] - X[i] + 1);
        }
        
    }
}
