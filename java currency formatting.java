import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Define locales
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // Format currency according to each locale
        String us = NumberFormat.getCurrencyInstance(usLocale).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);
        String france = NumberFormat.getCurrencyInstance(franceLocale).format(payment);
        
        // Print the formatted results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}