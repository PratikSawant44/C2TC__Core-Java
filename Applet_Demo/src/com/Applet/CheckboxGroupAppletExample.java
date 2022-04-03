package com.Applet;

import java.awt.*; 
import java.awt.event.*; 
import java.applet.Applet;  
public class CheckboxGroupAppletExample extends Applet implements ItemListener 
   {  
        Checkbox cb1,cb2,cb3,cb4,cb5,c1,c2,c3; 
        CheckboxGroup cbg1,cbg2; 
        TextField t; 
        Label l; 
        public void init() 
          {  
               setLayout(new GridLayout(3,2,1,1)); 
               Panel p1= new Panel(); 
               Panel p2= new Panel(); 
               Panel p3= new Panel(); 
               Panel p4= new Panel(); 
               p1.setLayout(new GridLayout(3,1)); 
               p2.setLayout(new GridLayout(2,1)); 
               p3.setLayout(new GridLayout(3,1)); 
               p4.setLayout(new GridLayout(1,2)); 
               cbg1= new CheckboxGroup(); 
               cbg2= new CheckboxGroup(); 
               cb1= new Checkbox("Breakfast...Rs. 35",cbg1,false); 
               cb2= new Checkbox("Lunch...Rs. 60",cbg1,false); 
               cb3= new Checkbox("Dinner...Rs. 70",cbg1,false); 
               cb4= new Checkbox("Cold COffee...Rs. 12",cbg2,false); 
               cb5= new Checkbox("Hot Coffee...Rs. 10",cbg2,false); 
              
               p1.add(cb1); 
               p1.add(cb2); 
               p1.add(cb3); 
               p2.add(cb4); 
               p2.add(cb5); 
               c1= new Checkbox("Green salad...Rs. 15"); 
               p3.add(c1); 
               c1.addItemListener(this); 
               c2= new Checkbox("Soup...Rs. 25"); 
               p3.add(c2); 
               c2.addItemListener(this); 
               c3= new Checkbox("Curd...Rs. 10"); 
               p3.add(c3); 
               c3.addItemListener(this); 
               l= new Label("Bill is"); 
               p4.add(l); 
               t= new TextField(10); 
               p4.add(t); 
               add(p1); 
               add(p2); 
               add(p3); 
               add(p4); 
               cb1.addItemListener(this); 
               cb2.addItemListener(this); 
               cb3.addItemListener(this); 
               cb4.addItemListener(this); 
               cb5.addItemListener(this); 
           } 
              public void itemStateChanged(ItemEvent e) 
                  {  
                         int amt=0; 
                        if(cbg1.getSelectedCheckbox()==cb1) 
                           { 
                              amt=amt+35; 
                           } 
                              if(cbg1.getSelectedCheckbox()==cb2) 
                           { 
                              amt=amt+60; 
                           } 
                              if(cbg1.getSelectedCheckbox()==cb3) 
                           { 
                              amt=amt+70; 
                           } 
                              if(cbg2.getSelectedCheckbox()==cb4) 
                           { 
                              amt=amt+12; 
                           } 
                              if(cbg2.getSelectedCheckbox()==cb5) 
                           { 
                               amt=amt+10; 
                           } 
                               if(c1.getState()) 
                           { 
                               amt=amt+15; 
                           } 
                               if(c2.getState()) 
                           { 
                               amt=amt+25; 
                           } 
                               if(c3.getState()) 
                           { 
                               amt=amt+10; 
                           } 
                               t.setText(String.valueOf(amt));                                                  }                                                                                          
   }  
