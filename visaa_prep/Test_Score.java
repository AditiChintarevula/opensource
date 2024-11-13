import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int marks = N * X;
        if(Y % X == 0 && Y <= marks && Y>=0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
