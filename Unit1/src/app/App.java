package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner input = new Scanner(System.in); 

      System.out.println("Please enter your first name.");
      String firstName = input.nextLine();

      System.out.println("Please enter your last name.");
      String lastName = input.nextLine();

       System.out.println("Please enter your age.");
      String age = input.nextLine();

       System.out.println("Please enter your grade.");
      String grade = input.nextLine();
      
    System.out.println("Hello, " + firstName + " " + lastName + " who is in their " + age + " year of life and is progressing through grade " + grade + ".");
     System.out.println("Please enter your passcode to continue.");
     String passcode = input.nextLine();{
          		if (passcode == "18372603"){
           System.out.println("access denied");    
          }

          else{
               System.out.println("access granted");
          }
            
      
    }
        
        
  
  
  
  
  
    }

    
}

