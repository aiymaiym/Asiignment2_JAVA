/* 6. Write a program to calculate the cost of a purchase, consisting of several
        notebooks and an equal number of covers for them. Below is the recommended
        screen appearance during program execution.
        Calculation of the purchase cost.
        Enter the input data:
        Price of a notebook (Tenge) -> 2.75
        Price of a cover (Tenge) -> 0.5
        Quantity of sets (pieces) -> 7
        Purchase cost: 22.75 Tenge. */
import java.util.Scanner;
public class prsctice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculation of the purchase cost.");

        System.out.print("Price of a notebook (Tenge) -> ");
        double notebookPrice = scanner.nextDouble();

        System.out.print("Price of a cover (Tenge) -> ");
        double coverPrice = scanner.nextDouble();

        System.out.print("Quantity of sets (pieces) -> ");
        int quantity = scanner.nextInt();

        double totalCost = quantity * (notebookPrice + coverPrice);

        System.out.printf("Purchase cost: %.2f Tenge.%n", totalCost);

        scanner.close();
    }
}
