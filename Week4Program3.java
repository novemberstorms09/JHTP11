//<File name> -- Computer Assisted Instructions
//CSIS 212

package week4program3;

import java.security.SecureRandom;
import java.util.Scanner;

public class Week4Program3 {

      
    public static void main(String[] args) {
    System.out.println("Jackee Ragan - Assignment 4 Program 3\n");   

    Scanner input = new Scanner(System.in);
    SecureRandom rando = new SecureRandom();

    //Declare variables
        int firstInt = rando.nextInt(9);
        int secondInt = rando.nextInt(9);
        int answer = (firstInt * secondInt);

    //output question to ask the user to multiply those integers
        System.out.println(firstInt);
     System.out.println(secondInt);

    //check the answer that was input for accuracy
     do {
         System.out.println("How much is " + firstInt + " times " + secondInt + "?"); 
         answer  = input.nextInt();

    if (answer != firstInt * secondInt) {
         System.out.printf("Try Again%n");
    }
    else {
        System.out.printf("Very Good%n"); 
        System.out.println("How much is " + rando.nextInt(9) + " times " + rando.nextInt(9) + "?"); 
     answer  = input.nextInt();
  }
  } while(true);
} }

