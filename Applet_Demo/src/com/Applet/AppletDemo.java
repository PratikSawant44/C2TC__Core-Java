package com.Applet;
import java.applet.*;
import java.awt.*;
public class AppletDemo extends Applet {
	Button b;
	TextField t;
	public void init()
	{
		b= new Button("SUBMIT");
		add(b);
		t= new TextField(10);
		add(t);
		
	}

}
