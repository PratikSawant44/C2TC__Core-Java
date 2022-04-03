package com.Applet;
import java.applet.*;
import java.awt.*;

public class Applet6 extends Applet {
	Checkbox c1,c2,c3,c4;
	TextField t1;
	public void init()
	{
		setLayout(new GridLayout(5,1));
		add(c1=new Checkbox("1"));
		add(c2=new Checkbox("2"));
		add(c3=new Checkbox("3"));
		add(c4=new Checkbox("4"));
		add(t1=new TextField(15));
		
	}
	public boolean action(Event e,Object o)
	{
		int sum=0;
		boolean b;
		if(c1.getState())
		  sum=sum+1;
		if(c2.getState())
		  sum=sum+2;
		if(c3.getState())
		  sum=sum+3;
		if(c4.getState())
		  sum=sum+4;
		t1.setText(String.valueOf(sum));
		return true;
	}
	
}
