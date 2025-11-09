package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class HelperUtils {
//     Null Check Methods (Overloaded) -->
    public static boolean isNull(Object obj){
        return true;
    }
    public static boolean isNull(String str){
        if(str.isEmpty() || str==null){
            return true;
        }
        return false;
    }
    public static boolean isNotNull(Object obj){
        return true;
    }
    public static boolean isNotNull(String str){
        if(str.isEmpty() || str==null){
            return false;
        }
        return true;
    }
//    String Validation Methods (Overloaded)
    public static boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    } //InputHandler
    public static boolean isValidString(String str, int minLength) {
        return str != null && str.length() >= minLength;
    }//Entity
    public static boolean isValidString(String str, int minLength, int maxLength) {
        return str != null && str.length() >= minLength && str.length() <= maxLength;
    }//Entity
    public static boolean isValidString(String str, String regex) {
        return str != null && str.matches(regex);
    }//Entity
//    ID Generation Methods (Overloaded)
    public static String generateId() {
        return UUID.randomUUID().toString();
    }//Entity
    public static String generateId(String prefix) {
        int randomNum = (int) (Math.random() * 100000); // 5-digit random number
        return prefix + "-" + randomNum;
    }
    public static String generateId(String prefix, int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return prefix + "-" + sb;
    }
    public static String generateId(String prefix, String suffix) {
        int randomNum = (int) (Math.random() * 100000);
        return prefix + "-" + randomNum + "-" + suffix;
    }
//Numeric Validation Methods (Overloaded)
    public static boolean isValidNumber(int num, int min, int max) {
        System.out.println(num >= min && num <= max);
        return num >= min && num <= max;
    }//InputHandler
    public static boolean isValidNumber(double num, double min, double max) {
        return num >= min && num <= max;
    }//InputHandler
    public static boolean isPositive(int num) {
        return num > 0;
    }
    public static boolean isPositive(double num) {
        return num > 0.0;
    }
    public static boolean isNegative(int num) {
        return num < 0;
    }
    public static boolean isNegative(double num) {
        return num < 0.0;
    }
//Input Validation Methods (Overloaded)
    public static boolean isValidAge(int age) {
        return age > 0 && age < 120;
    }//InputHandler

    public static boolean isValidAge(LocalDate dateOfBirth) {
        if (dateOfBirth == null) return false;

        LocalDate today = LocalDate.now();
        if (dateOfBirth.isAfter(today)) return false; // Future date not valid

        int age = Period.between(dateOfBirth, today).getYears();
        return age > 0 && age < 120;
    }//InputHandler




}
