import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();

        System.out.println(name+ ", Welcome to our channel");

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Wow " +name+ ", You are a big boy");
        System.out.println("Happy " +age+ "s");
    }
}