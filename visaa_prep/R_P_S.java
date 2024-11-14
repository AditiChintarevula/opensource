import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char V = sc.next().charAt(0);
        char C = sc.next().charAt(0);
        
        if(V== C){
            System.out.println("NULL");
        }
        else if((V=='S' && C=='P') || (V=='P' && C=='R') || (V=='R' && C=='S')) {
            System.out.println("Vignesh");
        }
        else{
            System.out.println("Charan");
        }
        
    }
}
