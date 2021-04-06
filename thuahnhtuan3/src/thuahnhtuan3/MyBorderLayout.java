/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuahnhtuan3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static javafx.scene.text.Font.font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author doduo
 */
public class MyBorderLayout extends JFrame{
     private static final long seriaVersionUID = 1l;
     public MyBorderLayout(String title)
     {
    JPanel pnBorder = new JPanel();
         pnBorder.setLayout(new BorderLayout());
    JPanel pnNorth= new JPanel();
         pnNorth.setBackground(Color.RED);
         pnBorder.add(pnNorth, BorderLayout.NORTH);
    JPanel pnSorth= new JPanel();
         pnSorth.setBackground(Color.RED);
         pnBorder.add(pnSorth, BorderLayout.NORTH);
    JPanel pnWest= new JPanel();
         pnWest.setBackground(Color.BLUE);
         pnBorder.add(pnWest, BorderLayout.WEST);
    JPanel pnEast= new JPanel();
         pnEast.setBackground(Color.BLUE);
         pnBorder.add(pnEast, BorderLayout.EAST);
    JPanel pnCenter= new JPanel();
         pnCenter.setBackground(Color.YELLOW);
         pnBorder.add(pnCenter, BorderLayout.CENTER);
    getContentPane().add(pnBorder);
}
     public static void main(String[] args)
    {
        MyBorderLayout myUI = new MyBorderLayout("My BoxLayout");
        myUI.setSize(500,500);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setVisible(true);
    }
}
