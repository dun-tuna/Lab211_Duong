package week4.bai2;

import java.util.Comparator;
import java.util.List;
import week4.bai2.Person;
import java.util.Scanner;

public class Student extends Person {

    private int yearOA;
    private int entranceEng;

    public Student() {
        this.yearOA = 0;
        this.entranceEng = 0;
    }

    public void inputAll(Scanner sc) {
        super.inputAll(sc);
        while (true) {
            System.out.print("Year of admission: ");
            yearOA = sc.nextInt();
            sc.nextLine();
            if (Utils.isValidYearOfAdmission(yearOA, yearOB)) {
                break;
            }
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Entrance English score: ");
            entranceEng = sc.nextInt();
            sc.nextLine();
            if (Utils.isValidEntranceEnglishScore(entranceEng)) {
                break;
            }
            System.out.println("Data input is invalid");
        }
    }

    @Override
    public String toString() {
        return super.toString() +String.format(" - %d - %d\n", yearOA, entranceEng);
    }

}
