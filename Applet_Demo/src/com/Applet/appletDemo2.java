package com.Applet;
import java.applet.Applet;
import java.awt.*;
import java.awt.*;

public class appletDemo2 extends Applet {
	Button b;
	TextField t;
	public void init() {
		b= new Button("First Name");
		add(b);
		t= new TextField(25);
		add(t);
		b= new Button("Middle Name");
		add(b);
		t= new TextField(25);
		add(t);
		b= new Button("Surname");
		add(b);
		t= new TextField(25);
		add(t);
	}
     
}
