/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuahnhtuan3;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author doduo
 */
public class bt1 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Hello World!");
        myFrame.setSize(300, 150); //kích thước JFrame
        myFrame.setVisible(true);
        JLabel lbName = new JLabel();
        lbName.setText("Chào các bạn!");
        myFrame.add(lbName);// Thêm jLabel vài JFrame
    }
}

