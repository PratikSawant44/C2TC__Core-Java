package com.Applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.Color;
import java.awt.event.MouseMotionListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
 
public class MultipleLineClass extends Applet{
    int x1,y1,x2,y2;
    MyLine[] obj = new MyLine[5];
    int i=0;
    public void init(){
        addMouseListener(new MyButtonListener());
        addMouseMotionListener(new MyButtonListener());    
 
    }
    public void paint(Graphics g){
        for(int j=0 ; j<i ; j++){
            g.setColor(Color.red);
            g.drawLine(x1,y1,x2,y2);
        }
    }
    class MyButtonListener extends MouseAdapter implements MouseMotionListener,MouseListener{
        public void mousePressed(MouseEvent e){ 
            x1 = e.getX();
            y1 = e.getY();
        }
        public void mouseDragged(MouseEvent e){
            x2 = e.getX();
            y2 = e.getY();
            obj[i] = new MyLine(x1,y1,x2,y2);
            i+=1;
            repaint();
        }
        public void mouseMoved(MouseEvent e){}
    }
 
    class MyLine{
 
        MyLine(int xx1, int yy1, int xx2, int yy2){
            x1=xx1;
            x2=xx2;
            y1=yy1;
            y2=yy2;
        }
 
    }
 
}


