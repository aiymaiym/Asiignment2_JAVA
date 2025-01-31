/* 7. Write a program to calculate the cost of a purchase taking into account the
discount. A 3% discount is provided if the purchase amount is more than 5,000
tenge, 5% - if the amount is more than 10,000 tenge. Below is the recommended
screen view while the program is running.
Calculation of the purchase price considering the discount.
Purchase amount (tg) -> 6400
You are given a 3% discount
//Amount including discount: 6208.00 tenge */

import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Purchase amount (tg) -> ");
        double amount = scanner.nextDouble();

        double discount = amount > 10000 ? 0.05 : amount > 5000 ? 0.03 : 0;
        System.out.printf("%s%.2f tenge%n", discount > 0 ? "You are given a " + (int)(discount * 100) + "% discount\nAmount including discount: " : "No discount available\nAmount including discount: ", amount - amount * discount);

        scanner.close();
    }
}

