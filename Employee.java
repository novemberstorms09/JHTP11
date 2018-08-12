//<Week3Program1>- Employee Superclass
//<CSIS 312>
package week3program1;

public abstract class Employee {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   // constructor
public Employee(String firstName, String lastName, String socialSecurityNumber){
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
   } 

   //Getters
public String getFirstName() {
      return firstName;
   } 

public String getLastName(){
      return lastName;
   } 

public String getSocialSecurityNumber(){
      return socialSecurityNumber;
   } 

   @Override
public String toString(){
      return String.format("%s %s%nsocial security number: %s", 
        getFirstName(), getLastName(), getSocialSecurityNumber());
   } 

public abstract double earnings(); 
} 
