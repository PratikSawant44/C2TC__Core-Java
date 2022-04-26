package com.Applet;

import java.awt.*;
import java.applet.*;
  
public class ThreadAppletExample extends Applet implements Runnable {
    private String display;
    private int x, y, flag;
    Thread t;
    public void init()
    {
        display = "Thread Example";
        x = 100;
        y = 100;
        flag = 1;
  
        // creating thread
        t = new Thread(this, "MyThread");
        t.start();
    }
  
    public void update()
    {
  
        x = x + 10 * flag;
        if (x > 300)
            flag = -1;
        if (x < 100)
            flag = 1;
    }
  
    public void run()
    {
  
        while (true) {
 
            repaint();
  
            update();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(display, x, y);
    }
}

