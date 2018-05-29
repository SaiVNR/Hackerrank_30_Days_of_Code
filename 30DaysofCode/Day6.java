import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        for(int j=0;j<test;j++)
        {
            String s=scanner.next();
            //Even Case
            for(int i=0;i<s.length();i+=2)System.out.print(s.charAt(i));
            System.out.print(" ");
            //Odd case
            for(int i=1;i<s.length();i+=2)System.out.print(s.charAt(i));
            System.out.println();
        }
    }
}