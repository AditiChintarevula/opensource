import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        long X_Vignesh_Money = sc.nextLong();
        long Y_Bill = sc.nextLong();
        
        if(Y_Bill > X_Vignesh_Money){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
