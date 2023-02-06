//Michael Schomp
//Programming and Data Structures Assignment 1

import java.util.*;

public class Gradecounter{
    public static void main(String[] args){
    // initialize variables
    int grade = 0;
    int gradeCount = 0;
    int gradeA = 0;
    int gradeB = 0;
    int gradeC = 0;
    int gradeD = 0;
    int gradeF = 0;

    //create scanner object
    Scanner kb = new Scanner(System.in);

    //prompt for grade inputs so long as the grade is not the sentinel value and increment based on grade
    //when -1 is entered, break the loop and print the counters
    while(grade > -1){
        System.out.println("Enter a grade or enter -1 to stop inputting grades:  ");
        grade = kb.nextInt();
        if(grade >= 90 && grade <= 100){
            gradeA++;
            gradeCount++;
        }
        else if (grade >= 80 && grade <= 89){
            gradeB++;
            gradeCount++;
        }
        else if (grade >= 70 && grade <= 79){
            gradeC++;
            gradeCount++;
        }
        else if (grade >= 60 && grade <= 69){
            gradeD++;
            gradeCount++;
        }
        else if (grade >= 0 && grade <= 59){
            gradeF++;
            gradeCount++;
        }
        else if (grade == -1){
            break;
        }
      

        else System.out.println("ERROR: Please Enter A Valid Grade:");
     }

     System.out.println("Total number of grades: " + gradeCount);
     System.out.println("Total number of A's: " + gradeA);
     System.out.println("Total number of B's: " + gradeB);
     System.out.println("Total number of C's: " + gradeC);
     System.out.println("Total number of D's: " + gradeD);
     System.out.println("Total number of F's: " + gradeF);
     

     kb.close();
  }
  
}

