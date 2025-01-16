/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author ADMIN
 */
public class ChangeBaseNumber {
    private  int input;

    public ChangeBaseNumber(int input) {
        this.input = input;
    }
    public String convertToBinary() {
        if (input == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        int number = input;

        while (number > 0) {
            int remainder = number % 2; 
            binary.insert(0, remainder); 
            number = number / 2; 
        }

        return binary.toString();
    }

    public String convertToDecimal() {
        return String.valueOf(input);
    }

    public String convertToHexadecimal() {
        if (input == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();
        int number = input;
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (number > 0) {
            int remainder = number % 16;
            hex.insert(0, hexChars[remainder]);
            number /= 16;
        }

        return hex.toString();
    }
}
class BaseConverter {
    public static int convertToDecimal(String value, int base) {
        int decimal = 0;
        int power = 1;

        for (int i = value.length() - 1; i >= 0; i--) {
            char c = value.charAt(i);
            int digit;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'f') {
                digit = c - 'a' + 10;
            } else {
                throw new NumberFormatException("Invalid character in input value");
            }

            if (digit >= base) {
                throw new NumberFormatException("Digit exceeds base");
            }

            decimal += digit * power;
            power *= base;
        }

        return decimal;
    }
}



