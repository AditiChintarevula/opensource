import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int Z_hours = Z * 24;
        int Z_mins = Z_hours * 60;
        
        if(X * Y <= Z_mins  ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
