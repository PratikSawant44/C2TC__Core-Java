package com.Applet;
import java.applet.*;
import java.awt.*;
import com.Applet.Applet7.Panel1;
import com.Applet.Applet7.Panel2;

public class Applet9 extends Applet{
	Panel1 p1;
	Panel2 p2;
	public void init()
	{
		setLayout(new GridLayout(1,2));
		add(p1=new Panel1());
		add(p2=new Panel2());
		p2.c1.setState(true);
		p2.c2.setState(true);
		p2.c3.setState(false);
		p2.t.setText("3000");
		p2.t.setEditable(false);
	}	
    public boolean action(Event e,Object o)
    {
    	if(p1.c1.getState())
    	{
    		p2.c1.setState(true);
    		p2.c2.setState(true);
    		p2.c3.setState(false);
    		p2.t.setText("3000");
    	}
    	if(p1.c2.getState())
    	{
    		p2.c1.setState(true);
    		p2.c2.setState(true);
    		p2.c3.setState(false);
    		p2.t.setText("6000");
    	}
    	if(p1.c3.getState())
    	{
    		p2.c1.setState(true);
    		p2.c2.setState(true);
    		p2.c3.setState(false);
    		p2.t.setText("9000");
    	}
    	return true;
    }
}
