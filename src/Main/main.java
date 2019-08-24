package Main;
/**
 * @author MAnavSingh
 * @version 1.0*/

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a;
        a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negetive");
        } else {
            System.out.println("The number is equal to zero");
        }
    }
}
