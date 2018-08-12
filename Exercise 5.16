//Integer Multiples
/*Excersise 5.16. Write a method isMutliple 
that determines, for a pair of integers, 
whether the second integer is a multiple of 
the first. The method will take 2 integer 
arguments and return true if the second is
a multiple of the first and false otherwise. 
[Hint: Use the remainder operator]. Incorporate 
this method into an application that inputs a 
series of pairs of integers (1 pair at a time) 
and determines whether the second value in each 
pair is a multiple of the first. */

package week4program1;

import java.util.Scanner;

public class week4program1 {

    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        //Ask for user input
        while(true){
            System.out.println("Enter two numbers to see if the second is a mulitple of the first. Press enter after entering each number.\n");
            int firstInt = sc.nextInt();
            int secondInt = sc.nextInt();
            
         //Output if it is a multiple or not
         
            System.out.printf("Is it true or false that %d is a multiple of %d? %n %s\n", firstInt, secondInt,(isMultiple(firstInt, secondInt) == true) ? "True" : "False");
            break;
    }}
            //Declare isMultiple method to give value to "true" or "false"
            public static boolean isMultiple(int firstInt, int secondInt){
            return (secondInt % firstInt == 0) ? true : false;
}}
