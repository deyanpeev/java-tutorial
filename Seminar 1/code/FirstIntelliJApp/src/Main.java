import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Enter vehicle type: ");
        String vehicle = scaner.next();
        System.out.print("Enter vehicle year: ");
        int year = scaner.nextInt();
        System.out.print("no new line.");
        System.out.println(String.format("Hello Gorublqne! Az sym  %s! Ot %d", vehicle, year));
        System.out.println("with new line.");
    }
}