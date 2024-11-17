import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        String result = "";
        int count = 1;
        
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }
            else{
                result+= input.charAt(i-1)+String.valueOf(count);
                count = 1;
            }
        }
        
        result += input.charAt(input.length()- 1) + String.valueOf(count);
        System.out.println(result);
    }
}
