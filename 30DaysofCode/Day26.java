import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();int month=in.nextInt();int year=in.nextInt();
        Date actualDate=new Date(year, month-1, day);
        day=in.nextInt(); month=in.nextInt(); year=in.nextInt();
        Date expectedDate=new Date(year, month-1, day);
        
        if(actualDate.compareTo(expectedDate)<=0)
            System.out.println(0);
        else{
            if(actualDate.getMonth()==expectedDate.getMonth()&&actualDate.getYear()==expectedDate.getYear())
                System.out.println(15*(actualDate.getDate()-expectedDate.getDate()));
            else if(actualDate.getYear()==expectedDate.getYear())
                System.out.println(500*(actualDate.getMonth()-expectedDate.getMonth()));
            else
                System.out.println(10000);

        }
        
    }
}