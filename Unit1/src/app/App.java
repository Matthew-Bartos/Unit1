package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for (int i = 20; i >= 0; i--) {
            if (i == 10) {
                int x = 1;

                 while (x <= 6)  {
                System.out.println(i);
                x++;
                }

            } else {
                System.out.println(i);
            }
        }
        System.out.println("End First Loop");
        System.out.println("Start Second Loop");

        for (int i = 0; i <= 36; i = i + 4 ) {
            if (i %6 == 0) {
                System.out.println(i);
                System.out.println("Hey!");




        }
        
        else{
                System.out.println(i);
            }
            
    }
        System.out.println("End Second Loop");
    }
}
