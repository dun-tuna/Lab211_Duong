/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;
import week3.Stack.Node;
import static week3.Utils.checkNumber;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("________MENu________");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Stacks");
            System.out.println("3. Quick Sort");
            System.out.println("4. Binary Search");
            System.out.println("5. Exit");
            System.out.println("Please in put your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int size = checkNumber();
                    BubbleSort sorter = new BubbleSort(size);
                    sorter.addvalue();
                    System.out.println("Array before sort");
                    sorter.displayArray();
                    sorter.sort();
                    System.out.println("Array after sort");
                    sorter.displayArray();
                    break;
                case 2:
                    int option;
                    int capacity = checkNumber();
                    Stack aStack = new Stack(capacity);
                    do {
                        System.out.println("________MENu________");
                        System.out.println("1. Push ");
                        System.out.println("2. Pop ");
                        System.out.println("3. Get ");
                        System.out.println("4. Display ");
                        System.out.println("5. Exit ");
                        System.out.println("Please in put your option:");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                for (int i = 1; i <= capacity; i++) {
                                    int value = sc.nextInt();
                                    aStack.push(value);
                                }
                                break;
                            case 2:
                                aStack.pop();
                                break;
                            case 3:
                                Stack.Node val = aStack.get();
                                System.out.println(val.data);
                                break;
                            case 4:
                                aStack.traverse();
                                break;
                            case 5:
                                System.out.println("Exiting.....");
                                break;
                            default:
                                System.out.println("Your options is INVALID !");
                        }
                    } while (option != 5);
                case 3:
                    size = checkNumber();
                    QuickSort qSort = new QuickSort(size);
                    qSort.addValue();
                    System.out.println("Array before sort");
                    qSort.displayArray();
                    qSort.sort();
                    System.out.println("Array after sort");
                    qSort.displayArray();
                    break;
                case 4:
                    size = checkNumber();
                    QuickSort bSort = new QuickSort(size);
                    bSort.addValue();
                    bSort.sort();
                    System.out.println("Array after sort");
                    bSort.displayArray();
                    System.out.println("Input value you want to search:");
                    int check = sc.nextInt();
                    FindBinary bSearch = new FindBinary(size);
                    bSearch.a = bSort.getArray();
                    int index = bSearch.search(check);

                    if (index != -1) {
                        System.out.println("Value found at index: " + index);
                    } else {
                        System.out.println("Value not found.");
                    }

            }

        } while (choice != 5);
    }
}
