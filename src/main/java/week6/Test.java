/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.math.BigInteger;

/**
 *
 * @author ADMIN
 */
public class Test {  
    public static void main(String[] args){
     BigInteger num1 = new BigInteger("4284392348");
     BigInteger num2 = new BigInteger("1258735478");
     BigInteger sum= num1.add(num2);
     System.out.println("sum1: "+sum.toString());
     Number n1= new Number("100");
     Number n2 = new Number("100");
     Number su= n1.addTwoNum(n2);
     System.out.println("Sum2: "+su.getValue());
  }
}