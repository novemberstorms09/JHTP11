//<File name> -- Integer Multiples
//CSIS 212

package week4program1;

import java.util.Scanner;

public class week4program1 {

    
    public static void main(String [] args){
        System.out.println("Jackee Ragan - Assignment 4 Program 1\n");   
        
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
