
public class ThrowTest5 
{
public static void main(String[] args) 
{
try
{
  ArithmeticException a = new ArithmeticException("Hello from throw"); // Line 7
  throw a; 
}
catch(ArithmeticException ae){
   System.out.println("ArithmeticException caught: \n" +ae);
   System.out.println(ae.getMessage());
  }
 }
}
