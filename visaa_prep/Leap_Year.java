import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        if(year%4==0 && (year%400==0 || year% 100!=0)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
