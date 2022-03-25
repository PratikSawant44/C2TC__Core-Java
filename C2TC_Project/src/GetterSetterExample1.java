
 class Addition
 { 
   private int x, y, z; 
   
 public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getZ() {
	return z;
}

public void setZ(int z) {
	this.z = z;
}

void sum() { 
   int s = x + y + z; 
   System.out.println("Sum: " +s); 
  }
 } 
public class GetterSetterExample1 { 
public static void main(String[] args) 
{ 
 Addition a = new Addition(); 
   a.setX(10); 
   a.setY(20); 
   a.setZ(30); 
   a.sum(); 
 } 
}