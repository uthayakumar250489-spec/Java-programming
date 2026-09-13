import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the initial number of elements
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        
        // Read the number of queries
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String action = scan.next();
            if (action.equalsIgnoreCase("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if (action.equalsIgnoreCase("Delete")) {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        
        // Print the modified list separated by spaces
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        
        scan.close();
    }
}