package com.Applet;

import java.awt.*;
import java.applet.*;

public class CheckboxTest extends Applet
{
 public void init( )
 {
  Checkbox chkShoes,chkSocks,chkShirt;
  chkShoes = new Checkbox("Shoes");
  chkSocks = new Checkbox("Socks"); 
  chkShirt = new Checkbox("Shirt");

  add(chkShoes);                
  add(chkSocks);                
  add(chkShirt);
 }
}
