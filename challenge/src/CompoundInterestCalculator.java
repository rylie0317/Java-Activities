import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialDepositAmount;
        double annualInterestRate;
        int numberOfYears;
        double totalAmount;
        double totalInterestEarned;

        System.out.print("Enter the initial deposit amount:");
        initialDepositAmount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate:");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the number of years:");
        numberOfYears = scanner.nextInt();

        totalAmount = initialDepositAmount * Math.pow((1 + annualInterestRate/100), numberOfYears);
        totalInterestEarned = totalAmount - initialDepositAmount;

        System.out.printf("The total amount is %.2f pesos.\n ", totalAmount );
        System.out.printf("The total interest earned is %.2f pesos. ", totalInterestEarned);

    }
}
