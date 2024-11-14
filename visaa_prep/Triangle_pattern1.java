import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int currentnum = 1;
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(currentnum+" ");
                currentnum++;
            }
            System.out.println();
        }
            
    }
}
