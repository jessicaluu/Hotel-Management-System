/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeejkoob Thao
 */
import java.awt.Toolkit;
import javax.swing.*;
public class HotelMain {
    public static void main(String[]args) {
    
        MainPanel mainPanel = new MainPanel();
        JFrame j = new JFrame();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        j.setSize(xSize,ySize);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        j.add(mainPanel);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
