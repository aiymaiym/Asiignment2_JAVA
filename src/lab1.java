/* 15. Taxes. Determine the number and amount of tax payments of an individual for the
year, taking into account income from the main and additional places of work, royalties, sales of
property, receiving gifts of money and property, transfers from abroad, benefits for children and
financial assistance. Sort taxes by amount. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lab1{
    public static double calculateTax(double income, double taxRate) {
        return income * taxRate;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> taxes = new ArrayList<>();

        double mainJobTaxRate = 0.13;
        double additionalJobTaxRate= 0.13;
        double royaltyTaxRate = 0.10;
        double propertySaleTaxRate = 0.15;
        double giftTaxRate = 0.20;
        double transferTaxRate = 0.18;
        double childBenefitTaxRate = 0.0;
        double financialAidTaxRate = 0.0;

        System.out.print("Main job; ");
        double mainJobIncome = scanner.nextDouble();
        taxes.add(calculateTax(mainJobIncome, mainJobTaxRate));

        System.out.print("Additional job: ");
        double additionalJobIncome = scanner.nextDouble();
        taxes.add(calculateTax(additionalJobIncome, additionalJobTaxRate));

        System.out.print("Royalty: ");
        double royaltyIncome = scanner.nextDouble();
        taxes.add(calculateTax(royaltyIncome, royaltyTaxRate));

        System.out.print("Property; ");
        double propertySaleIncome = scanner.nextDouble();
        taxes.add(calculateTax(propertySaleIncome, propertySaleTaxRate));

        System.out.print("Gift: ");
        double giftIncome = scanner.nextDouble();
        taxes.add(calculateTax(giftIncome, giftTaxRate));

        System.out.print("Transfer:  ");
        double transferIncome = scanner.nextDouble();
        taxes.add(calculateTax(transferIncome, transferTaxRate));

        System.out.print("Children:  ");
        double childBenefitIncome = scanner.nextDouble();
        taxes.add(calculateTax(childBenefitIncome, childBenefitTaxRate));

        System.out.print("financialaid ");
        double financialAidIncome = scanner.nextDouble();
        taxes.add(calculateTax(financialAidIncome, financialAidTaxRate));

        taxes.removeIf(tax -> tax <= 0);

        taxes.sort(Collections.reverseOrder());
        double total = 0;
        for (double tax : taxes) {
            total += tax;
        }
        System.out.println();
        for (double tax : taxes) {
            System.out.println(tax);
        }

        System.out.println("\ntaxes " + taxes.size());
        System.out.println("total " + total);
    }
}
