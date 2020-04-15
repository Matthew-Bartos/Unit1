package app;

public class App {
    public static void main( String[] args) throws Exception {
        System.out.println("Hello Java");

        System.out.println("while loops");
        int count = 0;
        String color = "blue";

        while (count < 10) {
            System.out.println("the count is" + count);
            count = count + 1;
        }
        System.out.println("count finished");
        while (color == "red"){
            System.out.println("the color is" + color);
            color = "green";

        }
        boolean livesInWisconsin = true;
        while (livesInWisconsin == true) {
            
            System.out.println("i dont live in wisconsin");
            livesInWisconsin = (false);
            System.out.println(livesInWisconsin);
            
        }
    }
}