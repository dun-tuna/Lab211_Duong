/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class StudentMangement {

    private List<Student> studentList = new ArrayList<>();

    private boolean checkStudent(Student st) {
        if (studentList == st) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addStudent(Student st) {
        if (checkStudent(st)) {
            studentList.add(st);
            return true;
        }
        return false;
    }

    public void displayStudent() {
        for (Student st : studentList) {
            System.out.println(st.toString());
        }
    }

    public List<Student> findStudnet(String name) {
        List<Student> listSt = new ArrayList<>();
        for (Student st : studentList){
            if(st.getName().equalsIgnoreCase(name)){
                listSt.add(st);
            }
        }
        return listSt;
    }

    public int removeStudent(String id) {
       int count=0;
       Iterator<Student> iterator = studentList.iterator();
       while(iterator.hasNext()){
           if(iterator.next().getId().equals(id)){
               iterator.remove();
               count++;
           }
       }
       return count;
    }

    public boolean updateStudent(Student st) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(st.getId())) {
                studentList.set(i, st);
                return true;
            }
        }
        return false;
    }

    public void sortStudent() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
    }

    public void report() {
     Map<String, Integer> report= new HashMap<>();
     for (Student st : studentList){
         String key = st.getId()+"|"+st.getName()+"|"+st.getSemeter()+"|"+st.getCourseClass();
         report.put(key, report.getOrDefault(key, 0)+1);
     }
     for(Map.Entry<String,Integer> entry : report.entrySet()){
         System.out.println(entry.getKey()+ "|"+ entry.getValue());
     }
    }
}
