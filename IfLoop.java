//Maria Molina
//Lab 9: IfLoop.java 
//I assert that the program I am submitting is the result of my own efforts. 

import java.util.Scanner; 
import java.text.DecimalFormat; 

public class IfLoop 
{
    public static void main (String[] args) 
    {
      int countGood = 0; 
      int countBad = 0; 
      int numStud = 0; 
      String sname;
      
      Scanner scan = new Scanner (System.in); 
      DecimalFormat books = new DecimalFormat("0.00"); 
      
      Box myBox = new Box (9); 
      Calc myCalc = new Calc (); 
      
      System.out.println("Please enter the number of students as an integer: ");  
      numStud = scan.nextInt(); 
      scan.nextLine();   
      System.out.println("Number of students is: " + numStud + "."); 
      
      while (0 < numStud)
      {
         System.out.println("Please enter the student's first and last name in one line and hit enter: "); 
         sname = scan.nextLine(); 
      
         System.out.println("Please enter the student's grade in the xx.xx format and hit enter: "); 
         double sgrade = scan.nextDouble();
         scan.nextLine(); 
      
         System.out.println(sname); 
         System.out.println(books.format(sgrade)); 
      
      
      if (80 > sgrade) 
      {
         System.out.println("Sudent " + sname + " does not belong in the group of student's being processed.");  
         countBad = countBad + 1;  
      } 
      if (80 <= sgrade) 
      {
         String prtgrade = myCalc.calculate(sgrade); 
         countGood = countGood + 1;  
         
         LetterB myLetter = new LetterB (sname, prtgrade, sgrade); 
         System.out.println(myLetter); 
      }
      
      numStud = numStud - 1; 
      
    }
     System.out.println(countGood + " " + countBad); 
     System.out.println(myBox); 
}
}
         
      
      
      
       
