/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Utils {
        public static int isValidId(String id) {
         try{
             return Integer.parseInt(id);
         }catch(NumberFormatException e){
             throw new IllegalArgumentException("Error! ID is a digit");
         }
    }
    private static final String PHONE_REGEX = "^(\\d{10}|\\d{3}[-. ]\\d{3}[-. ]\\d{4}(?:\\s*(?:x|ext)\\s*\\d{1,5})?)$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    public static boolean isValidPhoneNumber(String input) {
        return input != null && PHONE_PATTERN.matcher(input).matches();
    }       
}
