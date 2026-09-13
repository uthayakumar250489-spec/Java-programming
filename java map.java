import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character after nextInt()
        
        // Create a HashMap to store the phone book entries
        Map<String, Integer> phonebook = new HashMap<>();
        
        // Read entries and put them into the map
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // Consume the newline character after nextInt()
            phonebook.put(name, phone);
        }
        
        // Process queries until the end of the input file
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        in.close();
    }
}