//<File name> -- Circle Area
//CSIS 212

package week4program2;

import java.util.Scanner;

public class Week4Program2 {

    public static void main(String[] args) {
    System.out.println("Jackee Ragan - Assignment 4 Program 2\n");   
    
     //Create scanner for input
     Scanner radius = new Scanner(System.in);
     int r;
     
     //Ask for the radius from the user
     System.out.print("Enter the radius of the circle in inches: ");
     
     //Output the area     
     System.out.printf("The area of the circle is %.4f inches.\n", circleArea(radius.nextDouble()));
    }
    // area = pi * radius^2
   public static double circleArea(double r) {
       return Math.PI * Math.pow(r,2);
   }
    
  
    }
    