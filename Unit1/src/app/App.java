package app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

      Scanner input = new Scanner(System.in); 

  
         System.out.println("Please answer the following quwstions");
          System.out.println("Is the earth round?");
      String isTheEarthRound = input.nextLine();
     if (isTheEarthRound == "yes"){
          System.out.println("incorrect");
     }

        else{
            System.out.println("correct");
        }
            
       System.out.println("are dogs marsupials?");
    String areDogsMarsupials = input.nextLine();
     if (areDogsMarsupials == "yes"){
          System.out.println("incorrect");
     }

        else{
            System.out.println("correct");
        }
         System.out.println(" we're in highschool.");
        String isInHighschool = input.nextLine();
     if (isInHighschool == "yes"){
          System.out.println("incorrect");
     }

        else{
            System.out.println("correct");
        }
             System.out.println("good job");
        
        
  
  
  
  
  
    }

    
}

