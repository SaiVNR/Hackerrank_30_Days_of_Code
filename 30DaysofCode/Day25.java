import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    static boolean prime(int value)
    {
        if(value==1)return false;
        if(value==2)return true;
        if(value%2==0)return false;
        for(int i=3;i<value/2;i+=2){if(value%i==0)return false;}
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        for(int i=0;i<test;i++)
        {
            if(prime(scanner.nextInt()))System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}