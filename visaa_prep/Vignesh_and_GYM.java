import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        
        
            if(X+Y<=Z){
                System.out.println("2");
            }
            else if(X>Z){
                System.out.println("0");
            }
            
            else{
                System.out.println("1");
            }
        
       
        
    }
}
