package week1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("________MENu________");
            System.out.println("1.Liner Search");
            System.out.println("2.Count Letter And Character");
            System.out.println("3.Change Base Of Number");
            System.out.println("4.Solving Equation");
            System.out.println("5. Exit");
            System.out.println("Please in put your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = scanner.nextInt();
                    LinerSearch linerSearch = new LinerSearch(size);
                    linerSearch.addvalue();
                    System.out.print("Enter the number to search: ");
                    int number = scanner.nextInt();
                    System.out.println("Generated array: ");
                    linerSearch.displayArray();
                    int index = linerSearch.searchValue(number);
                    if (index != -1) {
                        System.out.println("Value " + number + " found at index: " + index);
                    } else {
                        System.out.println("Value " + number + " not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your content: ");
                    String text = scanner.nextLine();
                    LetterCharacterCount count = new LetterCharacterCount(text);
                    System.out.println(count.countWords());
                    System.out.println(count.countCharacters());
                    break;
                case 3:
                    boolean isRunning = true;
                    while (isRunning) {
                        System.out.println("Choose the input base system:");
                        System.out.println("1. Binary");
                        System.out.println("2. Decimal");
                        System.out.println("3. Hexadecimal");
                        int inputBase = scanner.nextInt();

                        System.out.println("Choose the output base system:");
                        System.out.println("1. Binary");
                        System.out.println("2. Decimal");
                        System.out.println("3. Hexadecimal");
                        int outputBase = scanner.nextInt();

                        System.out.println("Enter the input value:");
                        String inputValue = scanner.next();

                        // Convert input value to decimal
                        int decimalValue;
                        try {
                            switch (inputBase) {
                                case 1: 
                                    decimalValue = BaseConverter.convertToDecimal(inputValue, 2);
                                    break;
                                case 2: 
                                    decimalValue = BaseConverter.convertToDecimal(inputValue, 10);
                                    break;
                                case 3: 
                                    decimalValue = BaseConverter.convertToDecimal(inputValue, 16);
                                    break;
                                default:
                                    System.out.println("Invalid input base system.");
                                    continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input value: " + e.getMessage());
                            continue;
                        }
                        ChangeBaseNumber converter = new ChangeBaseNumber(decimalValue);
                        String outputValue;
                        switch (outputBase) {
                            case 1: 
                                outputValue = converter.convertToBinary();
                                break;
                            case 2: 
                                outputValue = converter.convertToDecimal();
                                break;
                            case 3: 
                                outputValue = converter.convertToHexadecimal();
                                break;
                            default:
                                System.out.println("Invalid output base system.");
                                continue;
                        }

                        System.out.println("Equivalent output value: " + outputValue);
                        System.out.println("Do you want to continue? (yes/no):");
                        String option = scanner.next().toLowerCase();
                        if (!option.equals("yes")) {
                            isRunning = false;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter a,b,c following form ax^2+b^x+c=0 : ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    SolvingEquation solve = new SolvingEquation(a, b, c);
                    solve.calculate(a, b, c);
                    break;
            }

        } while (choice != 5);
    }
}
