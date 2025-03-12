/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author ADMIN
 */
public class Contact {
    private int id;
    private String name;
    private String group;
    private String address;
    private String phone;

    public Contact(int id, String name, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name + ", group=" + group + ", address=" + address + ", phone=" + phone + '}';
    }
    
    
    
}
