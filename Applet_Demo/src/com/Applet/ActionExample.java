package com.Applet;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ActionExample extends Applet implements ActionListener
{

     Button okButton;
     Button wrongButton;
     TextField nameField;
     CheckboxGroup radioGroup;
     Checkbox radio1;
     Checkbox radio2;
     Checkbox radio3;

     public void init() 
     {
          setLayout(new FlowLayout());
          okButton = new Button("Action!");
          wrongButton = new Button("Don't click!");
          nameField = new TextField("Type here Something",35);
          radioGroup = new CheckboxGroup();
          radio1 = new Checkbox("Red", radioGroup,false);
          radio2 = new Checkbox("Blue", radioGroup,true);
          radio3 = new Checkbox("Green", radioGroup,false);
          add(okButton);
          add(wrongButton);
          add(nameField);
          add(radio1);
          add(radio2);
          add(radio3);

          okButton.addActionListener(this);
          wrongButton.addActionListener(this);
         }  
         public void paint(Graphics g)
         {
          if (radio1.getState()) g.setColor(Color.red);
        else if (radio2.getState()) g.setColor(Color.blue);
          else g.setColor(Color.green);

          g.drawString(nameField.getText(),20,100);
         }

        public void actionPerformed(ActionEvent evt) 
         {
              if (evt.getSource() == okButton) 
                   repaint();
          else if (evt.getSource() == wrongButton) 
          {
               wrongButton.setLabel("Not here!");
               nameField.setText("That was the wrong button!");
               repaint();
          }
     } 

}
