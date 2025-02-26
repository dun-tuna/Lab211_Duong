/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author ADMIN
 */
public class Number {
    private String value;
    
    public String getValue(){
        return value;
    }
    public Number(String value){
        this.value=value;
    }
    public Number addTwoNum(Number other){
        return new Number(addLargNumber(this.value,other.value));
    }
    public String addLargNumber(String num1, String num2){
        int max = Math.max(num1.length(), num2.length());
        num1=String.format("s"+max, num1).replace(' ', '0');
        num2=String.format("s"+max+"s", num2).replace(' ', '0');
        StringBuilder result = new StringBuilder();
        int du=0;
        for (int i=num1.length()-1; i>=0; i--){
            int n1=num1.charAt(i)-'0';
            int n2=num2.charAt(i)-'0';
            int sum=n1+n2+du;
            result.append(sum%10);
            du=sum/10;
        }
        if(du>0)
            result.append(du);
            return result.reverse().toString();
                    
    }
//    public String mutiplyNumer(String num1, String num2){
//       int [] result = new int 
//    }
}
