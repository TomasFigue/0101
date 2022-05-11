package com.mycompany.ventana030101;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Ventana030101 extends JFrame {
    
    private final ArrayList<JPanel> jPanelList= new ArrayList<>();
    

    public Ventana030101(String title,int w,int h)  {
        super(title);
        this.setSize(w, h);
        var p= new Point(200,150);
        this.setLocation(p);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }

    public Ventana030101(int w,int h)  {
        var dimension= new Dimension(w,h);
        this.setSize(dimension);
    }

     public void iniciarComponentes(){

         this.iniciarPaneles();
         
         
     }
     public void iniciarPaneles(){
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
      
        
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("panel 0"));
        
        this.jPanelList.get(1).setBackground(Color.CYAN);
        this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder("panel 1"));
        this.jPanelList.get(2).setBackground(Color.GREEN);
        this.jPanelList.get(2).setBorder(BorderFactory.createTitledBorder("panel 2"));
        this.jPanelList.get(3).setBackground(Color.RED);
        
        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
      
   
     } 
    
}
