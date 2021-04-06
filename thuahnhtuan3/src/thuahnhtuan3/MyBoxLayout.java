/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuahnhtuan3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static javafx.scene.text.Font.font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

/**
 *
 * @author doduo
 */
public class MyBoxLayout extends JFrame{
     private static final long seriaVersionUID = 1l;
     public MyBoxLayout(String title)
     {
    JPanel pnBox = new JPanel();
    pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
    JButton btn1 = new JButton("BoxLayout");
    btn1.setForeground(Color.RED);
    Font font = new Font("Atial", Font.BOLD | Font.ITALIC , 25);
    btn1.setFont(font);
    pnBox.add(btn1);
    
    JButton btn2 = new JButton("X_AXIs");
    btn1.setForeground(Color.BLUE);
    btn1.setFont(font);
    pnBox.add(btn2);
    
    JButton btn3 = new JButton("Y_AXIs");
    btn1.setForeground(Color.ORANGE);
    btn1.setFont(font);
    pnBox.add(btn3);
    
    Container con = getContentPane();
    con.add(pnBox);
}
     public static void main(String[] args)
    {
        MyBoxLayout myUI = new MyBoxLayout("Hoc BoxLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setVisible(true);
    }
}
