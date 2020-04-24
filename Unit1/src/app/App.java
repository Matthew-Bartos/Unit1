package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for (int i = 1; i <=10; i++) {
            if (i == 5) {
               
                System.out.println("five");
                
                }

             else {
                System.out.println(i);
            }
        }
        
        System.out.println("End first loop");
        System.out.println("start second loop");

        for (int i = 100; i <= 201; i = i + 10 ) {
           if  (i <= 150){
            System.out.println(i);
           }
            
            if (i >= 150 ) {
                
                
                while (i <= 160) {
                    System.out.println(i);
                    i ++;
                }




        }
        
        if (i >= 160) {
             System.out.println(i - 1);   
            }
        
            
    }
        System.out.println("End second loop");
        
  
  
  
  
  
    }  
}

