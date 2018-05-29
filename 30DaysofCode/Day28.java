import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<String> arrayList=new ArrayList<String>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(emailID.split("@")[1].equals("gmail.com"))
                arrayList.add(firstName);
            
        }
        Collections.sort(arrayList);
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

        scanner.close();
    }
}
