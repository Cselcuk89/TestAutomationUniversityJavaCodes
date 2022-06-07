import java.util.Scanner;

public class Chapter2Practice {
    public static void main(String[] args) {
        System.out.println("Enter the season of the year.");
        Scanner scan = new Scanner(System.in);
        String season = scan.next();
        System.out.println("Enter a whole number.");
        int number = scan.nextInt();
        System.out.println("Enter an adjective for weather.");
        String adjective = scan.next();
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " +
                  number + " cups of coffee");
    }
}
