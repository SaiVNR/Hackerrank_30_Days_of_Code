import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
            int x;
            double d1;
            String s1;
        /* Read and save an integer, double, and String to your variables.*/
            x=scan.nextInt();
            d1=scan.nextDouble();
            scan.nextLine();
            s1=scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
            System.out.println(i+x);
        /* Print the sum of the double variables on a new line. */
		  	System.out.println(d+d1);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s+s1);
        scan.close();
    }
}    
