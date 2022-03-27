package com.Applet;
import java.awt.*;
import java.applet.*;
public class AppletDemo8 extends Applet
{
     String msg="";
     public void init()
    {
         msg="Hello Pratik";
     }
  
     public void start()
     {
         msg=msg+",Welcome to Java Applet";
     }
  
     public void paint(Graphics g)
     {
         g.drawString(msg,50,50);
     }
}
