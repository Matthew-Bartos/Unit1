package app;

public class App {
    public static void main( String[] args) throws Exception {
        System.out.println("Hello Java");

        System.out.println(" concatenation Practice"); 
        String firstName = "Matthew";
        String lastName = "Bartos";
        System.out.println(firstName + " " + lastName);

        System.out.println("Mad lib story");
        String person1 = "Jake";
        String person2 = "Grady";
        String verb1 = "play";
        String verb2 = "fall";
        String verb3 = "run";
        String food = "pizza";
        String dayOfWeek = "Tuesday";
        String place1 = "a bar";
        String place2 = "house";
        String adjective1 = "wet";
        String adjective2 = "hot";
        System.out.println(person1 + " is a programmer who likes to " + verb1 + ". Every " + dayOfWeek +" they make a " + adjective1 + " " + food + " for breakfast and " + verb2 + " at " + place1 + " with " + person2 + ". Sometimes, they go to the " + adjective2 + " " + place2 + " with " + person2 + " so that they can " + verb3 + " together");
    }
}