public class StudentMarks {
public static void main(String[] args) 
{
  String[ ] str = {"Deep", "Amit","Larry"}; // One dimensional array.	
  int[ ][ ] marks = new int[3][5]; // Two dimensional array.

// Allocating memory for marks obtained in three subjects by student Deep.
    marks[0][0] = 80;
    marks[0][1] = 97;
    marks[0][2] = 80;
// Allocating memory for marks obtained in three subjects by student Amit.
    marks[1][0] = 99;
    marks[1][1] = 98;
    marks[1][2] = 100;
// Allocating memory for marks obtained in three subjects by student Larry.   
    marks[2][0] = 87;
    marks[2][1] = 99;
    marks[2][2] = 93;
   
for(int i = 0; i < marks.length; i++)
{
int total = 0;	
 for(int j = 0; j < marks.length; j++)
 {
    total = total + marks[i][j]; 
 }
 for(int k = 0; k < str.length; k++)
 {
   System.out.println("Total marks obtained by student " +str[k]+": " +total);
   double perc = (double)total/3;
   System.out.println("Percentage: " +perc);
 }
}}
}