/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanhtuan2;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 *
 * @author doduo
 */
public class bt8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        StringWriter ost = new StringWriter( );
        String s = "Xin chao, day la chuong trinh doc xuat chuoi";
        for(int i = 0; i <s.length();i++)
            ost.write(s.charAt(i));
        System.out.println("xuat chuoi: " + ost);
        StringReader inst;
        inst = new StringReader(ost.toString());
        int a = 0;
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb1 = new StringBuffer("");
        while((a = inst.read()) != -1)
            sb1.append((char)a);
        s = sb1.toString();
        System.out.println("Chieu dai chuoi doc duoc:" + s.length( ));
         System.out.println("Day la chuoi doc duoc:" );
    }
    
}