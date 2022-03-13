import java.util.Scanner;


public class Greeting {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("enter your name :");

        String username = name.nextLine();
        System.out.println("Hello " + username);
    }

}
