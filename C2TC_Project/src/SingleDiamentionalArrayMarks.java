import java.util.Scanner;
public class SingleDiamentionalArrayMarks {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);	
    System.out.println("In how many subject have you given exams?");
    int n = sc.nextInt();
    int[ ] marks = new int[n];
   
    System.out.println("Enter your marks obtained in subjects:"); 
   for(int i = 0; i < n; i++) {
	marks[i] = sc.nextInt();
   }
   int total = 0;
   for(int i = 0; i < n; i++) {
	 total += marks[i];  
   }
     System.out.println("Total marks: " +total);
     float percentage = (float)total/n; 
     System.out.println("Percentage: " +percentage+ "%");
 }
}
