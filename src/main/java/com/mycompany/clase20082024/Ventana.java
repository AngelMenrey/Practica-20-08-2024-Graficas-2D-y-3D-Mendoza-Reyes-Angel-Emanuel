package com.mycompany.clase20082024;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    private JPanel jpanel;
    public Ventana(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setTitle("Figuras");
        jpanel = new JPanel();
        setContentPane(jpanel);
        jpanel.setLayout(null);
        setBounds(0,0,800, 600);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.drawLine(0,70,100,70);
        g.drawRect(150, 70, 50, 70);
        g.drawRoundRect(250, 70, 50, 70, 6, 6);
        g.drawOval(350, 70, 50, 70);
        int [] vx1 = {500,550,450};
        int [] vy1 = {70,120,120};
        g.drawPolygon(vx1, vy1 , 3);
        
        g.setColor(Color.RED);
        g.fillRect(150, 270, 50, 70);
        g.fillRoundRect(250, 270, 50, 70, 6, 6);
        g.fillOval(350, 270, 50, 70);
        int [] vx2 = {500, 550, 450};
        int [] vy2 = {270, 320, 320};
        g.fillPolygon(vx2, vy2, 3);
                
    }
    
}
