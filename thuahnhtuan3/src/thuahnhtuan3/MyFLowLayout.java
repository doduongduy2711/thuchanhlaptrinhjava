/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuahnhtuan3;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author doduo
 */
public class MyFLowLayout extends JFrame{
    
 private static final long seriaVersionUID = 1l;
public MyFLowLayout(String title)
{
    setTitle(title);
    JPanel pnFlow = new JPanel();
    pnFlow.setLayout(new FlowLayout());
    pnFlow.setBackground(Color.PINK);
    JButton btn1= new JButton("FlowLayout");
    JButton btn2= new JButton("Add cac control");
    JButton btn3= new JButton("Tren 1 dong");
    JButton btn4= new JButton("Het cho chua");
    JButton btn5= new JButton("Thi xouong dong");
    pnFlow.add(btn1);
    pnFlow.add(btn2);
    pnFlow.add(btn3);
    pnFlow.add(btn4);
    pnFlow.add(btn5);
    Container con=getContentPane();
    con.add(pnFlow);
    
}
public static void main(String[] args)
    {
        MyFLowLayout myUI = new MyFLowLayout("Demo FlowLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setVisible(true);
    }
}