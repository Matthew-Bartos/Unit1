package app;

public class App {
    public static void main( String[] args) throws Exception {
        System.out.println("Hello Java");

        System.out.println("for loops");
        int count =0;

        while (count <= 10){
            System.out.println("the count is" + count);
            count = count + 1;
        } 
    
        for (int i = 0; i <= 10; i = i +1){
            System.out.println("the count is " + i);
            System.out.println("Lets keep counting");
            
        }
        System.out.println("that was practice");

        for (int i = 10; i <= 20; i = i +1){
            System.out.println("the count is " + i);
            System.out.println("Lets keep counting");
        }

        for (int i = 10; i <= 100; i = i +5){
            System.out.println("the count is " + i);
            System.out.println("Lets keep counting");
        }

        for (int i = 1000; i <= 256000; i = i +1000){
            System.out.println("the count is " + i);
            System.out.println("Lets keep counting");
        }

        for (int i = 11; i <= 12; i = i +1){
            System.out.println("the count is " + i);
            System.out.println("Lets keep counting");
        }

        for (int i = 10; i >= 0; i = i -1){
            System.out.println("the count is " + i);
            System.out.println("Lets keep counting");
        }
        
        }
    }
