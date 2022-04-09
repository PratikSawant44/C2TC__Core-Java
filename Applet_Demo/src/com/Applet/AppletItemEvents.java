package com.Applet;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AppletItemEvents extends Applet implements ItemListener
{
    Checkbox c1,c2,r1,r2;
    CheckboxGroup cbg;
    Label l1,l2;
    String msg1 = "", msg2 = "";
    public void init() 
    {
        l1 = new Label("Languages you know:");
        l2 = new Label("Gender:");
        c1 = new Checkbox("English");
        c2 = new Checkbox("French");
        cbg = new CheckboxGroup();
        r1 = new Checkbox("Male",cbg,false);
        r2 = new Checkbox("Female",cbg,false);
         
        c1.addItemListener(this);
        c2.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
         
        add(l1);
        add(c1);
        add(c2);
        add(l2);
        add(r1);
        add(r2);        
         
    }
    public void itemStateChanged(ItemEvent ie) 
    {
        String t1 = c1.getState()?"English ":"";
        String t2 = c2.getState()?"French":"";
        msg1 = "Languages:" + t1 + t2 ;
        String t3 = r1.getState()?"Male":"Female";
        msg2 = "gender:" + t3;
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg1, 50,200); 
        g.drawString(msg2, 50,240); 
    }
}
