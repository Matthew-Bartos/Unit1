package app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

      Scanner input = new Scanner(System.in); 

  
        System.out.println("Type a number");
        double numOne = input.nextDouble();
       
        System.out.println("Type a number");
        double numTwo = input.nextDouble();

        System.out.println( numOne +  numTwo + " is your answer if added"  );
        
       System.out.println( numOne +- numTwo + " is your answer if subtracted ");

       System.out.println( numOne *  numTwo + " is your answer if multiplied ");
       
       System.out.println(numOne /  numTwo + " is your answer  if divided "); 
    }

    
}

