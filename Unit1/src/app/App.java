package app;

public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " can be divided");

            } else {
                System.out.println(i + "can't be divided");
            }
        }
        System.out.println("All finished");

    }
}
