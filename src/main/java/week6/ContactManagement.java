/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ContactManagement {
    List<Contact> contactMana = new ArrayList<>();
    public boolean isContactAlredy(Contact c){
        return contactMana.stream().anyMatch(contact -> contact.equals(c));
    }
    public boolean addContact(Contact c){
        contactMana.add(c);
        return true;
    }
    
}
