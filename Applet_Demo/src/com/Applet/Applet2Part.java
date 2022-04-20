package com.Applet;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Applet2Part extends Applet {
	Button b1,b2;
	TextField t;
	public void init() {
		add (b1=new Button("Click"));
		add (t=new TextField(15));
		add(b2=new Button ("Clear"));
		H h=new H();
		h.takeRef(this);
		b1.addActionListener(h);
		b2.addActionListener(new I(this));
	}

}
class H implements ActionListener{
	Applet2Part a;
	public void takeRef(Applet2Part a) {
		a-ap;
	}
	public void ActionPerformed(ActionEvent e) {
		a.t.setText("Hello World");
	}
	
}
class I implements ActionListener{
	Applet2Part ap;
	public I(Applet2Part ap) {
	}
	public void takeRef(Applet2Part ap) {
		this.a-ap;
	}
	public void ActionPerformed(ActionEvent e) {
		a.t.setText("");
	}
	
}