/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanhtuan2;
import javax.swing.JOptionPane;
public class bt6 {
    public static void main(String[] args){
        int n;
        try{
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap so nguyen:",""));//dong code gay ra Exception
        }
        catch(java.lang.NumberFormatException e1){
            //xuat ra dong "java.lang.NumberFormatException: For input string: "qbc" "
            System.out.println(e1.toString());//neu Exception xay ra dong code nay se duoc goi 
        }
        finally{
            System.out.println("Have good fun");//xuat ra dong have good fun
        }
    }
}