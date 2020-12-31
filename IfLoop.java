//Maria Molina
//Lab 9: IfLoop.java 
//I assert that the program I am submitting is the result of my own efforts. 

import java.util.Scanner; //Imports the Scanner class
import java.text.DecimalFormat; //Imports the DecimalFormat class

public class IfLoop //Creates a class
{
    public static void main (String[] args) //Creates the main method of the class
    {
      int countGood = 0; //Instantiates the integer countGood
      int countBad = 0; //Instantiates the integer countBad
      int numStud = 0; //Instantiates the integer numStud
      String sname;//Instantiates the string sname
      
      Scanner scan = new Scanner (System.in); //Instantiates an object from the Scanner class
      DecimalFormat books = new DecimalFormat("0.00"); //Instantiates an object from the DecimalFormat class
      
      Box myBox = new Box (9); //Instantiates an object of the Box class
      Calc myCalc = new Calc (); //Instantiates an object of the Calc class
      
      System.out.println("Please enter the number of students as an integer: "); //Asks the user to enter the number of students 
      numStud = scan.nextInt(); //Makes the number of students an integer
      scan.nextLine(); //Takes the user to enter the student's name  
      System.out.println("Number of students is: " + numStud + "."); //Prints the number of students 
      
      while (0 < numStud)//While loop that executes if the number of students is greater than 0
      {
         System.out.println("Please enter the student's first and last name in one line and hit enter: "); //Asks user to enter the name of the student
         sname = scan.nextLine(); //Enters the name in a string called sname 
      
         System.out.println("Please enter the student's grade in the xx.xx format and hit enter: "); //Asks the user to enter a student's grade 
         double sgrade = scan.nextDouble(); //Enters the grade in a double called sgrade 
         scan.nextLine(); //Takes the user to the next line of code 
      
         System.out.println(sname); //Prints out the name of the student
         System.out.println(books.format(sgrade)); //Prints out the grade of the student in the correct format
      
      
      if (80 > sgrade) //Loop that executes if the grade is less than 80
      {
         System.out.println("Sudent " + sname + " does not belong in the group of student's being processed."); //Prints out message 
         countBad = countBad + 1; //Adds one to the countBad counter 
      } 
      if (80 <= sgrade) //Loop that executes if the grade is greater than or equal to 80
      {
         String prtgrade = myCalc.calculate(sgrade);//Calls the myCalc object from the Calc class 
         countGood = countGood + 1; //Adds one to the countGood counter 
         
         LetterB myLetter = new LetterB (sname, prtgrade, sgrade); //Instantiates an object of the LetterB class
         System.out.println(myLetter); //Prints out the myLetter from the LetterB class
      }
      
      numStud = numStud - 1; //Subtracts one from the number of students so the loop is not infinite
      
    }
     System.out.println(countGood + " " + countBad); //Prints out countBad and countGood
     System.out.println(myBox); //Prints out myBox 
}
}
         
      
      
      
       