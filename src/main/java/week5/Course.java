/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Course {
    protected String id;
    protected String name;
    protected int credit;

    public Course() {
        this.id = "";
        this.name = "";
        this.credit = 0;
    }
    public void inputAll(String i, String na, int cr){
        id=i;
        name=na;
        credit=cr;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return String.format("ID:%s - Name:%s - Credit:%d ", id, name, credit);
    }
}
