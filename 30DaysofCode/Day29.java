import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static int findMaximum(int a, int k){
        int max = 0;
        for(int i=1;i<=a;i++)
        {
            for(int j=i+1;j<=a;j++)
            {    
               if((i&j)<k)
                   max=Math.max(i&j,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println( findMaximum(n, k) );
        }
        in.close();
    }
}
