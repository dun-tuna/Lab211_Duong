/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String id;
    private String name;
    private String semeter;
    private String courseName;

    public Student(String id, String name, String semeter, String courseName) {
        this.id = id;
        this.name = name;
        this.semeter = semeter;
        this.courseName = courseName;
    }
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSemeter() {
        return semeter;
    }

    public String getCourseClass() {
        return courseName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemeter(String semeter) {
        this.semeter = semeter;
    }

    public void setCourseClass(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", semeter=" + semeter + ", courseClass=" + courseName + '}';
    }
    
}
