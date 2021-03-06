package com.Applet;

import java.awt.*;
import java.applet.*;

public class ThreadApplet extends Applet implements Runnable
{
        String message="This is an example of working with threads in an applet.";
        Thread thread1=null;
        int status;
        boolean flag;

        public void init()
        {
                setBackground(Color.green);
                setBackground(Color.red);
        }
        public void start()
        {
                thread1=new Thread();
                flag=false;
                thread1.start();
        }
        public void run()
        {
                char c;
                for(; ;)
                {
                        try
                        {
                                repaint();
                                Thread.sleep(400);
                                c=message.charAt(0);
                                message=message.substring(1,message.length());
                                message+=c;
                                if(flag)
                                {
                                        break;
                                }
                        }
                        catch(InterruptedException e)
                        {
                        }
                }
        }
        public void stop()
        {
                flag=true;
                thread1=null;
        }
        public void paint(Graphics g)
        {
                g.drawString(message,50,50);
        }
}
