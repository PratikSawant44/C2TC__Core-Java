package com.Applet;


import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class MouseDemo extends Applet implements MouseMotionListener
{    
  public void init()
  {  
    addMouseMotionListener(this);  
    setBackground(Color.white);  
  }  
  public void mouseDragged(MouseEvent me)
  {  
    Graphics g=getGraphics();  
    g.setColor(Color.black);  
    g.fillOval(me.getX(),me.getY(),5,5);  
  }  
  public void mouseMoved(MouseEvent me)
  {}  
} 
  
