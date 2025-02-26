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
public class OnlineCourse extends Course{
    private String plattform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        this.plattform = "";
        this.instructors ="";
        this.note = "";
    }
    public void inputAll(String i, String na, int cr,String pf, String in, String nt){
        super.inputAll(i,na,cr);
        plattform=pf;
        instructors=in;
        note=nt; 
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Platform:%s - Instructor:%s - Note:%s ", plattform, instructors ,note);
    }

    public void setPlattform(String plattform) {
        this.plattform = plattform;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getPlattform() {
        return plattform;
    }

    public String getInstructors() {
        return instructors;
    }

    public String getNote() {
        return note;
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
    
}
